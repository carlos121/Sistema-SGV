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
import sgv.Logica.Loja1;

/**
 *
 * @author CS INOVAÇÃO
 */
public class LojaDao {

    private final Connection conexao;

    public LojaDao() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    public void AdicionaLoja(Loja1 lojas) throws SQLException {

        //prepara a conexao(inserção de daddos no banco)
        String sql = "insert into loja(nomeloja, cnpj, endereco, cidade, uf)"
                + "values(?,?,?,?,?)";

        //Preparando a conexão com o banco de dados
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, lojas.getNomeloja());
        preparaconexao.setString(2, lojas.getEndereco());
        preparaconexao.setString(3, lojas.getCnpj());
        preparaconexao.setString(4, lojas.getEstado());
        preparaconexao.setString(5, lojas.getCidade());

        //  preparaconexao.setString(7, String.valueOf(client.getLoja_idloja()));
        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();

    }

    public List<Loja1> getLista(String chamalista) throws SQLException {

        //Selecionando a tabale loja no banco de dados
        String sql = "select * from loja where nome like ?";
        //preparando a conexão com o banco
        PreparedStatement preparaConexaoList = this.conexao.prepareStatement(sql);
        preparaConexaoList.setString(1, chamalista);
        ResultSet recebeContatos = preparaConexaoList.executeQuery();

        //Criando a lista de loja
        List<Loja1> minhaLista = new ArrayList<Loja1>();
        while (recebeContatos.next()) {

            //Abrindo conexão com a tabela
            Loja1 lojas = new Loja1();
            lojas.setIdloja(Integer.valueOf(recebeContatos.getString("id")));
            lojas.setNomeloja(recebeContatos.getString("nomeloja")); //obs:Os nomes da tabela tem que ser igual ao banco 
            lojas.setEndereco(recebeContatos.getString("endereco")); // de dados do sistema.
            lojas.setCnpj(recebeContatos.getString("cnpj"));
            lojas.setCidade(recebeContatos.getString("cidade"));
            lojas.setEstado(recebeContatos.getString("uf"));
            minhaLista.add(lojas);
        }

        //Fechado a conexao
        recebeContatos.close();
        preparaConexaoList.close();
        return minhaLista;
    }

    public void alteraLoja(Loja1 lojas) throws SQLException {

        //Busca o lojas no banco e atualiza o mesmo...
        String sql = "update loja set nomeloja=?, endereco=?, cnpj=?, cidade=?"
                + ", uf=? where id=?"; //obs:Esse codigo sql deve ser igual com o nome das tabelas do banco!

        //Preparando a conexão com o banco de dados (seta conexão)
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, lojas.getNomeloja());
        preparaconexao.setString(2, lojas.getEndereco());
        preparaconexao.setString(3, lojas.getCnpj());
        preparaconexao.setString(4, lojas.getCidade());
        preparaconexao.setString(5, lojas.getEstado());
        preparaconexao.setLong(6, lojas.getIdloja()); //Busca pelo id...
        //  preparaconexao.setString(7, String.valueOf(client.getLoja_idloja()));

        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();
    }

    public void removeLoja(Loja1 lojas) throws SQLException {

        //Deleta a tabela cliente pelo id... 
        String sql = "delete from loja where id=?";//Codigo sql deletando no banco de dados... 
        PreparedStatement preparaConexao = conexao.prepareStatement(sql);//preparando a conexão...
        preparaConexao.setInt(1, lojas.getIdloja());//busca pelo id...
        preparaConexao.execute(); //Execulta o banco... 
        preparaConexao.close(); // Fecha o banco...

    }
}
