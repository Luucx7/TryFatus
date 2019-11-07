/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import util.DateConvert;
import util.JurosCalc;

import static util.Format.decimal;

/**
 *
 * @author lukin
 */
public class JurosDAO {
    
    public static double calcularJurosTotal(Cliente cliente) {
        double juros = 0; // Iniciação da variável
        ResultSet rs = null; // Iniciação dos resultados
        
        String sql = "SELECT valorTotal,valorPago,quantiaParcelas,dataVencimento FROM tryfatus.vendas WHERE Clientes_CPF='"+cliente.getCPF()+"' AND ativa=1";
        // Linha de código do SQL
        
        try {
            
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);
            rs = stmt.executeQuery();
            // Conecta e executa
            
            while (rs.next()) {
                if (rs.getDate("dataVencimento").before(DateConvert.LocalToUtil(LocalDate.now()))) { // Verifica se a data de vencimento já passou
                                                                                                     // Utiliza métodos LocalToUtil para converter o tipo de data para uma utilizável
                                                                                                     // No método que pega a data atual do sistema
                                                                                                     
                    double devido = (rs.getDouble("valorTotal")-rs.getDouble("valorPago"))/rs.getInt("quantiaParcelas"); // Calcula o total devido, e divide pelas parcelas restantes para o cálculo
                    
                    juros = juros + JurosCalc.Juros(devido, JurosDAO.pegarJuros(), rs.getDate("dataVencimento")); // Utiliza o método, pegando os valores nescessários para calcular o juro
                                                                                                                  // pegarJuros retorna o juro salvo no sistema
                }
            }
            return decimal(juros); // retorna enfim o valor total
        } catch (SQLException ex) {
            ex.printStackTrace(); // Retorna erros ao console
        }
        return 0;
    }
    
    public static double pegarJuros() {
        String sql = "SELECT taxa_base FROM tryfatus.juros WHERE id=1";
        ResultSet rs = null;
        double taxa = 0.0;
        try {
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                taxa=rs.getDouble(1);
                return decimal(taxa);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex);
        } finally {
            try {
                ConnectionFactory.getConnection().close();
            } catch (SQLException ex) {
                Logger.getLogger(JurosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return decimal(taxa);
    }
    
    public static void setarJuros(double juros) {
        String sql = "UPDATE juros SET taxa_base = ? WHERE id=1;";
        try {
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);
            stmt.setDouble(1, juros);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void checarJuros() {
        String sql = "SELECT ID FROM juros";
        ResultSet rs = null;
        try {
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs.next()==false) {
                setarJurosInicial();
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void setarJurosInicial() {
        String sql = "INSERT INTO juros(ID,taxa_base) VALUES(1,0.05)";
        try {
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);
            stmt.execute();
            ConnectionFactory.getConnection().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public static List resultSetToArrayList(ResultSet rs) throws SQLException{
        ResultSetMetaData md = rs.getMetaData();
        int columns = md.getColumnCount();
        ArrayList list = new ArrayList(md.getColumnCount());
        while (rs.next()){
            HashMap row = new HashMap(columns);
            for(int i=1; i<=columns; ++i){           
                row.put(md.getColumnName(i),rs.getObject(i));
            }
            row.put("Juros",JurosCalc.Juros(rs.getDouble("valorTotal")-rs.getDouble("valorPago"), JurosDAO.pegarJuros(), rs.getDate("dataVencimento")));
            list.add(row);
        }

        return list;
    }
}
