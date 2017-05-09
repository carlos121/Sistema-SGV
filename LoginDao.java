/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sgv.Banco.CriaConexao;

/**
 *
 * @author Inovação
 */
public class LoginDao {
    
     private final Connection conexao;

    public LoginDao() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }
    
     public boolean logar(String login, String senha) throws SQLException {
        String sql = "select * from funcionario where login = ? and senha = ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, login);
        stmt.setString(2, senha);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            return true;
        }
        rs.close();
        stmt.close();
        return false;
    }
     
   /*  public void nivelAcesso(String nivel) throws SQLException{ //Em desenvolvimento... 
        String sql = "select * from funcionario where nivel = ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, nivel);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            return true;
        }
        rs.close();
        stmt.close();
        return false;
     } */
}
