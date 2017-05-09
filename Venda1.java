/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.Logica;

/**
 *
 * @author CS INOVAÇÃO
 */
public class Venda1 {
   
    private int idvenda;
    private String datavenda;
    private String descricao;
    private int quantidade;
    private int produto_idproduto;
    private int produto_loja_idloja;
    private int vendedor_idvendedor;
    private int vendedor_loja_idloja;
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(String datavenda) {
        this.datavenda = datavenda;
    }
    
    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public int getProduto_idproduto() {
        return produto_idproduto;
    }

    public void setProduto_idproduto(int produto_idproduto) {
        this.produto_idproduto = produto_idproduto;
    }

    public int getProduto_loja_idloja() {
        return produto_loja_idloja;
    }

    public void setProduto_loja_idloja(int produto_loja_idloja) {
        this.produto_loja_idloja = produto_loja_idloja;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getVendedor_idvendedor() {
        return vendedor_idvendedor;
    }

    public void setVendedor_idvendedor(int vendedor_idvendedor) {
        this.vendedor_idvendedor = vendedor_idvendedor;
    }

    public int getVendedor_loja_idloja() {
        return vendedor_loja_idloja;
    }

    public void setVendedor_loja_idloja(int vendedor_loja_idloja) {
        this.vendedor_loja_idloja = vendedor_loja_idloja;
    }
    
}
