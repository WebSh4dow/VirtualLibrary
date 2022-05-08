/**
 *========================== ======================== =======================
 * ==================@author Jarmison   MEU    GitHub: FireXtz ============================
 * ==========================================================================
 */
package CONTROLLER;
import DAO.DAOAluno;
import MODEL.ModelAluno;

/**
 *
 * @author sansepiol
 */
public class ControllerAluno {
    DAOAluno dAOAluno = new DAOAluno();
    // metodo pra chamar o DAO

    public boolean SalvarAlunoController(ModelAluno modelAluno ) {
       return this.dAOAluno.SalvarAlunoDAO(modelAluno);
        
        
        
    }
  
}
