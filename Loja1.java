/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.Logica;

/**
 *
 * @author CS INOVAÇÃO
 */
public class Loja1 {

    private int idloja;
    private String nomeloja;
    private String cnpj;
    private String endereco;
    private String cidade;
    private String estado;
    private int telefone;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdloja() {
        return idloja;
    }

    public void setIdloja(int idloja) {
        this.idloja = idloja;
    }

    public String getNomeloja() {
        return nomeloja;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
