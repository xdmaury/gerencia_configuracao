/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marco
 */
public class GrupoContasDAO {
    
    private static GrupoContasDAO instance;

    public GrupoContasDAO() {
        MySQLDAO.getConnection();
    }

    public static GrupoContasDAO getInstance() {
        if (instance == null) {
            instance = new GrupoContasDAO();
        }
        return instance;
    }
    
    public ArrayList<GrupoContasBEAN> list(){
        return list("SELECT * FROM `tcGrupoContas`");
    }
    
    private ArrayList<GrupoContasBEAN> list(String query){
        ArrayList<GrupoContasBEAN> list = new ArrayList<>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                list.add(new GrupoContasBEAN(rs.getInt("idGrupoContas"), rs.getString("Descricao")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(GrupoContasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}