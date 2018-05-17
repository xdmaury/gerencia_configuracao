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
 * @author Bruno
 */
public class TipoContasDAO {
    private static TipoContasDAO instance;

    public TipoContasDAO() {
        MySQLDAO.getConnection();
    }

    public static TipoContasDAO getInstance() {
        if (instance == null) {
            instance = new TipoContasDAO();
        }
        return instance;
    }
    
    public ArrayList<TipoContasBEAN> list(){
        return list("SELECT * FROM `tcTipoConta`");
    }
    
    private ArrayList<TipoContasBEAN> list(String query){
        ArrayList<TipoContasBEAN> list = new ArrayList<>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                list.add(new TipoContasBEAN(rs.getInt("idTipoConta"), rs.getString("descricao"), rs.getInt("tributos?")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TipoContasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
