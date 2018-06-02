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

    public long createReceita(ReceitasBEAN r) {
        r.setIdTipo(selecionaMaiorValor() + 1);
        String query = "INSERT INTO `receita` (`id`, `valor`, `id_usuario`, `DataInclusao`, `id_grupo`, `id_tipo`, `documento`) "
                + "VALUES ('"+r.getIdReceita()+"', '"+r.getValor()+"', '"+r.getIdUsuario()+"', '"+r.getData()+"', '"+r.getIdGrupo()+"', '"+r.getIdTipo()+"', '"+r.getDocumento()+"')";
        return MySQLDAO.executeQuery(query);
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

    public ArrayList<ReceitasBEAN> findAllReceitasUsuario(int IdUsuario) {
        return listaReceitas("SELECT * FROM receita WHERE id_usuario=" + IdUsuario);
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
    
    private int selecionaMaiorValor(){
        String query = "SELECT max(id) FROM receita";
        int id = -1;
        ResultSet rs = MySQLDAO.getResultSet(query);
        try {
            if (rs.next()) {
                id = rs.getInt("max(id)");
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
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
//    
    public static void main(String[] args) {
        ReceitasBEAN r = new ReceitasBEAN();
        r.setDocumento("Teste");
        r.setIdGrupo(3);
        r.setIdReceita(3);
        r.setIdTipo(3);
        r.setIdUsuario(3);
        r.setValor(5000);
        r.setData("2018-05-31");
        ReceitasDAO.getInstance().createReceita(r);
    }
    
}
