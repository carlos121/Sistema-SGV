/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.Logica;

/**
 *
 * @author CS INOVAÇÃO
 */
public class Fornecedor1 {

    private int Id;
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String cidade;
    private String estado;
    private String descricao;
    private String cnpj;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
