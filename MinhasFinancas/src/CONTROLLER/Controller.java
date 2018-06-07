package CONTROLLER;

import MODEL.*;
import java.util.ArrayList;

public class Controller {

//    Grupos de contas
    public static ArrayList<GrupoContasBEAN> listaGrupoContas() {
        return GrupoContasDAO.getInstance().findListGrupo();
    }

    public static ArrayList<GrupoContasBEAN> listaGrupoContas(int id) {
        return GrupoContasDAO.getInstance().findListGrupo(id);
    }

//    Tipos de contas
    public static ArrayList<TipoContasBEAN> listaTipoContas() {
        return TipoContasDAO.getInstance().findlistTipo();
    }

    public static ArrayList<TipoContasBEAN> listaTipoContas(int id) {
        return TipoContasDAO.getInstance().findlistTipo(id);
    }

//    Despesas
    public static void addDespesa(DespesasBEAN despesa) {
        DespesasDAO.getInstance().create(despesa);
    }

    public static ArrayList<DespesasBEAN> listarDespesas() {
        return DespesasDAO.getInstance().findAlldespesas();
    }

    public static ArrayList<DespesasBEAN> listarDespesas(int id) {
        return DespesasDAO.getInstance().findAlldespesas(id);
    }
    
    public static ArrayList<DespesasBEAN> listarDespesas(int id, int situacao, String inicio, String fim) {
        return DespesasDAO.getInstance().findAlldespesas(id, situacao, inicio, fim);
    }
    
    public static ArrayList<DespesasBEAN> listarDespesasApagar(int id) {
        return DespesasDAO.getInstance().findAlldespesasApagar(id);
    }

    public static void atualizarSituacao(int situacao, int id) {
        DespesasDAO.getInstance().atualizarSituacao(situacao, id);
    }
    
    public ArrayList<DespesasBEAN> listarDespesasPagas(int idUsuario){
        return DespesasDAO.getInstance().findAlldespesasPagas(idUsuario);
    }

    public static ArrayList<DespesasBEAN> listarDespesasVencidas(int id, String data) {
        return DespesasDAO.getInstance().findData(id, data);
    }

//    Usuarios
    public static UsuarioBEAN buscaUsuario(String nome_usuario, String senha) {
        return UsuarioDAO.getInstance().find(nome_usuario, senha);
    }

    public static void addUsuario(UsuarioBEAN u) {
        UsuarioDAO.getInstance().create(u);
    }
    
    public static Boolean vericaUsuario(int id){
        return UsuarioDAO.getInstance().isExistUsuario(id);
    }

    //Receitas
    public static ArrayList<ReceitasBEAN> listaReceitasIDusuario(int idUsuario) {
        return ReceitasDAO.getInstance().findAllReceitasUsuario(idUsuario);
    }
    
    public static void addReceita(ReceitasBEAN r){
        ReceitasDAO.getInstance().createReceita(r);
    }

}
