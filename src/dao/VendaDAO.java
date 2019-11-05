/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import gui.Main;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Venda;
import util.DateConvert;
import util.JurosCalc;

/**
 *
 * @author USER
 */
public class VendaDAO {
    
    public static Connection connection;
    int idVenda;
    String Clientes_CPF;
    String Produto;
    double valorTotal;
    double valorPago;
    int quantiaParcelas;
    String metodoPagamento;
    Date dataCompra;
    Date dataVencimento;
    int ativa;
    
    public VendaDAO() {
        VendaDAO.connection=ConnectionFactory.getConnection();
    }
    
    public static double updateVenda(double pagoAgora, int idVenda, double valorTotal, double valorPago, int quantiaParcelas, int parcelasPagas, Date dataVencimento, java.sql.Date dataNVencimento, boolean cobrarJuros, boolean attTodas) {
        String sql = "UPDATE tryfatus.vendas SET valorTotal = ?, valorPago = ?, quantiaParcelas = ?, dataVencimento = ?, ativa=? WHERE idVenda = ?";
        double pagAgora = pagoAgora;
        
        //
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            boolean serAtiva = true; 
            
            //
            double valorTot = valorTotal;
            double valJuros = 0;
            if (dataVencimento.before(DateConvert.LocalToUtil(LocalDate.now()))) {
                valJuros = JurosCalc.Juros(valorTotal/parcelasPagas, JurosDAO.pegarJuros(), dataVencimento);
            }
            if (cobrarJuros=true) {
              valorTot=valorTot+valJuros;
            } 
            stmt.setDouble(1, valorTot);
            
            //
            double valPag = 0;
            if (pagAgora>valorTot) {
                valPag=valorTot;
                pagAgora=pagAgora-valorTot;
                serAtiva = false;
            }
            if (pagAgora==valorTot) {
                valPag=valorTot;
                pagAgora=0;
                serAtiva=false;
            }
            if (pagAgora<valorTot) {
                valPag=valorPago+pagAgora;
            }
            stmt.setDouble(2, valPag);
            
            //
            if (quantiaParcelas-parcelasPagas<=0) {
                stmt.setInt(3, 1);
            } else {
                stmt.setInt(3, quantiaParcelas-parcelasPagas);
            }
            
            //
            if (pagAgora>0) {
                stmt.setDate(4, dataNVencimento);
            } else if (attTodas=true) {
                stmt.setDate(4, dataNVencimento);
            } else {
                stmt.setDate(4, dataVencimento);
            }
            
            //
            if (serAtiva=true) {
                stmt.setInt(5, 1);
            } else {
                stmt.setInt(5, 0);
            }
            
            //
            stmt.setInt(6, idVenda);
            stmt.executeUpdate();
            return pagAgora;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    public static void updateVendas(double valorPago, Cliente cliente, int parcelasPagas, java.sql.Date novoVencimento, boolean cobrarJuros, boolean attTodas) {
        String sql = "SELECT idVenda,valorTotal,valorPago,quantiaParcelas,dataVencimento FROM tryfatus.vendas WHERE Clientes_CPF='"+cliente.getCPF()+"' AND ativa=1 ORDER BY dataVencimento";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            double a = valorPago;
            while(rs.next()) {
                if (a>0 || attTodas==true) {
                    a=a-updateVenda(valorPago, rs.getInt("idVenda"), rs.getDouble("valorTotal"), rs.getDouble("valorPago"), rs.getInt("quantiaParcelas"), parcelasPagas, rs.getDate("dataVencimento"), novoVencimento, cobrarJuros, attTodas);
                } else {
                    break;
                }
                System.out.println(a);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //return list;
    }
    
    public static void add(Venda venda) {
        String sql = "INSERT INTO vendas(Clientes_CPF,Produto,valorTotal,valorPago,quantiaParcelas,metodoPagamento,dataCompra,dataVencimento,ativa) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, venda.getCliente());
            stmt.setString(2, venda.getProduto());
            stmt.setDouble(3, venda.getValor());
            stmt.setDouble(4, venda.getPago());
            stmt.setInt(5, venda.getParcelas());
            stmt.setString(6, venda.getMetodo());
            stmt.setDate(7, venda.getData());
            stmt.setDate(8, venda.getVencimento());
            stmt.setInt(9, venda.getAtivo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static int pegarQntdVencidas(Cliente cliente) {
        ResultSet rs = null;
        int i = 0;
        String sql = "SELECT dataVencimento FROM tryfatus.vendas WHERE ativa=1 AND Clientes_CPF='"+cliente.getCPF()+"'";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            java.util.Date agora = DateConvert.LocalToUtil(LocalDate.now());
            while (rs.next()) {
                if (rs.getDate(1).before(agora)) {
                    i++;
                }
            }
            return i;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        } 
    }
    
    public static double pegarValorVencido(Cliente cliente) {
        ResultSet rs = null;
        double i = 0;
        String sql = "SELECT valorTotal,valorPago,dataVencimento FROM tryfatus.vendas WHERE ativa=1 AND Clientes_CPF='"+cliente.getCPF()+"'";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            java.util.Date agora = DateConvert.LocalToUtil(LocalDate.now());
            while (rs.next()) {
                if (rs.getDate(3).before(agora)) {
                    i=i+(rs.getDouble(1)-rs.getDouble(2));
                }
            }
            return i;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        } 
    }
    
    public static double pegarTotal(Cliente cliente) {
        ResultSet rs = null;
        double i = 0.0;
        String sql = "SELECT valorTotal FROM tryfatus.vendas WHERE ativa=1 AND Clientes_CPF='"+cliente.getCPF()+"'";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                i=i+rs.getDouble(1);
            }
            return i;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        } 
    }
    
    public static int pegarAbertos(Cliente cliente) {
        ResultSet rs = null;
        int i = 0;
        String sql = "SELECT ativa FROM tryfatus.vendas WHERE ativa=1 AND Clientes_CPF='"+cliente.getCPF()+"'";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                i++;
            }
            return i;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        } 
    }
    
    public static double pegarValorAberto(Cliente cliente) {
        ResultSet rs = null;
        double tot = 0;
        double pago = 0;
        double aberto = 0;
        String sql = "SELECT valorTotal,valorPago FROM tryfatus.vendas WHERE ativa=1 AND Clientes_CPF='"+cliente.getCPF()+"'";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                tot=tot+rs.getDouble(1);
                pago=pago+rs.getDouble(2);
            }
            aberto=tot-pago;
            return aberto;
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex);
            return 0;
        } 
    }
    
    public static ResultSet pegarFinanceiro(Cliente cliente) {
        ResultSet rs = null;
        try {
            String sql = "SELECT valorTotal,valorPago FROM vendas WHERE Clientes_CPF = "+cliente.getCPF()+" AND ativa='1'";
            connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex);
        } 
        return rs;
    }
    
    public static void PopularJTable(String sql, JTable Tabela){
        try {
            connection = ConnectionFactory.getConnection(); 
            try ( 
                PreparedStatement stmt = (PreparedStatement)connection.prepareStatement(sql)) { 
                stmt.execute();
                
                ResultSet resultado = stmt.executeQuery(sql); 
                DefaultTableModel model = (DefaultTableModel) Tabela.getModel(); 
                model.setNumRows(0);
                
                while (resultado.next()){
                    model.addRow(new Object[]{
                    resultado.getInt("idVenda"),
                    resultado.getString("Produto"),
                    resultado.getString("valorTotal"),
                    resultado.getString("valorPago"),
                    resultado.getString("quantiaParcelas"),
                    resultado.getString("metodoPagamento"),
                    resultado.getDate("dataCompra"),
                    resultado.getString("dataVencimento")
                });
                }
            } 
        }
        catch (SQLException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
