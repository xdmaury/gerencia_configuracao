/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcos
 */
public class UsuarioDAO {
    
    private static UsuarioDAO instance;

    public UsuarioDAO() {
        MySQLDAO.getConnection();
    }
    
    public static UsuarioDAO getInstance() {
        if (instance == null) {
            instance = new UsuarioDAO();
        }
        return instance;
    }
    
    public UsuarioBEAN find(String nome_usuario, String senha){
        UsuarioBEAN usuario = new UsuarioBEAN();
        String query = "SELECT * from usuario WHERE nome_usuario = '" + nome_usuario + "' AND senha = '" + senha + "'";
        ResultSet rs = MySQLDAO.getResultSet(query);
        try {
            if (rs.next()) {
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setNome_usuario(rs.getString("nome_usuario"));
                usuario.setSenha(rs.getString("senha"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usuario;
    }
    
    public void create(UsuarioBEAN u){
        u.setId(UsuarioDAO.getInstance().selecionaMaiorValor() + 1);
        String query = "INSERT INTO `usuario` (`id`, `nome`, `nome_usuario`, `senha`) VALUES ('"+u.getId()+"' , '"+ u.getNome() +"', '"+u.getNome_usuario()+"', '"+u.getSenha()+"')";
        MySQLDAO.executeQuery(query);
    }
    
    private int selecionaMaiorValor(){
        String query = "SELECT max(id) FROM usuario";
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
    
}
