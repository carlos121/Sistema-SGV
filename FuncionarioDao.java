/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sgv.Banco.CriaConexao;
import sgv.Logica.Funcionario1;

/**
 *
 * @author CS INOVAÇÃO
 */
public class FuncionarioDao {
 
     private final Connection conexao;
    
    public FuncionarioDao() throws SQLException{
        this.conexao = CriaConexao.getConexao();        
    }
    
    public void AdicionaFuncionario(Funcionario1 func) throws SQLException {

        //prepara a conexao(inserção de daddos no banco)
        String sql = "insert into funcionario(nome, endereco,telefone, cpf, cidade, estado, login, senha)"
                + "values(?,?,?,?,?,?,?,?)";

        //Preparando a conexão com o banco de dados
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, func.getNome());
        preparaconexao.setString(2, func.getEndereco());
        preparaconexao.setString(3, func.getTelefone());
        preparaconexao.setString(4, func.getCpf());
        preparaconexao.setString(5, func.getCidade());
        preparaconexao.setString(6, func.getEstado());
        preparaconexao.setString(7, func.getLogin());
        preparaconexao.setString(8, func.getSenha());
        
        //  preparaconexao.setString(7, String.valueOf(client.getLoja_idloja()));
        
        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();

    }
    
    public List<Funcionario1> getLista(String chamalista) throws SQLException{
        
        //Selecionando a tabale cliente no banco de dados
        String sql = "select * from funcionario where nome like ?";
        //preparando a conexão com o banco
        PreparedStatement preparaConexaoList = this.conexao.prepareStatement(sql);
        preparaConexaoList.setString(1, chamalista);//busca a lista por esse parâmetro...
        ResultSet recebeDados = preparaConexaoList.executeQuery();
        
        //Criando a lista de clientes
        List<Funcionario1> minhaLista = new ArrayList<Funcionario1>();
        while(recebeDados.next()){
            
            //Abrindo conexão com a tabela
            // O nome dos campos aqui devem ser iguais ao do banco de dados!
            Funcionario1 func = new Funcionario1();
            func.setId(Integer.valueOf(recebeDados.getString("id"))); //busca a lista no banco pelo id...
            func.setNome(recebeDados.getString("nome")); 
            func.setEndereco(recebeDados.getString("endereco"));
            func.setTelefone(recebeDados.getString("telefone"));
            func.setCpf(recebeDados.getString("cpf"));
            func.setCidade(recebeDados.getString("cidade"));
            func.setEstado(recebeDados.getString("estado"));
            func.setLogin(recebeDados.getString("login"));
            func.setSenha(recebeDados.getString("senha"));
            minhaLista.add(func);
        }
        
        //Fechado a conexao
        recebeDados.close();
        preparaConexaoList.close();
        return minhaLista;
    }
    
    public void alteraFuncionario(Funcionario1 func) throws SQLException{
        
        //Busca o cliente no banco e atualiza o mesmo...
        String sql = "update funcionario set nome=?, endereco=?, telefone=?, cpf=?" + 
                ", cidade=?, estado=?, login=?, senha=? where id=?"; //obs:Esse codigo sql deve ser igual com o nome das tabelas do banco!
          
            //Preparando a conexão com o banco de dados (seta conexão)
            PreparedStatement preparaconexao = conexao.prepareStatement(sql);
            preparaconexao.setString(1, func.getNome());
            preparaconexao.setString(2, func.getEndereco());
            preparaconexao.setString(3, func.getTelefone());
            preparaconexao.setString(4, func.getCpf());
            preparaconexao.setString(5, func.getCidade());
            preparaconexao.setString(6, func.getEstado());
            preparaconexao.setString(7, func.getLogin());
            preparaconexao.setString(8, func.getSenha());
            preparaconexao.setLong(9, func.getId()); //Busca pelo id...
            //  preparaconexao.setString(7, String.valueOf(client.getLoja_idloja()));
        
            //execulta o codigo SQL
            preparaconexao.execute();
            preparaconexao.close();  
        }
    
        public void removeFuncionario(Funcionario1 func) throws SQLException{
            
            //Deleta a tabela cliente pelo id... 
            String sql = "delete from funcionario where id=?";//Codigo sql deletando no banco de dados... 
            PreparedStatement preparaConexao = conexao.prepareStatement(sql);//preparando a conexão...
            preparaConexao.setInt(1, func.getId());//busca pelo id...
            preparaConexao.execute(); //Execulta o banco... 
            preparaConexao.close(); // Fecha o banco...
            
        }
}
