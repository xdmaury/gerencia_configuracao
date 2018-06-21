/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class DAODespesas {

    private static DAODespesas instance;

    private DAODespesas() {
        MySQLDAO.getConnection();
    }

    public static DAODespesas getInstance() {
        if (instance == null) {
            instance = new DAODespesas();
        }
        return instance;
    }

    public long create(BEANDespesas despesa) {
        String query = "INSERT INTO Despesa(valor, descricao, situacao, vencimento, parcela, vezes, icms, pis, cofins, id_usuario, id_grupo, id_tipo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        return MySQLDAO.executeQuery(query,
                despesa.getValor(),
                despesa.getDescricao(),
                despesa.getSituacao(),
                despesa.getVencimento(),
                despesa.getParcelado(),
                despesa.getVezes(),
                despesa.getIcms(),
                despesa.getPis(),
                despesa.getCofins(),
                despesa.getId_usuario(),
                despesa.getId_grupo(),
                despesa.getId_tipo());
    }

    public ArrayList<BEANDespesas> findAlldespesas() {
        return listadespesas("SELECT * FROM Despesa");
    }

    public ArrayList<BEANDespesas> findAlldespesas(int id) {
        return listadespesas("SELECT * FROM Despesa WHERE id_usuario = " + id);
    }

    public ArrayList<BEANDespesas> findAlldespesas(int id, int situacao, String inicio, String fim) {
        return listadespesas("SELECT * FROM `Despesa` WHERE `situacao` = " + situacao + " AND `vencimento` >= '" + inicio + "' AND `vencimento` <= '" + fim + "' AND `id_usuario` = " + id + " ORDER BY `Despesa`.`id_tipo` ASC");
    }

    public ArrayList<BEANDespesas> findAlldespesasApagar(int id) {
        return listadespesas("SELECT * FROM `Despesa` WHERE `situacao` = 0 AND `id_usuario` = " + id);
    }

    public ArrayList<BEANDespesas> findAlldespesasPagas(int id) {
        return listadespesas("SELECT * FROM `Despesa` WHERE `situacao` = -1 AND `id_usuario` = " + id);
    }

    public ArrayList<BEANDespesas> findData(int IdUsuario, String data) {
        return listadespesas("SELECT * FROM Despesa WHERE id_usuario =" + IdUsuario + " and vencimento LIKE '%" + data + "%'and situacao =" + 0);
    }

    public ArrayList<BEANDespesas> listadespesas(String query) {
        ArrayList<BEANDespesas> lista = new ArrayList<BEANDespesas>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new BEANDespesas(
                        rs.getInt("id"),
                        rs.getFloat("valor"),
                        rs.getString("descricao"),
                        rs.getInt("situacao"),
                        rs.getString("vencimento"),
                        rs.getInt("parcela"),
                        rs.getInt("vezes"),
                        rs.getFloat("icms"),
                        rs.getFloat("pis"),
                        rs.getFloat("cofins"),
                        rs.getInt("id_usuario"),
                        rs.getInt("id_grupo"),
                        rs.getInt("id_tipo")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void atualizarSituacao(int situacao, int id) {
        String query = "UPDATE `Despesa` SET `situacao` = '" + situacao + "' WHERE `Despesa`.`id` = " + id;
        MySQLDAO.executeQuery(query);
    }

    public BEANDespesas finddespesa(int iddespesa) {
        BEANDespesas result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM Despesa WHERE id=?", iddespesa);
        try {
            if (rs.next()) {
                result = new BEANDespesas(
                        rs.getInt("id"),
                        rs.getFloat("valor"),
                        rs.getString("descricao"),
                        rs.getInt("situacao"),
                        rs.getString("vencimento"),
                        rs.getInt("parcela"),
                        rs.getInt("vezes"),
                        rs.getFloat("icms"),
                        rs.getFloat("pis"),
                        rs.getFloat("cofins"),
                        rs.getInt("id_usuario"),
                        rs.getInt("id_grupo"),
                        rs.getInt("id_tipo"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean isExist(int iddespesa) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM Despesa WHERE id= ?", iddespesa);
        try {
            if (rs.next()) {
                result = true;
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
