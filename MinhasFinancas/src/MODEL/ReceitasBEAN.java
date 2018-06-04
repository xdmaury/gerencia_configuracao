package MODEL;

import java.sql.Date;

/**
 *
 * @author Bruno
 */
public class ReceitasBEAN {

    private int idReceita;
    private double valor;
    private int idUsuario;
    private int idGrupo;
    private int idTipo;
    private String documento;
    private String data;

    public ReceitasBEAN() {
    }

    public ReceitasBEAN(int idReceita, double valor, int idUsuario, int idGrupo, int idTipo, String documento, String data) {
        this.idReceita = idReceita;
        this.valor = valor;
        this.idUsuario = idUsuario;
        this.idGrupo = idGrupo;
        this.idTipo = idTipo;
        this.documento = documento;
        this.data = data;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
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
