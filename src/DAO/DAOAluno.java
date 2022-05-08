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
    
    public boolean SalvarAlunoDAO(ModelAluno pModelAluno){
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
    
    
    
    
}
