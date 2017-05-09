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
import sgv.Logica.Fornecedor1;

/**
 *
 * @author CS INOVAÇÃO
 */
public class FornecedorDao {

    private final Connection conexao;

    public FornecedorDao() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    public void Adiciona(Fornecedor1 forne) throws SQLException {

        //prepara a conexao(inserção de daddos no banco)
        String sql = "insert into fornecedor(nome, endereco, telefone, cidade, estado, cnpj, descricao)"
                + "values(?,?,?,?,?,?,?)";

        //Preparando a conexão com o banco de dados
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, forne.getNome());
        preparaconexao.setString(2, forne.getEndereco());
        preparaconexao.setString(3, forne.getTelefone());
        preparaconexao.setString(4, forne.getCidade());
        preparaconexao.setString(5, forne.getEstado());
        preparaconexao.setString(6, forne.getCnpj());
        preparaconexao.setString(7, forne.getDescricao());

        //  preparaconexao.setString(7, String.valueOf(client.getLoja_idloja()));
        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();

    }

    public List<Fornecedor1> getLista(String chamalista) throws SQLException {

        //Selecionando a tabale fornecedor no banco de dados
        String sql = "select * from fornecedor where nome like ?";
        //preparando a conexão com o banco
        PreparedStatement preparaConexaoList = this.conexao.prepareStatement(sql);
        preparaConexaoList.setString(1, chamalista);
        ResultSet recebeContatos = preparaConexaoList.executeQuery();

        //Criando a lista de fornecedor
        List<Fornecedor1> minhaLista = new ArrayList<Fornecedor1>();
        while (recebeContatos.next()) {

            //Abrindo conexão com a tabela
            Fornecedor1 forn = new Fornecedor1();
            forn.setId(Integer.valueOf(recebeContatos.getString("id")));
            forn.setNome(recebeContatos.getString("nome"));
            forn.setEndereco(recebeContatos.getString("endereco"));
            forn.setTelefone(recebeContatos.getString("telefone"));
            forn.setCidade(recebeContatos.getString("cidade"));
            forn.setEstado(recebeContatos.getString("estado"));
            forn.setCnpj(recebeContatos.getString("cnpj"));
            forn.setDescricao(recebeContatos.getString("descricao"));
            minhaLista.add(forn);
        }

        //Fechado a conexao
        recebeContatos.close();
        preparaConexaoList.close();
        return minhaLista;
    }

    public void alteraFornecedor(Fornecedor1 fornece) throws SQLException {

        //Busca o cliente no banco e atualiza o mesmo...
        String sql = "update fornecedor set nome=?, endereco=?, telefone=?"
                + ", cidade=?, estado=?, cnpj=?, descricao=? where id=?"; //obs:Esse codigo sql deve ser igual com o nome das tabelas do banco!

        //Preparando a conexão com o banco de dados (seta conexão)
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, fornece.getNome());
        preparaconexao.setString(2, fornece.getEndereco());
        preparaconexao.setString(3, fornece.getTelefone());
        preparaconexao.setString(4, fornece.getCidade());
        preparaconexao.setString(5, fornece.getEstado());
        preparaconexao.setString(6, fornece.getCnpj());
        preparaconexao.setString(7, fornece.getDescricao());
        preparaconexao.setLong(8, fornece.getId()); //Busca pelo id...
        //  preparaconexao.setString(7, String.valueOf(client.getLoja_idloja()));

        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();
    }

    public void removeFornecedor(Fornecedor1 forn) throws SQLException {

        //Deleta a tabela fornecedor pelo id... 
        String sql = "delete from fornecedor where id=?";//Codigo sql deletando no banco de dados... 
        PreparedStatement preparaConexao = conexao.prepareStatement(sql);//preparando a conexão...
        preparaConexao.setInt(1, forn.getId());//busca pelo id...
        preparaConexao.execute(); //Execulta o banco... 
        preparaConexao.close(); // Fecha o banco...

    }

}
