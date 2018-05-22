package CONTROLLER;

import MODEL.*;
import java.util.ArrayList;

public class Controller {

    public static ArrayList<GrupoContasBEAN> listaGrupoContas() {
        return GrupoContasDAO.getInstance().findListGrupo();
    }

    public static ArrayList<TipoContasBEAN> listaTipoContas() {
        return TipoContasDAO.getInstance().findlistTipo();
    }

    public static void addDespesa(DespesasBEAN despesa) {
        DespesasDAO.getInstance().create(despesa);
    }

    public ArrayList<DespesasBEAN> listarDespesas() {
        return DespesasDAO.getInstance().findAlldespesas();
    }

}
