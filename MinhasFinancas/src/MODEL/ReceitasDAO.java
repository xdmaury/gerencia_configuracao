package MODEL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class ReceitasDAO {

    private static ReceitasDAO instance;

    private ReceitasDAO() {
        MySQLDAO.getConnection();
    }

    public static ReceitasDAO getInstance() {
        if (instance == null) {
            instance = new ReceitasDAO();
        }
        return instance;
    }

    public long createReceita(ReceitasBEAN receita) {
        String query = "INSERT INTO receita (id, valor, id_usuario, id_grupo, id_tipo) "
                + "VALUES (?,?,?,?,?)";
        return MySQLDAO.executeQuery(query,
                receita.getValor(), receita.getIdUsuario(), receita.getIdGrupo(), receita.getIdTipo());
    }

    public ArrayList<ReceitasBEAN> listaReceitas(String query) {
        ArrayList<ReceitasBEAN> lista = new ArrayList<ReceitasBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new ReceitasBEAN(rs.getInt("id"), rs.getDouble("valor"), rs.getInt("id_usuario"),
                        rs.getInt("id_grupo"), rs.getInt("id_tipo")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<ReceitasBEAN> findAllReceitas() {
        return listaReceitas("SELECT * FROM receita ORDER BY id");
    }

    public ReceitasBEAN findReceita(int idReceita) {
        ReceitasBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM receita WHERE id=?", idReceita);
        try {
            if (rs.next()) {
                result = new ReceitasBEAN(rs.getInt("id"), rs.getDouble("valor"), rs.getInt("id_usuario"),
                        rs.getInt("id_grupo"), rs.getInt("id_tipo"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
//    public boolean alterarReceita(double valor, Integer idUsuario, Integer idGrupo, Integer idTipo) {
//        PreparedStatement pst = null;
//        String sql = "update receita set valor=?, id_usuario=?, id_grupo=?, id_tipo=? where idCliente=?";
//        try {
//            pst = MySQLDAO.getResultSet(sql);
//            pst.setDouble(1, valor);
//            pst.setInt(2, idUsuario);
//            pst.setInt(3, idGrupo);
//            pst.setInt(4, idTipo);
//            if ((nome.isEmpty()) || (telefone.isEmpty())) {//validação dos campos obrigatorios
//                JOptionPane.showMessageDialog(null, "Atenção!! Preencha todos os campos obrigatórios");
//            } else {
//                //atualizando a tabela(clientes) com os dados dos campos
//                //confirmando a inserção
//                int adicionado = pst.executeUpdate();
//                //System.out.println(adicionado);
//                if (adicionado > 0) {
//                    JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
//                    return true;
//                }
//            }
//            //pst.executeUpdate();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//            return false;
//        }
//        return false;
//    }
    
//    public void updateSituacaoReceita(ReceitasBEAN receita) {
//        String query = "UPDATE ttDedito SET Situacao = ? WHERE idttDedito = ?";
//        MySQLDAO.executeQuery(query, receita.getSituacao(), receita.getIdttDebito());
//    }
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
