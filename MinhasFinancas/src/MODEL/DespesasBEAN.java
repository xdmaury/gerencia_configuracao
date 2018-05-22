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

    private int id;
    private float valor;
    private String descricao;
    private int situacao;
    private String vencimento;
    private int parcelado;
    private int vezes;
    private float icms;
    private float pis;
    private float cofins;
    private int id_usuario;
    private int id_grupo;
    private int id_tipo;

    public DespesasBEAN(int id, float valor, String descricao, int situacao, String vencimento, int parcelado, int vezes, float icms, float pis, float cofins, int id_usuario, int id_grupo, int id_tipo) {
        this.id = id;
        this.valor = valor;
        this.descricao = descricao;
        this.situacao = situacao;
        this.vencimento = vencimento;
        this.parcelado = parcelado;
        this.vezes = vezes;
        this.icms = icms;
        this.pis = pis;
        this.cofins = cofins;
        this.id_usuario = id_usuario;
        this.id_grupo = id_grupo;
        this.id_tipo = id_tipo;
    }

    public DespesasBEAN() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public int getParcelado() {
        return parcelado;
    }

    public void setParcelado(int parcelado) {
        this.parcelado = parcelado;
    }

    public int getVezes() {
        return vezes;
    }

    public void setVezes(int vezes) {
        this.vezes = vezes;
    }

    public float getIcms() {
        return icms;
    }

    public void setIcms(float icms) {
        this.icms = icms;
    }

    public float getPis() {
        return pis;
    }

    public void setPis(float pis) {
        this.pis = pis;
    }

    public float getCofins() {
        return cofins;
    }

    public void setCofins(float cofins) {
        this.cofins = cofins;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    /*
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
     */
}
