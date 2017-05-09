/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.Logica;

/**
 *
 * @author CS INOVAÇÃO
 */
public class Produto1 {

    private int idproduto;
    private String nome;
    private String valor;
    private String descricao;
    private String status;
    private String loja_idloja;
    private String quantidadeEstoque;
    
    public String getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(String quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getLoja_idloja() {
        return loja_idloja;
    }

    public void setLoja_idloja(String loja_idloja) {
        this.loja_idloja = loja_idloja;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
