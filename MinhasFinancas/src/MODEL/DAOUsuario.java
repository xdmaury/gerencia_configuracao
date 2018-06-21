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
public class DAOUsuario {

    private static DAOUsuario instance;

    public DAOUsuario() {
        MySQLDAO.getConnection();
    }

    public static DAOUsuario getInstance() {
        if (instance == null) {
            instance = new DAOUsuario();
        }
        return instance;
    }

    public BEANUsuario find(String nome_usuario, String senha) {
        BEANUsuario usuario = new BEANUsuario();
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
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuario;
    }

    public void create(BEANUsuario u) {
        u.setId(DAOUsuario.getInstance().selecionaMaiorValor() + 1);
        String query = "INSERT INTO `usuario` (`id`, `nome`, `nome_usuario`, `senha`) VALUES ('" + u.getId() + "' , '" + u.getNome() + "', '" + u.getNome_usuario() + "', '" + u.getSenha() + "')";
        MySQLDAO.executeQuery(query);
    }

    private int selecionaMaiorValor() {
        String query = "SELECT max(id) FROM usuario";
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

    public Boolean isExistUsuario(int id) {
        String query = "SELECT * FROM `usuario` WHERE `id` = " + id;
        Boolean result = false;
        ResultSet rs = MySQLDAO.getResultSet(query);
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

//    public static void main(String[] args) {
//        System.out.println(UsuarioDAO.getInstance().isExistUsuario(3));
////        UsuarioDAO.getInstance().isExistUsuario(3);
//    }
}
