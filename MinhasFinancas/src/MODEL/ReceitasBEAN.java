package MODEL;

import java.sql.Date;

/**
 *
 * @author Bruno
 */
public class ReceitasBEAN {

    private int idttDebito;
    private String Documento;
    private float ValorOriginal;
    private String Origem;
    private int Situacao;
    private int Parcela;
    private Date DataInclusao;
    private Date DataVencimento;
    private Date DataPagamento;
    private int idGrupoContas;
    private int idTipoConta;

    public ReceitasBEAN(int idttDebito, String Documento, float ValorOriginal, String Origem, int Situacao,
            int Parcela, Date DataInclusao, Date DataVencimento, Date DataPagamento, int idGrupoContas, int idTipoCOnta) {
        this.idttDebito = idttDebito;
        this.Documento = Documento;
        this.ValorOriginal = ValorOriginal;
        this.Origem = Origem;
        this.Situacao = Situacao;
        this.Parcela = Parcela;
        this.DataInclusao = DataInclusao;
        this.DataVencimento = DataVencimento;
        this.DataPagamento = DataPagamento;
        this.idGrupoContas = idGrupoContas;
        this.idTipoConta = idTipoCOnta;
    }

    public int getIdttDebito() {
        return idttDebito;
    }

    public void setIdttDebito(int idttDebito) {
        this.idttDebito = idttDebito;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public float getValorOriginal() {
        return ValorOriginal;
    }

    public void setValorOriginal(float ValorOriginal) {
        this.ValorOriginal = ValorOriginal;
    }

    public String getOrigem() {
        return Origem;
    }

    public void setOrigem(String Origem) {
        this.Origem = Origem;
    }

    public int getSituacao() {
        return Situacao;
    }

    public void setSituacao(int Situacao) {
        this.Situacao = Situacao;
    }

    public int getParcela() {
        return Parcela;
    }

    public void setParcela(int Parcela) {
        this.Parcela = Parcela;
    }

    public Date getDataInclusao() {
        return DataInclusao;
    }

    public void setDataInclusao(Date DataInclusao) {
        this.DataInclusao = DataInclusao;
    }

    public Date getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(Date DataVencimento) {
        this.DataVencimento = DataVencimento;
    }

    public Date getDataPagamento() {
        return DataPagamento;
    }

    public void setDataPagamento(Date DataPagamento) {
        this.DataPagamento = DataPagamento;
    }

    public int getIdGrupoContas() {
        return idGrupoContas;
    }

    public void setIdGrupoContas(int idGrupoContas) {
        this.idGrupoContas = idGrupoContas;
    }

    public int getIdTipoConta() {
        return idTipoConta;
    }

    public void setIdTipoConta(int idTipoConta) {
        this.idTipoConta = idTipoConta;
    }

}
