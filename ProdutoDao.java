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
import sgv.Logica.Produto1;

/**
 *
 * @author CS INOVAÇÃO
 */
public class ProdutoDao {

    private final Connection conexao;

    public ProdutoDao() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    public void AdicionaProduto(Produto1 novoProduto) throws SQLException {

        //prepara a conexao(inserção de daddos no banco)
        String sql = "insert into produto(nome, valor, descricao, status,quatidadeEstoque)"
                + "values(?,?,?,?,?)";

        //Preparando a conexão com o banco de dados
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, novoProduto.getNome());
        preparaconexao.setString(2, String.valueOf(novoProduto.getValor()));
        preparaconexao.setString(3, novoProduto.getDescricao());
        preparaconexao.setString(4, novoProduto.getStatus());
        preparaconexao.setString(5, novoProduto.getQuantidadeEstoque());

        //  preparaconexao.setString(7, String.valueOf(client.getLoja_idloja()));
        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();

    }

    //Cria uma lista com os dados no banco  
    public List<Produto1> getLista(String chamalista) throws SQLException {

        //Selecionando a tabale produto no banco de dados
        String sql = "select * from produto where nome like ?";
        //preparando a conexão com o banco
        PreparedStatement preparaConexaoList = this.conexao.prepareStatement(sql);
        preparaConexaoList.setString(1, chamalista);
        ResultSet recebeContatos = preparaConexaoList.executeQuery();

        //Criando a lista de Produto
        List<Produto1> minhaLista = new ArrayList<Produto1>();
        while (recebeContatos.next()) {

            //Abrindo conexão com a tabela
            Produto1 produt = new Produto1();
            produt.setIdproduto(Integer.valueOf(recebeContatos.getString("id"))); //busca a lista no banco pelo id...
            produt.setNome(recebeContatos.getString("nome")); //obs:Os nomes da tabela tem que ser igual ao banco 
            produt.setValor(recebeContatos.getString("valor")); // de dados do sistema.
            produt.setDescricao(recebeContatos.getString("descricao"));
            produt.setStatus(recebeContatos.getString("status"));
            produt.setQuantidadeEstoque("quantidadeEstoque");
            minhaLista.add(produt);
        }

        //Fechado a conexao
        recebeContatos.close();
        preparaConexaoList.close();
        return minhaLista;
    }

    public void alteraProduto(Produto1 produt) throws SQLException {

        //Busca o produto no banco e atualiza o mesmo...
        String sql = "update produto set nome=?, valor=?, descricao=?, status=?, quantidadeEstoque=? where id=?";
        //obs:Esse codigo sql deve ser igual com o nome das tabelas do banco!"                 

        //Preparando a conexão com o banco de dados (seta conexão)
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, produt.getNome()); //preparaconexao.setString(1, String.valueOf(produt.getNome()));
        preparaconexao.setString(2, produt.getValor());
        preparaconexao.setString(3, produt.getDescricao()); 
        preparaconexao.setString(4, produt.getStatus());
        preparaconexao.setString(5, produt.getQuantidadeEstoque());
        preparaconexao.setLong(6, produt.getIdproduto()); //Para toda alteração é necessario buscar pelo id...
        
        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();
    }

    public void removeProduto(Produto1 produto) throws SQLException {

        //Deleta a tabela Produto pelo id... 
        String sql = "delete from produto where id=?";//Codigo sql deletando no banco de dados... 
        PreparedStatement preparaConexao = conexao.prepareStatement(sql);//preparando a conexão...
        preparaConexao.setInt(1, produto.getIdproduto());//busca pelo id...
        preparaConexao.execute(); //Execulta o banco... 
        preparaConexao.close(); // Fecha o banco...

    }
}
