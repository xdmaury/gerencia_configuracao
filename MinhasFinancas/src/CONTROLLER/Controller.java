package CONTROLLER;

import MODEL.GrupoContasBEAN;
import MODEL.GrupoContasDAO;
import java.util.ArrayList;

public class Controller {
    
    public static ArrayList<GrupoContasBEAN> listaGrupoContas(){
        return GrupoContasDAO.getInstance().list();
    }
    
//    public static void main(String[] args) {
//        Controller c = new Controller();
//        c.listaGrupoContas();
//    }
    
}
