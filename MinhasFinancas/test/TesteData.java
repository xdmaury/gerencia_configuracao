
import MODEL.DespesasBEAN;
import java.sql.Date;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcos
 */
public class TesteData {
    public static void main(String[] args) {
        Date datah = new Date(System.currentTimeMillis());
        String inicio = null, fim = null;
        inicio = fim = datah.toString();
        inicio = inicio.substring(0, 8) + "01";
        fim = fim.substring(0, 8) + "30";
        ArrayList<DespesasBEAN> lista = CONTROLLER.Controller.listarDespesas(3, 0, inicio, fim);
    }
}
