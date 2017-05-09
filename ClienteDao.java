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
import sgv.Logica.Cliente1;

/**
 *
 * @author CS INOVAÇÃO
 */
public class ClienteDao {

    private final Connection conexao;

    public ClienteDao() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    public void Adiciona(Cliente1 client) throws SQLException {

        //prepara a conexao(inserção de daddos no banco)
        String sql = "insert into cliente(nome, endereco, telefone, cpf, cidade, estado)"
                + "values(?,?,?,?,?,?)";

        //Preparando a conexão com o banco de dados
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, client.getNome());
        preparaconexao.setString(2, client.getEndereco());
        preparaconexao.setString(3, client.getTelefone());
        preparaconexao.setString(4, String.valueOf(client.getCpf()));
        preparaconexao.setString(5, client.getCidade());
        preparaconexao.setString(6, client.getEstado());
        //  preparaconexao.setString(7, String.valueOf(client.getLoja_idloja()));

        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();

    }

    public List<Cliente1> getLista(String chamalista) throws SQLException {

        //Selecionando a tabela cliente no banco de dados
        String sql = "select * from cliente where nome like ?";
        //preparando a conexão com o banco
        PreparedStatement preparaConexaoList = this.conexao.prepareStatement(sql);
        preparaConexaoList.setString(1, chamalista);//busca a lista por esse parâmetro...
        ResultSet recebeContatos = preparaConexaoList.executeQuery(); //preparando a conexão com o banco de dados...

        //Criando a lista de clientes
        List<Cliente1> minhaLista = new ArrayList<Cliente1>();
        while (recebeContatos.next()) {

            //Abrindo conexão com a tabela
            Cliente1 client = new Cliente1();
            client.setId(Integer.valueOf(recebeContatos.getString("id"))); //busca a lista no banco pelo id...
            client.setNome(recebeContatos.getString("nome"));
            client.setEndereco(recebeContatos.getString("endereco"));
            client.setTelefone(recebeContatos.getString("telefone"));
            client.setCpf(recebeContatos.getString("cpf"));
            client.setCidade(recebeContatos.getString("cidade"));
            client.setEstado(recebeContatos.getString("estado"));
            minhaLista.add(client);
        }

        //Fechado a conexao
        recebeContatos.close();
        preparaConexaoList.close();
        return minhaLista;
    }

    public void alteraCliente(Cliente1 client) throws SQLException {

        //Busca o cliente no banco e atualiza o mesmo...
        String sql = "update cliente set nome=?, endereco=?, telefone=?, cpf=?"
                + ", cidade=?, estado=? where id=?"; //obs:Esse codigo sql deve ser igual com o nome das tabelas do banco!

        //Preparando a conexão com o banco de dados (seta conexão)
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, client.getNome());
        preparaconexao.setString(2, client.getEndereco());
        preparaconexao.setString(3, client.getTelefone());
        preparaconexao.setString(4, String.valueOf(client.getCpf()));
        preparaconexao.setString(5, client.getCidade());
        preparaconexao.setString(6, client.getEstado());
        preparaconexao.setLong(7, client.getId()); //Busca pelo id...
        //  preparaconexao.setString(7, String.valueOf(client.getLoja_idloja()));

        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();
    }

    public void removeCliente(Cliente1 client) throws SQLException {

        //Deleta a tabela cliente pelo id... 
        String sql = "delete from cliente where id=?";//Codigo sql deletando no banco de dados... 
        PreparedStatement preparaConexao = conexao.prepareStatement(sql);//preparando a conexão...
        preparaConexao.setInt(1, client.getId());//busca pelo id...
        preparaConexao.execute(); //Execulta o banco... 
        preparaConexao.close(); // Fecha o banco...

    }
}
