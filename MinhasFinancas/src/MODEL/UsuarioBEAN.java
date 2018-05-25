/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author marcos
 */
public class UsuarioBEAN {

    private int id;
    private String nome;
    private String nome_usuario;
    private String senha;

    public UsuarioBEAN() {
    }

    public UsuarioBEAN(int id, String nome, String nome_usuario, String senha) {
        this.id = id;
        this.nome = nome;
        this.nome_usuario = nome_usuario;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
