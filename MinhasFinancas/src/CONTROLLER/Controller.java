package CONTROLLER;

import MODEL.*;
import java.util.ArrayList;

public class Controller {

//    Grupos de contas
    public static ArrayList<BEANGrupoContas> listaGrupoContas() {
        return DAOGrupoContas.getInstance().findListGrupo();
    }

    public static ArrayList<BEANGrupoContas> listaGrupoContas(int id) {
        return DAOGrupoContas.getInstance().findListGrupo(id);
    }

//    Tipos de contas
    public static ArrayList<BEANTipoContas> listaTipoContas() {
        return DAOTipoContas.getInstance().findlistTipo();
    }

    public static ArrayList<BEANTipoContas> listaTipoContas(int id) {
        return DAOTipoContas.getInstance().findlistTipo(id);
    }

//    Despesas
    public static void addDespesa(BEANDespesas despesa) {
        DAODespesas.getInstance().create(despesa);
    }

    public static ArrayList<BEANDespesas> listarDespesas() {
        return DAODespesas.getInstance().findAlldespesas();
    }

    public static ArrayList<BEANDespesas> listarDespesas(int id) {
        return DAODespesas.getInstance().findAlldespesas(id);
    }

    public static ArrayList<BEANDespesas> listarDespesas(int id, int situacao, String inicio, String fim) {
        return DAODespesas.getInstance().findAlldespesas(id, situacao, inicio, fim);
    }

    public static ArrayList<BEANDespesas> listarDespesasApagar(int id) {
        return DAODespesas.getInstance().findAlldespesasApagar(id);
    }

    public static void atualizarSituacao(int situacao, int id) {
        DAODespesas.getInstance().atualizarSituacao(situacao, id);
    }

    public ArrayList<BEANDespesas> listarDespesasPagas(int idUsuario) {
        return DAODespesas.getInstance().findAlldespesasPagas(idUsuario);
    }

    public static ArrayList<BEANDespesas> listarDespesasVencidas(int id, String data) {
        return DAODespesas.getInstance().findData(id, data);
    }

//    Usuarios
    public static BEANUsuario buscaUsuario(String nome_usuario, String senha) {
        return DAOUsuario.getInstance().find(nome_usuario, senha);
    }

    public static void addUsuario(BEANUsuario u) {
        DAOUsuario.getInstance().create(u);
    }

    public static Boolean vericaUsuario(int id) {
        return DAOUsuario.getInstance().isExistUsuario(id);
    }

    //Receitas
    public static ArrayList<BEANReceitas> listaReceitasIDusuario(int idUsuario) {
        return DAOReceitas.getInstance().findAllReceitasUsuario(idUsuario);
    }

    public static void addReceita(BEANReceitas r) {
        DAOReceitas.getInstance().createReceita(r);
    }

    public static class listarDespesas {

        public listarDespesas() {
        }
    }

    //Tipos
    public static String getDescricao(int id) {
        return DAOTipo.getInstance().getDescricao(id);
    }
}
