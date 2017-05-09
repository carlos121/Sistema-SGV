/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.Logica;

/**
 *
 * @author CS INOVAÇÃO
 */
public class Funcionario1 {

    private int Id;
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String cidade;
    private String estado;
    private String login;
    private String senha;
    private int loja_idloja;

    
    public String getCidade() {
        return cidade;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getLoja_idloja() {
        return loja_idloja;
    }

    public void setLoja_idloja(int loja_idloja) {
        this.loja_idloja = loja_idloja;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
