/**
 *========================== ======================== =======================
 * ==================@author Jarmison   MEU    GitHub: FireXtz ============================
 * ==========================================================================
 */
package CONTROLLER;
import DAO.DAOAluno;
import MODEL.ModelAluno;
import java.util.List;

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

    public List<ModelAluno> getlistaAlunosController() {
        return this.dAOAluno.getListaAluno();
    }

    public boolean  deletarAlunoController(int codigo) {
        return this.dAOAluno.deletarAlunoDAO(codigo);
    }
  
}
