package CONTROLLER;

import MODEL.*;
import java.util.ArrayList;

public class Controller {

//    Grupos de contas
    public static ArrayList<GrupoContasBEAN> listaGrupoContas() {
        return GrupoContasDAO.getInstance().findListGrupo();
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

    public ArrayList<DespesasBEAN> listarDespesas() {
        return DespesasDAO.getInstance().findAlldespesas();
    }

//    Usuarios
    public static UsuarioBEAN buscaUsuario(String nome_usuario, String senha) {
        return UsuarioDAO.getInstance().find(nome_usuario, senha);
    }

    public ArrayList<DespesasBEAN> listarDespesasVencidas(String data) {
        return DespesasDAO.getInstance().findDespesasVencimento(data);
    }

}
