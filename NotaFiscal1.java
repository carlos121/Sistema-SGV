/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.Logica;

/**
 *
 * @author CS INOVAÇÃO
 */
public class NotaFiscal1 {
    
    private int idnotaFiscal;
    private String datanota;
    private String descricaonota;
    private int venda_idvenda;
    private int venda_produto_idproduto;
    private int venda_produto_loja_idloja;
    private int venda_vendedor_idvendedor;
    private int venda_vendedor_loja_idloja;

    public String getDatanota() {
        return datanota;
    }

    public void setDatanota(String datanota) {
        this.datanota = datanota;
    }
    
    public String getDescricaonota() {
        return descricaonota;
    }

    public void setDescricaonota(String descricaonota) {
        this.descricaonota = descricaonota;
    }

    public int getIdnotaFiscal() {
        return idnotaFiscal;
    }

    public void setIdnotaFiscal(int idnotaFiscal) {
        this.idnotaFiscal = idnotaFiscal;
    }

    public int getVenda_idvenda() {
        return venda_idvenda;
    }

    public void setVenda_idvenda(int venda_idvenda) {
        this.venda_idvenda = venda_idvenda;
    }

    public int getVenda_produto_idproduto() {
        return venda_produto_idproduto;
    }

    public void setVenda_produto_idproduto(int venda_produto_idproduto) {
        this.venda_produto_idproduto = venda_produto_idproduto;
    }

    public int getVenda_produto_loja_idloja() {
        return venda_produto_loja_idloja;
    }

    public void setVenda_produto_loja_idloja(int venda_produto_loja_idloja) {
        this.venda_produto_loja_idloja = venda_produto_loja_idloja;
    }

    public int getVenda_vendedor_idvendedor() {
        return venda_vendedor_idvendedor;
    }

    public void setVenda_vendedor_idvendedor(int venda_vendedor_idvendedor) {
        this.venda_vendedor_idvendedor = venda_vendedor_idvendedor;
    }

    public int getVenda_vendedor_loja_idloja() {
        return venda_vendedor_loja_idloja;
    }

    public void setVenda_vendedor_loja_idloja(int venda_vendedor_loja_idloja) {
        this.venda_vendedor_loja_idloja = venda_vendedor_loja_idloja;
    }
}
