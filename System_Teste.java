/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.Banco;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import sgv.DAO.ClienteDao;
import sgv.DAO.FornecedorDao;
import sgv.DAO.LojaDao;
import sgv.DAO.NotaFiscalDao;
import sgv.DAO.ProdutoDao;
import sgv.DAO.VendaDao;
import sgv.DAO.FuncionarioDao;
import sgv.Logica.Cliente1;
import sgv.Logica.Fornecedor1;
import sgv.Logica.Loja1;
import sgv.Logica.NotaFiscal1;
import sgv.Logica.Produto1;
import sgv.Logica.Venda1;
import sgv.Logica.Funcionario1;

/**
 *
 * @author CS INOVAÇÃO
 */
public class System_Teste {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     *
     * ---------------------------- Importante ------------------------------
     * Atalhos para usar no Netbeans sout + tab = System.out.println("");
     * //mensagem na tela newo + tab = Object object = new Object(); //criando
     * um novo objeto
     * -----------------------------------------------------------------------
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
    /*   //--------------------------------------------------------------------
        Connection conexao = CriaConexao.getConexao();
        conexao.close();
        System.out.println("Desconectado do Banco de Dados!");
        System.out.println("*********************************************"); 
        //--------------------------------------------------------------------

        //Preechendo os campos(Teste de Inserção de Dados)
        Cliente1 clientes = new Cliente1();
        clientes.setNome("jose santos");
        clientes.setEndereco("Nova rua");
        clientes.setTelefone("21212121");
        clientes.setCpf("2323232");
        clientes.setCidade("rio de janeiro");
        clientes.setEstado("rj");
      //  novoVendedor.setLogin("carlos");
       // novoVendedor.setSenha("888");
        
        //novoVenda.setValor(Integer.valueOf("300"));
        
        //buscar o codigo do loja_idloja no banco de dados;
        //String query = "select * from loja ";
        //Statement st = conexao.createStatement();
        //ResultSet rs = st.executeQuery(query);
        //while (rs.next()) {
        //  int id = rs.getInt("idloja");
        //novocliente.setLoja_idloja(String.valueOf(id));
        //} Este codigo está em analise...
        
        //Criando conexão com o codigo SQL criado no ClienteDao... 
        ClienteDao dao = new ClienteDao();
        dao.Adiciona(clientes);
        System.out.println("Adicionado no Banco!"); 
*/ 
       //-------------------------------------------------------------------- 
        
    /*     //Listando as informações que estão no banco de dados...
         VendedorDao daoVendedor = new VendedorDao();
         List<Vendedor1> novaLista = daoVendedor.getLista();
        
         System.out.println(" ------------------------------------------");
         for (Vendedor1 novoVendedor : novaLista) {
            
         System.out.println("Nome: " + novoVendedor.getNome());
         System.out.println("Endereco: " + novoVendedor.getEndereco());
         System.out.println("Telefone: " + novoVendedor.getTelefone());
         System.out.println("Cpf: " + novoVendedor.getCpf());
         System.out.println("Cidade: " + novoVendedor.getCidade());
         System.out.println("Estado: " + novoVendedor.getEstado());
         System.out.println("Login: " + novoVendedor.getLogin());
         System.out.println("Senha: " + novoVendedor.getSenha());
         System.out.println(" ------------------------------------------");
            
         } */
        
         //--------------------------------------------------------------------
      
/*         //Alterando os campos(Teste de Alteração de Dados)
         Vendedor1 vend = new Vendedor1();
        // lojas.setIdloja(Integer.valueOf(1));
         vend.setIdvendedor(1); //Altera o dados buscando pelo id...
         vend.setNome("carlos sousa");
         vend.setEndereco("rua do madeira grande");
         vend.setTelefone("8848484");
         vend.setCpf("12222");
         vend.setCidade("rio verde");
         vend.setEstado("goias");
         vend.setLogin("joao");
         vend.setSenha("123");
         
         VendedorDao dao1 = new VendedorDao();
         dao1.alteraVendedor(vend);
         System.out.println("Alterado com sucesso!");       */  
       
        //--------------------------------------------------------------------
        
/*         //Remover os campos(Teste de exclusão de Dados)
         Vendedor1 vendedor = new Vendedor1();//Criando o objeto... 
         vendedor.setIdvendedor(3);//Escolher o campo que vai ser deletado pelo id...
         
         VendedorDao dao = new VendedorDao();//Busca na classe Dao, por que o codigo sql de excluir a tabela está lá... 
         dao.removeVendedor(vendedor);//Removendo o objeto... 
         System.out.println("Deletado com sucesso!"); 
         }  */      
    }
}


