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
        String query = "INSERT INTO ttBebito(Documento, ValorOriginal, Origem, "
                + "Situacao, parcela, DataInclusao, DataVencimento, DataPagamento, "
                + "tcTipoConta_idTipoConta, tcGrupoContas_idGrupoContas) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        return MySQLDAO.executeQuery(query,
                receita.getDocumento(),
                receita.getValorOriginal(),
                receita.getOrigem(),
                receita.getSituacao(),
                receita.getParcela(),
                receita.getDataInclusao(),
                receita.getDataVencimento(),
                receita.getDataInclusao(),
                receita.getDataPagamento(),
                receita.getIdTipoConta(),
                receita.getIdGrupoContas());
    }

    public ArrayList<ReceitasBEAN> findAllReceitas() {
        return listaReceitas("SELECT * FROM ttDebito ORDER BY idttDebito");
    }

    public ArrayList<ReceitasBEAN> listaReceitas(String query) {
        ArrayList<ReceitasBEAN> lista = new ArrayList<ReceitasBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new ReceitasBEAN(rs.getInt("idttDedito"), rs.getString("Documento"), rs.getFloat("ValorOriginal"),
                        rs.getString("Origem"), rs.getInt("Situacao"), rs.getInt("Parcela"), rs.getDate("DataInclusao"),
                        rs.getDate("DataVencimento"), rs.getDate("DataPagamento"), rs.getInt("idGrupoContas"), rs.getInt("idTipoConta")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
/*
    public DespesasBEAN findReceita(int idReceita) {
        DespesasBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM ttDebito WHERE idttDebito=?", idReceita);
        try {
            if (rs.next()) {
                result = new DespesasBEAN(rs.getInt("idttCredito"), rs.getString("Documento"), rs.getFloat("ValorOriginal"), rs.getString("Origem"),
                        rs.getInt("Situacao"), rs.getInt("Parcela"), rs.getString("DataInclusao"), rs.getString("DataVencimento"), rs.getInt("ICMS"),
                        rs.getInt("PIS"), rs.getInt("COFINS"), rs.getInt("idGrupoContas"), rs.getInt("idTipoConta"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
*/
    public void updateSituacaoReceita(ReceitasBEAN receita) {
        String query = "UPDATE ttDedito SET Situacao = ? WHERE idttDedito = ?";
        MySQLDAO.executeQuery(query, receita.getSituacao(), receita.getIdttDebito());
    }

    public Boolean isExistReceita(int idReceita) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM ttDebito WHERE idttDebito = ?", idReceita);
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
