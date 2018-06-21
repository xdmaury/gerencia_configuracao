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
public class DAOReceitas {

    private static DAOReceitas instance;

    private DAOReceitas() {
        MySQLDAO.getConnection();
    }

    public static DAOReceitas getInstance() {
        if (instance == null) {
            instance = new DAOReceitas();
        }
        return instance;
    }

    public long createReceita(BEANReceitas r) {
        int id = selecionaMaiorValor() + 1;
        String query = "INSERT INTO `receita` "
                + "(`id`, "
                + "`valor`, "
                + "`id_usuario`, "
                + "`DataInclusao`, "
                + "`id_grupo`, "
                + "`id_tipo`, "
                + "`documento`) "
                + "VALUES ('" + id + "', "
                + "'" + r.getValor() + "', "
                + "'" + r.getIdUsuario() + "', "
                + "'" + r.getData() + "', "
                + "'" + r.getIdGrupo() + "', "
                + "'" + r.getIdTipo() + "', "
                + "'" + r.getDocumento() + "')";
        return MySQLDAO.executeQuery(query);
    }

    private ArrayList<BEANReceitas> listaReceitas(String query) {
        ArrayList<BEANReceitas> lista = new ArrayList<BEANReceitas>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                BEANReceitas r = new BEANReceitas();
                r.setData(rs.getString("DataInclusao"));
                r.setDocumento(rs.getString("documento"));
                r.setIdGrupo(rs.getInt("id_grupo"));
                r.setIdReceita(rs.getInt("id"));
                r.setIdTipo(rs.getInt("id_tipo"));
                r.setIdUsuario(rs.getInt("id_usuario"));
                r.setValor(rs.getFloat("valor"));
                lista.add(r);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<BEANReceitas> findAllReceitas() {
        return listaReceitas("SELECT * FROM receita ORDER BY id");
    }

    public ArrayList<BEANReceitas> findAllReceitasUsuario(int IdUsuario) {
        return listaReceitas("SELECT * FROM receita WHERE id_usuario = " + IdUsuario);
    }

    public BEANReceitas findReceita(int idReceita) {
        BEANReceitas result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM receita WHERE id=?", idReceita);
        try {
            if (rs.next()) {
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    private int selecionaMaiorValor() {
        String query = "SELECT max(id) FROM receita";
        int id = -1;
        ResultSet rs = MySQLDAO.getResultSet(query);
        try {
            if (rs.next()) {
                id = rs.getInt("max(id)");
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public Boolean isExistReceita(int idReceita) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM receita WHERE id = ?", idReceita);
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
