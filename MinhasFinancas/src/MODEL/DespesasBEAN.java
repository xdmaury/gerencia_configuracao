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
public class DespesasBEAN {
    private int idttCredito;
    private String Documento;
    private float ValorOriginal;
    private String Origem;
    private int Situacao;
    private int Parcela;
    private String DataInclusao;
    private String DataVencimento;
    private int ICMS;
    private int PIS;
    private int COFINS;
    private int idGrupoContas;
    private int idTipoConta;

    public DespesasBEAN(){
        
    }
    public DespesasBEAN(int idttCredito, String Documento, float ValorOriginal, String Origem, int Situacao, int Parcela, String DataInclusao, String DataVencimento, int ICMS, int PIS, int COFINS, int idGrupoContas, int idTipoCOnta) {
        this.idttCredito = idttCredito;
        this.Documento = Documento;
        this.ValorOriginal = ValorOriginal;
        this.Origem = Origem;
        this.Situacao = Situacao;
        this.Parcela = Parcela;
        this.DataInclusao = DataInclusao;
        this.DataVencimento = DataVencimento;
        this.ICMS = ICMS;
        this.PIS = PIS;
        this.COFINS = COFINS;
        this.idGrupoContas = idGrupoContas;
        this.idTipoConta = idTipoCOnta;
    }
    public DespesasBEAN(String Documento, float ValorOriginal, String Origem, int Situacao, int Parcela, String DataInclusao, String DataVencimento, int ICMS, int PIS, int COFINS, int idGrupoContas, int idTipoCOnta) {
        this.Documento = Documento;
        this.ValorOriginal = ValorOriginal;
        this.Origem = Origem;
        this.Situacao = Situacao;
        this.Parcela = Parcela;
        this.DataInclusao = DataInclusao;
        this.DataVencimento = DataVencimento;
        this.ICMS = ICMS;
        this.PIS = PIS;
        this.COFINS = COFINS;
        this.idGrupoContas = idGrupoContas;
        this.idTipoConta = idTipoCOnta;
    }

    public int getIdttCredito() {
        return idttCredito;
    }

    public void setIdttCredito(int idttCredito) {
        this.idttCredito = idttCredito;
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

    public String getDataInclusao() {
        return DataInclusao;
    }

    public void setDataInclusao(String DataInclusao) {
        this.DataInclusao = DataInclusao;
    }

    public String getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(String DataVencimento) {
        this.DataVencimento = DataVencimento;
    }

    public int getICMS() {
        return ICMS;
    }

    public void setICMS(int ICMS) {
        this.ICMS = ICMS;
    }

    public int getPIS() {
        return PIS;
    }

    public void setPIS(int PIS) {
        this.PIS = PIS;
    }

    public int getCOFINS() {
        return COFINS;
    }

    public void setCOFINS(int COFINS) {
        this.COFINS = COFINS;
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