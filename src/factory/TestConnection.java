/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lukin
 */
public class TestConnection {
    public static void main() throws SQLException {
        Connection connection = new ConnectionFactory().getConnection();
        //System.out.println("Conexão aberta!"); //Imprime mensagem
        JOptionPane.showMessageDialog(null, "Conexão aberta");
        connection.close(); // fecha o banco
     }
}
