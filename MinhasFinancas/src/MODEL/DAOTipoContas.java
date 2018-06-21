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
public class DAOTipoContas {

    private static DAOTipoContas instance;

    public DAOTipoContas() {
        MySQLDAO.getConnection();
    }

    public static DAOTipoContas getInstance() {
        if (instance == null) {
            instance = new DAOTipoContas();
        }
        return instance;
    }

    public ArrayList<BEANTipoContas> findlistTipo() {
        return list("SELECT * FROM tipo");
    }

    public ArrayList<BEANTipoContas> findlistTipo(int id) {
        return list("SELECT * FROM `tipo` WHERE `id_grupo` = " + id + " ORDER BY `id` ASC ");
    }

    private ArrayList<BEANTipoContas> list(String query) {
        ArrayList<BEANTipoContas> list = new ArrayList<>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                list.add(new BEANTipoContas(rs.getInt("id"), rs.getString("descricao"), rs.getInt("id_grupo")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOTipoContas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
