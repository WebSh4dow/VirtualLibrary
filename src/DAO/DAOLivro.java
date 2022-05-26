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
import MODEL.ModelLivro;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *========================== ======================== =======================
 * ==================@author Jarmison   MEU    GitHub: FireXtz ============================
 * ==========================================================================
 */
public class DAOLivro extends ConexaoSQLite{
    public boolean salvarLivroDAO  (ModelLivro  pmodelLivro){
        conectar();
        String sql = "INSERT INTO tbl_Livro(nome_livro,livro_autor,livro_editora,livro_lançamento,livro_quantidade) VALUES (?,?,?,?,?)";
        
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        try {
            preparedStatement.setString(1,pmodelLivro.getNome_livro());
            preparedStatement.setString(2, pmodelLivro.getNome_autor());
            preparedStatement.setString(3, pmodelLivro.getNome_editora());
            preparedStatement.setInt(4, pmodelLivro.getLançamento());
            preparedStatement.setInt(5, pmodelLivro.getQuantidade_livro());
            
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(DAOAluno.class.getName()).log(Level.SEVERE,null,ex);
            return false;
            
        }
        
        
        desconectar();
        
    
    return true;
    }
    
    
    public List <ModelLivro> getListaLivroDAO (){
       List <ModelLivro> listaLivro = new ArrayList<>();
       ModelLivro modelLivro = new ModelLivro();
       
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
String sql = "SELECT pk_livro_id,nome_livro,livro_autor,livro_editora,livro_lançamento,livro_quantidade FROM tbl_Livro ";
    
        try {
            this.conectar();
          preparedStatement = criarPreparedStatement(sql);
          resultSet = preparedStatement.executeQuery();
          
            while (resultSet.next()) {
           modelLivro = new ModelLivro();
           
           modelLivro.setId_livro(resultSet.getInt(1));
           modelLivro.setNome_livro(resultSet.getString(2));
           modelLivro.setNome_autor(resultSet.getString(3));
           modelLivro.setNome_editora(resultSet.getString(4));
           modelLivro.setLançamento(resultSet.getInt(5));
           modelLivro.setQuantidade_livro(resultSet.getInt(6));
           listaLivro.add(modelLivro);
                
            }
            
            
            
        } catch (Exception e) {
            System.err.println(e);
        }
        
        finally{
                this.desconectar();    
             }
        
        
        
        return listaLivro;
    
    
    
    }
    
    
    
    
    
    
    public boolean excluirLivroDAO (int pCodigoLivro) {
    this.conectar();
    
    String sql = "DELETE FROM tbl_Livro WHERE pk_livro_id = '"+pCodigoLivro+"' ";
    PreparedStatement preparedStatement = this.criarPreparedStatement(sql);
        try {
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOLivro.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
          finally {
        if (preparedStatement !=null) {
            
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                 Logger.getLogger(DAOLivro.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        }
        
    this.desconectar();
    return true;
    }
    
    
   public ModelLivro getLivroDao(int pCodigoLivro){
   conectar();
   ModelLivro modelLivro = new ModelLivro();
   ResultSet resultSet = null;
   PreparedStatement preparedStatement = null;
   
   String sql = "SELECT  pk_livro_id,nome_livro,livro_autor,livro_editora,livro_lançamento,livro_quantidade FROM tbl_Livro WHERE pk_livro_id = '"+pCodigoLivro+"'";
   
   
   
   preparedStatement  = criarPreparedStatement(sql);
   System.out.println(sql);
   
       try {
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
               modelLivro = new ModelLivro();
               
               modelLivro.setId_livro(resultSet.getInt(1));
               modelLivro.setNome_livro(resultSet.getString(2));
               modelLivro.setNome_autor(resultSet.getString(3));
               modelLivro.setNome_editora(resultSet.getString(4));
               modelLivro.setLançamento(resultSet.getInt(5));
               modelLivro.setQuantidade_livro(resultSet.getInt(6));
               
               
               
           }
            
       } catch (SQLException ex) {
           Logger.getLogger(DAOLivro.class.getName()).log(Level.SEVERE, null, ex);
           System.err.println(ex);
           
           }
   
   
   
   
   
   desconectar();
   return modelLivro;
   
   } 
    
    public boolean atualizarLivro (ModelLivro modelLivro) {
        
       this.conectar();
        
    String sql = "UPDATE tbl_Livro SET nome_livro =?, livro_autor=?,livro_editora=?,livro_lançamento=?,livro_quantidade=? WHERE pk_livro_id= '"+modelLivro.getId_livro()+"'";
   PreparedStatement preparedStatement = this.criarPreparedStatement(sql);
   System.out.println(sql);
   
        try {
            preparedStatement.setString(1, modelLivro.getNome_livro());
            preparedStatement.setString(2, modelLivro.getNome_autor());
            
            preparedStatement.setString(3, modelLivro.getNome_editora());
             preparedStatement.setInt(4, modelLivro.getLançamento());
            preparedStatement.setInt(5, modelLivro.getQuantidade_livro());
             preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(DAOLivro.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        finally {
        if (preparedStatement !=null){
            
            try {
                 preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                 Logger.getLogger(DAOLivro.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        }
        
 this.desconectar();
   return true;
   
    
   

   
   
   
        
    }

    
        
        
        
    
    
    
}
