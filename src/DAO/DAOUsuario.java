/**
 *========================== ======================== =======================
 * ==================@author Jarmison   MEU    GitHub: FireXtz ============================
 * ==========================================================================
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
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class DAOUsuario extends ConexaoSQLite{
    //  conexao para salvar o usuario (USUARIO DO LOGIN ADM)
    public boolean SalvarUsuarioDao (ModelUsuario pmodelUsuario){
        
        conectar();
        String sql = "INSERT INTO tbl_Usuario(nome_usuario,senha_usuario) VALUES (?,?) ";
        
        PreparedStatement preparedStatement = criarPreparedStatement(sql,Statement.RETURN_GENERATED_KEYS);
        
        try {
            
            
            preparedStatement.setString(1, pmodelUsuario.getNome_usuario());
            preparedStatement.setString(2, pmodelUsuario.getSenha_usuario());
           
           
            preparedStatement.executeUpdate();
            
            
            
          } catch (SQLException ex) {
          Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
          return false;
        }
       desconectar();
       return true;
    
    }
   
    //Listar os usuarios do banco de dados em uma lista publica 
    


    public List<ModelUsuario> getListaUsuarioDAO() {
       List <ModelUsuario> listaUsuario = new ArrayList<>();
       ModelUsuario modelUsuario = new ModelUsuario();
              
         
              
              ResultSet resultSet = null;
              PreparedStatement preparedStatement = null;
              
          String sql = "SELECT  pk_id_usuario,nome_usuario,senha_usuario FROM tbl_Usuario";
         
          System.out.println(sql);
             
             try {
                     this.conectar();
                     
          preparedStatement = criarPreparedStatement(sql);
          resultSet = preparedStatement.executeQuery();
                 while (resultSet.next()) {
                    modelUsuario = new ModelUsuario();
                    modelUsuario.setId_usuario(resultSet.getInt(1));
                    modelUsuario.setNome_usuario(resultSet.getString(2));
                    modelUsuario.setSenha_usuario(resultSet.getString(3));
                    listaUsuario.add(modelUsuario);
                     
                 }
      } catch (Exception e) {
                 System.err.println(e);
      }
             finally{
                this.desconectar();    
             }
         
        return listaUsuario;
        
    }
    // excluir o usuario 
    
    
    public boolean deletarUsuarioDAO(int pCodigo) {
        this.conectar();
      String  sql = "DELETE FROM tbl_Usuario WHERE pk_id_usuario= '"+pCodigo+"'";
      PreparedStatement preparedStatement = this.criarPreparedStatement(sql);
        System.out.println(sql);
        try {
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        // caso tenha excessao no meu PreparedStatement usar um finally
        
        finally {
        if (preparedStatement !=null) {
            
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                 Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
        
        
        
        }
        
        
        
    this.desconectar();
    return true;
    
    }
   
    public ModelUsuario getUsuarioDAO(int pCodigoUsuario){
        ModelUsuario modelUsuario = new ModelUsuario();
    conectar();
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    
    String sql = "SELECT  pk_id_usuario,nome_usuario,senha_usuario FROM tbl_Usuario WHERE pk_id_usuario = '"+pCodigoUsuario+"'";
    preparedStatement = criarPreparedStatement(sql);
      System.out.println(sql);
        try {
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()){
              modelUsuario = new ModelUsuario();
              modelUsuario.setId_usuario(resultSet.getInt(1));
              modelUsuario.setNome_usuario(resultSet.getString(2));
              modelUsuario.setSenha_usuario(resultSet.getString(3));
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
        }
        
       
        
     desconectar();   
    return modelUsuario;
    }
    
    public boolean atualizarUsuario(ModelUsuario  modelUsuario){
        this.conectar();
      
    String sql = "UPDATE tbl_Usuario SET nome_usuario =?, senha_usuario=?,pk_id_usuario=? WHERE pk_id_usuario=  '"+modelUsuario.getId_usuario()+"'";
   PreparedStatement preparedStatement = this.criarPreparedStatement(sql);
   System.out.println(sql);
   
        try {
            preparedStatement.setString(1, modelUsuario.getNome_usuario());
            preparedStatement.setString(2, modelUsuario.getSenha_usuario());
            preparedStatement.setInt(3, modelUsuario.getId_usuario());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        finally {
        if (preparedStatement !=null) {
            
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                 Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
        
        
        
        }
    
    this.desconectar();
    return true;
    
    }
    
    
}
