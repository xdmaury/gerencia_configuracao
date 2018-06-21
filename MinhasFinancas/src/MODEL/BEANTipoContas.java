/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Bruno
 */
public class BEANTipoContas {

    int idTipoConta;
    private String descricao;
    int id_grupo;

    public BEANTipoContas(int idTipoConta, String descricao, int id_grupo) {
        this.idTipoConta = idTipoConta;
        this.descricao = descricao;
        this.id_grupo = id_grupo;
    }

    public int getIdTipoConta() {
        return idTipoConta;
    }

    public void setIdTipoConta(int idTipoConta) {
        this.idTipoConta = idTipoConta;
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
