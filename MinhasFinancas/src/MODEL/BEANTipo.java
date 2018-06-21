/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author marco
 */
public class BEANTipo {

    private int id;
    private String descricao;
    private int id_grupo;

    public BEANTipo() {
    }

    public BEANTipo(int id, String descricao, int id_grupo) {
        this.id = id;
        this.descricao = descricao;
        this.id_grupo = id_grupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

}
