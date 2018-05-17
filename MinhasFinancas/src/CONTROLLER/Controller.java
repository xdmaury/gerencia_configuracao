package CONTROLLER;

import MODEL.*;
import java.util.ArrayList;

public class Controller {
    
    public static ArrayList<GrupoContasBEAN> listaGrupoContas(){
        return GrupoContasDAO.getInstance().list();
    }
    
    public static ArrayList<TipoContasBEAN> listaTipoContas(){
        return TipoContasDAO.getInstance().list();
    }
    
    public void addDespesa(DespesasBEAN despesa){
        DespesasDAO.getInstance().create(despesa);
    }
    
    public void listarDespesas(){
        DespesasDAO.getInstance().findAlldespesas();
    }
    
//    public static void main(String[] args) {
//        Controller c = new Controller();
//        c.listaGrupoContas();
//    }
    
}
