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
import MODEL.ModelEditora;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author sansepiol
 */
public class DAOEditora extends ConexaoSQLite  {
  public boolean SalvarEditoraDao (ModelEditora pmodelEditora){
        
        conectar();
        String sql = "INSERT INTO tbl_editora (nome_editora,cidade_editora) VALUES (?,?) ";
        
        PreparedStatement preparedStatement = criarPreparedStatement(sql,Statement.RETURN_GENERATED_KEYS);
        
        try {
            
            
            preparedStatement.setString(1, pmodelEditora.getNome_editora());
            preparedStatement.setString(2, pmodelEditora.getCidade_editora());
            
           
           
            preparedStatement.executeUpdate();
            
            
            
          } catch (SQLException ex) {
          Logger.getLogger(DAOEditora.class.getName()).log(Level.SEVERE, null, ex);
          return false;
        }
       desconectar();
       return true;
    
    }    
    
    public List<ModelEditora> getListaEditoraDAO() {
       List <ModelEditora> listaEditora = new ArrayList<>();
       ModelEditora modelEditora = new ModelEditora();
              
         
              
              ResultSet resultSet = null;
              PreparedStatement preparedStatement = null;
              
          String sql = "SELECT  pk_id_editora,nome_editora,cidade_editora FROM tbl_editora";
         
          System.out.println(sql);
             
             try {
                     this.conectar();
                     
          preparedStatement = criarPreparedStatement(sql);
          resultSet = preparedStatement.executeQuery();
                 while (resultSet.next()) {
                    modelEditora = new ModelEditora();
                    modelEditora.setId_editora(resultSet.getInt(1));
                    modelEditora.setNome_editora(resultSet.getString(2));
                    modelEditora.setCidade_editora(resultSet.getString(3));
                    listaEditora.add(modelEditora);
                     
                 }
      } catch (Exception e) {
                 System.err.println(e);
      }
             finally{
                this.desconectar();    
             }
         
        return listaEditora;
        
    }
    
    public boolean deletarEditoraDAO(int pCodigo) {
        this.conectar();
      String  sql = "DELETE FROM tbl_editora WHERE pk_id_editora= '"+pCodigo+"'";
      PreparedStatement preparedStatement = this.criarPreparedStatement(sql);
        System.out.println(sql);
        try {
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(DAOEditora.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        // caso tenha excessao no meu PreparedStatement usar um finally
        
        finally {
        if (preparedStatement !=null) {
            
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                 Logger.getLogger(DAOEditora.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
        
        
        
        }
        
        
        
    this.desconectar();
    return true;
    
    }
    
    
    public ModelEditora getEditoraDAO(int pCodigoEditora){
    ModelEditora modelEditora = new ModelEditora();
    conectar();
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    
    String sql = "SELECT  pk_id_editora,nome_editora,cidade_editora FROM tbl_editora WHERE pk_id_editora = '"+pCodigoEditora+"'";
    preparedStatement = criarPreparedStatement(sql);
      System.out.println(sql);
        try {
            resultSet = preparedStatement.executeQuery();
           
            
            while (resultSet.next()){
              modelEditora = new ModelEditora();
              modelEditora.setId_editora(resultSet.getInt(1));
              modelEditora.setNome_editora(resultSet.getString(2));
              modelEditora.setCidade_editora(resultSet.getString(3));
              
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOEditora.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
        }
        
       
        
     desconectar();   
    return modelEditora;
    }
     public boolean atualizarEditora(ModelEditora  modelEditora){
        this.conectar();
      
    String sql = "UPDATE tbl_editora SET nome_editora =?, cidade_editora=?,pk_id_editora=? WHERE pk_id_editora=  '"+modelEditora.getId_editora()+"'";
   PreparedStatement preparedStatement = this.criarPreparedStatement(sql);
   System.out.println(sql);
   
        try {
            preparedStatement.setString(1, modelEditora.getNome_editora());
            preparedStatement.setString(2, modelEditora.getCidade_editora());
            preparedStatement.setInt(3, modelEditora.getId_editora());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOEditora.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        finally {
        if (preparedStatement !=null) {
            
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                 Logger.getLogger(DAOEditora.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
        
        
        
        }
    
    this.desconectar();
    return true;
    
    }
    
}
