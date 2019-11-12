/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import gui.Main;
import model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author lukin
 */
public class ClienteDAO {
    
    public static Connection connection;
    public int CPF;
    public String nome;
    public int RG;
    public String celular;
    public String telefone;
    public String email;
    public String endereco;
    public String cidade;
    public String estado;
    public String nascimento;
    
    public ClienteDAO() {
        ClienteDAO.connection=ConnectionFactory.getConnection();
    }
    
    public static void ClienteBusca(JComboBox jCB) {
        String sql = "SELECT * FROM clientes";
        ResultSet rs = null;
        try {
            try (PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql)) {
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    jCB.addItem(rs.getString(2)+" - "+rs.getString(1));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Cliente Busca(String CPF) {
        Cliente cliente = new Cliente();
        String sql = "SELECT * FROM clientes WHERE CPF='"+CPF+"'";
        ResultSet rs = null;
        try {
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                cliente.setCPF(rs.getString(1));
                cliente.setNome(rs.getString(2));
                cliente.setRG(rs.getString(3));
                cliente.setCelular(rs.getString(4));
                cliente.setTelefone(rs.getString(5));
                cliente.setEmail(rs.getString(6));
                cliente.setEndereco(rs.getString(7));
                cliente.setBairro(rs.getString(8));
                cliente.setCidade(rs.getString(9));
                cliente.setEstado(rs.getString(10));
                cliente.setNascimento(rs.getDate(11));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
    
    public void add(Cliente cliente) {
        String sql = "INSERT INTO clientes(CPF,Nome,RG,Celular,Telefone,Email,Endereco,Bairro,Cidade,Estado,Nascimento) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getCPF());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getRG());
            stmt.setString(4, cliente.getCelular());
            stmt.setString(5, cliente.getTelefone());
            stmt.setString(6, cliente.getEmail());
            stmt.setString(7, cliente.getEndereco());
            stmt.setString(8, cliente.getBairro());
            stmt.setString(9, cliente.getCidade());
            stmt.setString(10, cliente.getEstado());
            stmt.setDate(11, cliente.getNascimento());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
    }
    
    public void delete(Cliente cliente) {
        String sql = "Delete from clientes where nome=?;";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
    }
    
    public void changeByCPF(Cliente cliente) {
        
        try {
            try (PreparedStatement stmt = connection.prepareStatement("Update clientes Set Nome = ?, RG=?, Celular = ?, Telefone = ?, Email = ?, Endereco = ?, Bairro=?, Cidade=?, Estado=?, Nascimento = ? where CPF = ?");) {
                System.err.println(cliente.getCPF());
                stmt.setString(1, cliente.getNome());
                stmt.setString(2, cliente.getRG());
                stmt.setString(3, cliente.getCelular());
                stmt.setString(4, cliente.getTelefone());
                stmt.setString(5, cliente.getEmail());
                stmt.setString(6, cliente.getEndereco());
                stmt.setString(7, cliente.getBairro());
                stmt.setString(8, cliente.getCidade());
                stmt.setString(9, cliente.getEstado());
                stmt.setDate(10, cliente.getNascimento());
                stmt.setString(11, cliente.getCPF());
                stmt.executeUpdate();
                //stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
                ConnectionFactory.closeConnection(connection);
        }
    }
    
    public void changeByNome(Cliente cliente) {
        
        try {
            try (PreparedStatement stmt = connection.prepareStatement("Update clientes RG=?, Celular = ?, Telefone = ?, Email = ?, Endereco = ?, Bairro=?, Cidade=?, Estado=?, Nascimento = ? where CPF = ?");) {
                stmt.setString(1, cliente.getRG());
                stmt.setString(2, cliente.getCelular());
                stmt.setString(3, cliente.getTelefone());
                stmt.setString(4, cliente.getEmail());
                stmt.setString(5, cliente.getEndereco());
                stmt.setString(6, cliente.getBairro());
                stmt.setString(7, cliente.getCidade());
                stmt.setString(8, cliente.getEstado());
                stmt.setDate(9, cliente.getNascimento());
                stmt.setString(10, cliente.getNome());
                stmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
    }
    
}
