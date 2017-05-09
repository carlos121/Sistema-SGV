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
import sgv.Logica.NotaFiscal1;

/**
 *
 * @author CS INOVAÇÃO
 */
public class NotaFiscalDao {
    
    private final Connection conexao;

    public NotaFiscalDao() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    public void AdicionaNotaFiscal(NotaFiscal1 nf) throws SQLException {

        //prepara a conexao(inserção de daddos no banco)
        String sql = "insert into notafiscal(datanota, descricaonota)"
                + "values(?,?)";

        //Preparando a conexão com o banco de dados
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, nf.getDatanota());
        preparaconexao.setString(2, nf.getDescricaonota());

        //  preparaconexao.setString(7, String.valueOf(client.getLoja_idloja()));
        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();

    }
    
    //Cria uma lista com os dados da Nota Fiscal 
    public List<NotaFiscal1> getLista(String chamalista) throws SQLException {

        //Selecionando a tabale loja no banco de dados
        String sql = "select * from notafiscal where nome like ?";
        //preparando a conexão com o banco
        PreparedStatement preparaConexaoList = this.conexao.prepareStatement(sql);
        preparaConexaoList.setString(1, chamalista);
        ResultSet recebeContatos = preparaConexaoList.executeQuery();

        //Criando a lista de Nota Fiscal
        List<NotaFiscal1> minhaLista = new ArrayList<NotaFiscal1>();
        while (recebeContatos.next()) {

            //Abrindo conexão com a tabela
            NotaFiscal1 nf = new NotaFiscal1();
            nf.setIdnotaFiscal(Integer.valueOf(recebeContatos.getString("id")));
            nf.setDatanota(recebeContatos.getString("datanota")); //obs:Os nomes da tabela tem que ser igual ao banco 
            nf.setDescricaonota(recebeContatos.getString("descricaonota")); // de dados do sistema.
            minhaLista.add(nf);
        }

        //Fechado a conexao
        recebeContatos.close();
        preparaConexaoList.close();
        return minhaLista;
    }

    public void alteraNotaFiscal(NotaFiscal1 nf) throws SQLException {

        //Busca a nota fiscal no banco e atualiza o mesmo...
        String sql = "update notafiscal set datanota=?, descricaonota=? where id=?"; 
        //obs:Esse codigo sql deve ser igual com o nome das tabelas do banco!"                 

        //Preparando a conexão com o banco de dados (seta conexão)
        PreparedStatement preparaconexao = conexao.prepareStatement(sql);
        preparaconexao.setString(1, String.valueOf(nf.getDatanota()));
        preparaconexao.setString(2, nf.getDescricaonota());
        preparaconexao.setLong(3, nf.getIdnotaFiscal()); //Busca pelo id...
   
        //execulta o codigo SQL
        preparaconexao.execute();
        preparaconexao.close();
    }

    public void removeNotaFiscal(NotaFiscal1 nf) throws SQLException {

        //Deleta a tabela Nota Fiscal pelo id... 
        String sql = "delete from notafiscal where id=?";//Codigo sql deletando no banco de dados... 
        PreparedStatement preparaConexao = conexao.prepareStatement(sql);//preparando a conexão...
        preparaConexao.setInt(1, nf.getIdnotaFiscal());//busca pelo id...
        preparaConexao.execute(); //Execulta o banco... 
        preparaConexao.close(); // Fecha o banco...

    }
}
