/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DAO.ConexaoSQLite;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import MODEL.ModelUsuario;

/**
 *========================== ======================== =======================
 * ==================@author Jarmison   MEU    GitHub: FireXtz ============================
 * ==========================================================================
 */
public class DAOUsuario extends ConexaoSQLite{
    //  conexao para salvar o usuario (USUARIO DO LOGIN ADM)
    public boolean SalvarUsuarioDao (ModelUsuario pmodelUsuario){
        
        conectar();
        String sql = "INSERT INTO tbl_Usuario(pk_id_usuario,nome_usuario,senha_usuario) VALUES (?,?,?) ";
        
        PreparedStatement preparedStatement = criarPreparedStatement(sql,Statement.RETURN_GENERATED_KEYS);
        
        try {
            
            
            preparedStatement.setString(1, pmodelUsuario.getNome_usuario());
            preparedStatement.setString(2, pmodelUsuario.getSenha_usuario());
            preparedStatement.setInt(3, pmodelUsuario.getId_usuario());
            
            
          } catch (SQLException ex) {
          Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
          return false;
        }
       desconectar();
       return true;
    
    }
    
    
    
}
