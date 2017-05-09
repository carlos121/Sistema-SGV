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
import sgv.Logica.Venda1;

/**
 *
 * @author CS INOVAÇÃO
 */
public class VendaDao {

    private final Connection conexao;

    public VendaDao() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    public void AdicionaVenda(Venda1 novaVenda) throws SQLException {

        //prepara a conexao(inserção de daddos no banco)
        String sql = "insert into venda(datavenda, descricao,quantidade)"
                + "values(?,?,?)";

        //Preparando a conexão com o banco de dados
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, novaVenda.getDatavenda());
        preparaconexao.setString(2, novaVenda.getDescricao());
        preparaconexao.setString(3, String.valueOf(novaVenda.getQuantidade()));

        //  preparaconexao.setString(7, String.valueOf(client.getLoja_idloja()));
        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();

    }
    
    //Cria uma lista com os dados do banco 
    public List<Venda1> getLista(String chamalista) throws SQLException {

        //Selecionando a tabela no banco de dados
        String sql = "select * from venda where nome like ?";
        //preparando a conexão com o banco
        PreparedStatement preparaConexaoList = this.conexao.prepareStatement(sql);
        preparaConexaoList.setString(1, chamalista);//busca a lista por esse parâmetro...
        ResultSet recebeDados = preparaConexaoList.executeQuery();

        //Criando a lista de Venda
        List<Venda1> minhaLista = new ArrayList<Venda1>();
        while (recebeDados.next()) {

            //Abrindo conexão com a tabela
            Venda1 vend = new Venda1();
            vend.setIdvenda(Integer.valueOf(recebeDados.getString("id"))); //busca a lista no banco pelo id...
            vend.setDatavenda(recebeDados.getString("datavenda")); //obs:Os nomes da tabela tem que ser igual ao banco 
            vend.setDescricao(recebeDados.getString("descricao")); // de dados do sistema.
            vend.setQuantidade(Integer.parseInt(recebeDados.getString("quantidade")));
            minhaLista.add(vend);
        }

        //Fechado a conexao
        recebeDados.close();
        preparaConexaoList.close();
        return minhaLista;
    }
    
    public void alteraVenda(Venda1 vendas) throws SQLException {

        //Busca o produto no banco e atualiza o mesmo...
        String sql = "update venda set datavenda=?, descricao=?, quantidade=? where id=?";
        //obs:Esse codigo sql deve ser igual com o nome das tabelas do banco!"                 

        //Preparando a conexão com o banco de dados (seta conexão)
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, vendas.getDatavenda()); //preparaconexao.setString(1, String.valueOf(produt.getNome()));
        preparaconexao.setString(2, vendas.getDescricao()); 
        preparaconexao.setString(3, String.valueOf(vendas.getQuantidade()));
        preparaconexao.setLong(4, vendas.getIdvenda()); //Para toda alteração é necessario buscar pelo id...
        
        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();
    }

    public void removeVenda(Venda1 vender) throws SQLException {

        //Deleta a tabela Produto pelo id... 
        String sql = "delete from venda where id=?";//Codigo sql deletando no banco de dados... 
        PreparedStatement preparaConexao = conexao.prepareStatement(sql);//preparando a conexão...
        preparaConexao.setInt(1, vender.getIdvenda());//busca pelo id...
        preparaConexao.execute(); //Execulta o banco... 
        preparaConexao.close(); // Fecha o banco...

    }

}
