/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CS INOVAÇÃO
 */
public class CriaConexao {

    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectado ao banco de dados!");
            return DriverManager.getConnection("jdbc:mysql://localhost/dbvendas", "root", "carlossousa");
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }
}
