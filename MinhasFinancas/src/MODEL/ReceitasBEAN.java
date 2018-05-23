package MODEL;

import java.sql.Date;

/**
 *
 * @author Bruno
 */
public class ReceitasBEAN {

    private int idReceita;
    private double valor;
    private Integer idUsuario;
    private Integer idGrupo;
    private Integer idTipo;

    public ReceitasBEAN(int idReceita, double valor, Integer idUsuario, Integer idGrupo, Integer idTipo) {
        this.idReceita = idReceita;
        this.valor = valor;
        this.idUsuario = idUsuario;
        this.idGrupo = idGrupo;
        this.idTipo = idTipo;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }    
}
