/**
 *========================== ======================== =======================
 * ==================@author Jarmison   MEU    GitHub: FireXtz ============================
 * ==========================================================================
 */
package DAO;
import DAO.ConexaoSQLite;
import MODEL.ModelAluno;
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
 * @author Jarmison
 */
public class DAOAluno extends ConexaoSQLite {

   
    //conexao para salvar o aluno
    
    public boolean SalvarAlunoDAO(ModelAluno pModelAluno) {
        conectar();
        String sql ="INSERT INTO tbl_Aluno (nome_aluno,cidade_aluno,email_aluno,endereço_aluno,fk_id_aluno) VALUES (?,?,?,?,?)";
        
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, pModelAluno.getNome_aluno());
            preparedStatement.setString(2, pModelAluno.getCidade_aluno());
            preparedStatement.setString(3, pModelAluno.getEmail_aluno());
            preparedStatement.setString(4, pModelAluno.getEndereço_aluno());
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAluno.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
     
         desconectar();
     
          return true;
        
    
    }
   
    //Conexão Exibir Lista
    
    public List <ModelAluno> getListaAluno () {
   List <ModelAluno> listaAluno = new ArrayList<ModelAluno>() ;
   ModelAluno modelAluno = new ModelAluno();
   
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    
    String sql = "SELECT pk_id_aluno,nome_aluno,cidade_aluno,email_aluno,endereço_aluno FROM tbl_Aluno";
   System.out.println(sql);
   
        try {
            this.conectar();
          preparedStatement = criarPreparedStatement(sql);
          resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                modelAluno = new ModelAluno();
                modelAluno.setId_aluno(resultSet.getInt(1));
                modelAluno.setNome_aluno(resultSet.getString(2));
                modelAluno.setCidade_aluno(resultSet.getString(3));
                modelAluno.setEmail_aluno(resultSet.getString(4));
                modelAluno.setEndereço_aluno(resultSet.getString(5));
                listaAluno.add(modelAluno);
}
            
        } catch (Exception e) {
             System.err.println(e);
        }
        
        finally{
        desconectar();
        }
 return listaAluno;
    }
    
    // excluir o Aluno
    
    public boolean deletarAlunoDAO(int pCodigo){
        this.conectar();
        PreparedStatement preparedStatement;
        String sql = "DELETE FROM tbl_Aluno WHERE pk_id_aluno= '"+pCodigo+"'";
        preparedStatement = this.criarPreparedStatement(sql);
        
        try {
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
           Logger.getLogger(DAOAluno.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    finally {
         if(preparedStatement != null){
             try {
                 preparedStatement.close();
                 
             } catch (SQLException ex) {
                 ex.printStackTrace();
                 Logger.getLogger(DAOAluno.class.getName()).log(Level.SEVERE, null, ex);
             }
             
        
        }
    this.desconectar();
    return true;
    
    }
    
    
    }
    
    public ModelAluno getALunoDAO(int pCodigoAluno){
    ModelAluno modelAluno = new ModelAluno();
    conectar();
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    
    String sql ="SELECT  pk_id_aluno,nome_aluno,cidade_aluno,email_aluno,endereço_aluno FROM tbl_Aluno WHERE pk_id_aluno = '"+pCodigoAluno+"'";
    preparedStatement = criarPreparedStatement(sql);
    System.out.println(sql);
    
        try {
         resultSet = preparedStatement.executeQuery();
         
            while (resultSet.next()) {
              modelAluno = new ModelAluno();
              
              modelAluno.setId_aluno(resultSet.getInt(1));
              modelAluno.setNome_aluno(resultSet.getString(2));
              modelAluno.setCidade_aluno(resultSet.getString(3));
              modelAluno.setEmail_aluno(resultSet.getString(4));
              modelAluno.setEndereço_aluno(resultSet.getString(5));
                      
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAluno.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
        }
    
    return modelAluno;
    
    }
    
    public boolean atualizarAlunoDAO(ModelAluno modelAluno){
     this.conectar();
     String sql = "UPDATE tbl_Aluno SET nome_aluno =?, cidade_aluno=?,email_aluno=?,endereço_aluno=? WHERE pk_id_aluno=  '"+modelAluno.getId_aluno()+"'";
   PreparedStatement preparedStatement = this.criarPreparedStatement(sql);
   System.out.println(sql);
   
        try {
         preparedStatement.setString(1,modelAluno.getNome_aluno());
         preparedStatement.setString(2, modelAluno.getCidade_aluno());
         preparedStatement.setString(3, modelAluno.getEmail_aluno());
         preparedStatement.setString(4, modelAluno.getEndereço_aluno());
         preparedStatement.executeUpdate();
         } catch (SQLException ex) {
            Logger.getLogger(DAOAluno.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
          finally {
        if (preparedStatement !=null) {
            
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                 Logger.getLogger(DAOAluno.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
        
        
        
        }
   
   
   this.desconectar();
     return true;
     
     
    
    
    }
    
    
    
    
}
