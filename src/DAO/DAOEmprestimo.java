/**
 *========================== ======================== =======================
 * ==================@author Jarmison   MEU    GitHub: FireXtz ============================
 * ==========================================================================
 */
package DAO;
import DAO.ConexaoSQLite;
import MODEL.ModelEmprestimo;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sansepiol
 */
public class DAOEmprestimo extends ConexaoSQLite {
    
    public boolean salvarEmprestimoDAO(ModelEmprestimo pmodelEmprestimo){
        conectar();
        String sql = "INSERT INTO tbl_Emprestimo (livro_alugado,usu_emprestimo,data_emprestimo,data_previsao,data_devolucao) VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement = criarPreparedStatement(sql,Statement.RETURN_GENERATED_KEYS);
        
        try {
            preparedStatement.setString(1, pmodelEmprestimo.getLivro_alugado());
            preparedStatement.setString(2,pmodelEmprestimo.getUsu_emprestimo());
            preparedStatement.setString(3,pmodelEmprestimo.getData_emprestimo());
            preparedStatement.setString(4,pmodelEmprestimo.getData_previsao());
            preparedStatement.setString(5,pmodelEmprestimo.getData_devolucao());
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    desconectar();
    return true;
    
    
    }
    
    public List <ModelEmprestimo> getListaEmprestimo(){
        List <ModelEmprestimo> listaEmprestimo= new ArrayList<ModelEmprestimo>();
        ModelEmprestimo modelEmprestimo = new ModelEmprestimo();
        
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    
    String sql = "SELECT pk_id_emprestimo, livro_alugado,usu_emprestimo,data_emprestimo,data_previsao,data_devolucao FROM tbl_Emprestimo";
    System.out.println(sql);
    
    this.conectar();
        try {
          preparedStatement = criarPreparedStatement(sql);
          resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               modelEmprestimo = new ModelEmprestimo();
               
               modelEmprestimo.setId_emprestimo(resultSet.getInt(1));
               modelEmprestimo.setLivro_alugado(resultSet.getString(2));
               modelEmprestimo.setUsu_emprestimo(resultSet.getString(3));
               modelEmprestimo.setData_emprestimo(resultSet.getString(4));
               modelEmprestimo.setData_previsao(resultSet.getString(5));
               modelEmprestimo.setData_devolucao(resultSet.getString(6));
               listaEmprestimo.add(modelEmprestimo);
                
            }
          
          
          
        } catch (Exception e) {
             System.err.println(e);
        }
    
        finally{
        desconectar();
         }
      return listaEmprestimo;
    
    }
    
    public boolean excluirEmprestimoDAO(int pCodigoEmprestimo){
     this.conectar();
     
     String sql = "DELETE FROM tbl_Emprestimo WHERE pk_id_emprestimo='"+pCodigoEmprestimo+"' ";
     PreparedStatement preparedStatement = this.criarPreparedStatement(sql);
     
        try {
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
        }
        
         finally {
        if (preparedStatement !=null) {
            
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                 Logger.getLogger(DAOEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        }
     
     this.desconectar();
     return true;
    }
    
    public ModelEmprestimo getEmprestimoDao(int pCodigoEmprestimo){
    ModelEmprestimo modelEmprestimo = new ModelEmprestimo();
    conectar();
     
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    
    String sql = "SELECT  pk_id_emprestimo,livro_alugado,usu_emprestimo,data_emprestimo,data_previsao,data_devolucao FROM tbl_Emprestimo WHERE pk_id_emprestimo = '"+pCodigoEmprestimo+"'";
    preparedStatement = criarPreparedStatement(sql);
    
        System.out.println(sql);
    
        try {
            
         resultSet = preparedStatement.executeQuery();
         
          while (resultSet.next()){
              modelEmprestimo = new ModelEmprestimo();
              modelEmprestimo.setId_emprestimo(resultSet.getInt(1));
              modelEmprestimo.setLivro_alugado(resultSet.getString(2));
              modelEmprestimo.setUsu_emprestimo(resultSet.getString(3));
              modelEmprestimo.setData_emprestimo(resultSet.getString(4));
              modelEmprestimo.setData_previsao(resultSet.getString(5));
              modelEmprestimo.setData_devolucao(resultSet.getString(6));
              
                
            }
         
         
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
        }
      
   desconectar();  
   return modelEmprestimo;
    
    }
    
    
    public boolean atualizarEmprestimo(ModelEmprestimo modelEmprestimo){
    this.conectar();
   String sql = "UPDATE tbl_Emprestimo SET livro_alugado =?, usu_emprestimo=?,data_emprestimo=?,data_previsao=?,data_devolucao=? WHERE pk_id_emprestimo=  '"+modelEmprestimo.getId_emprestimo()+"'";
   PreparedStatement preparedStatement = this.criarPreparedStatement(sql);
   System.out.println(sql);
   
   
        try {
            preparedStatement.setString(1, modelEmprestimo.getLivro_alugado());
            preparedStatement.setString(2, modelEmprestimo.getUsu_emprestimo());
            preparedStatement.setString(3, modelEmprestimo.getData_emprestimo());
            preparedStatement.setString(4, modelEmprestimo.getData_previsao());
            preparedStatement.setString(5, modelEmprestimo.getData_devolucao());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
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
