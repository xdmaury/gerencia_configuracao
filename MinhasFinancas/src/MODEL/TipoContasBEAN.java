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
public class TipoContasBEAN {
    int idTipoConta;
    String descricao;
    int tributos;

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

    public int getTributos() {
        return tributos;
    }

    public void setTributos(int tributos) {
        this.tributos = tributos;
    }

    public TipoContasBEAN(int idTipoConta, String descricao, int tributos) {
        this.idTipoConta = idTipoConta;
        this.descricao = descricao;
        this.tributos = tributos;
    }
}
