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
public class DAOGrupoContas {

    private static DAOGrupoContas instance;

    public DAOGrupoContas() {
        MySQLDAO.getConnection();
    }

    public static DAOGrupoContas getInstance() {
        if (instance == null) {
            instance = new DAOGrupoContas();
        }
        return instance;
    }

    public ArrayList<BEANGrupoContas> findListGrupo() {
        return list("SELECT * FROM grupo");
    }

    public ArrayList<BEANGrupoContas> findListGrupo(int id) {
        return list("SELECT * FROM `grupo` WHERE `id` = " + id);
    }

    private ArrayList<BEANGrupoContas> list(String query) {
        ArrayList<BEANGrupoContas> list = new ArrayList<>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                list.add(new BEANGrupoContas(rs.getInt("id"), rs.getString("descricao")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOGrupoContas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
