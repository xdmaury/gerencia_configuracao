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
    private String documento;
    private String data;

    public ReceitasBEAN(int idReceita, double valor, Integer idUsuario, Integer idGrupo, Integer idTipo) {
        this.idReceita = idReceita;
        this.valor = valor;
        this.idUsuario = idUsuario;
        this.idGrupo = idGrupo;
        this.idTipo = idTipo;
    }

    public ReceitasBEAN(int idReceita, double valor, Integer idUsuario, Integer idGrupo, Integer idTipo, String documento) {
        this.idReceita = idReceita;
        this.valor = valor;
        this.idUsuario = idUsuario;
        this.idGrupo = idGrupo;
        this.idTipo = idTipo;
        this.documento = documento;
    }

    public ReceitasBEAN() {
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
