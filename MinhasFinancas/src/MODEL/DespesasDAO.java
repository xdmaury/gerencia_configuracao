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
public class DespesasDAO {
    private static DespesasDAO instance;
    
    private DespesasDAO(){
        MySQLDAO.getConnection();
    }
    
    public static DespesasDAO getInstance() {
        if (instance == null) {
            instance = new DespesasDAO();
        }
        return instance;
    }
    
    public long create(DespesasBEAN despesa) {
        String query = "INSERT INTO ttCredito(idttCredito, Documento, ValorOriginal, Origem, Situacao, Parcela, DataInclusao, DataVencimento,"
                + " ICMS, PIS, COFINS, tcGrupoContas_idGrupoContas, tcTipoConta_idTipoConta) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        return MySQLDAO.executeQuery(query, 
                despesa.getDocumento(), 
                despesa.getValorOriginal(), 
                despesa.getOrigem(),
                despesa.getSituacao(),
                despesa.getParcela(),
                despesa.getDataInclusao(),
                despesa.getDataVencimento(),
                despesa.getICMS(),
                despesa.getPIS(),
                despesa.getCOFINS(),
                despesa.getIdGrupoContas(),
                despesa.getIdTipoConta());
    }

    /*public void update(DespesasBEAN despesa) {
        String query = "UPDATE despesaES SET Nome=?, status=? WHERE iddespesa = ?";
        MySQLDAO.executeQuery(query, despesa.getNome(), despesa.getStatus(), despesa.getIddespesa());
    }
    */
    
    public ArrayList<DespesasBEAN> findAlldespesas(){
        return listadespesas ("SELECT * FROM ttCredito ORDER BY idttCredito");
    }
    
    public ArrayList<DespesasBEAN> listadespesas(String query) {
        ArrayList<DespesasBEAN> lista = new ArrayList<DespesasBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new DespesasBEAN(rs.getInt("idttCredito"), rs.getString("Documento"), rs.getFloat("ValorOriginal"), rs.getString("Origem"),
                        rs.getInt("Situacao"), rs.getInt("Parcela"), rs.getDate("DataInclusao"), rs.getDate("DataVencimento"), rs.getInt("ICMS"),
                        rs.getInt("PIS"), rs.getInt("COFINS"), rs.getInt("tcGrupoContas_idGrupoContas"), rs.getInt("tcTipoConta_idTipoConta")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public DespesasBEAN finddespesa(int iddespesa) {
        DespesasBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM despesaES WHERE iddespesa=?", iddespesa);
        try {
            if (rs.next()) {
                result = new DespesasBEAN(rs.getInt("idttCredito"), rs.getString("Documento"), rs.getFloat("ValorOriginal"), rs.getString("Origem"),
                        rs.getInt("Situacao"), rs.getInt("Parcela"), rs.getDate("DataInclusao"), rs.getDate("DataVencimento"), rs.getInt("ICMS"),
                        rs.getInt("PIS"), rs.getInt("COFINS"), rs.getInt("idGrupoContas"), rs.getInt("idTipoConta"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public void updateSituacao(DespesasBEAN despesa) {
        String query = "UPDATE ttCredito SET Situacao = ? WHERE idttCredito = ?";
        MySQLDAO.executeQuery(query, despesa.getSituacao(), despesa.getIdttCredito());
    }
    
    public Boolean isExist(int iddespesa) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM despesaES WHERE iddespesa= ?", iddespesa);
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
