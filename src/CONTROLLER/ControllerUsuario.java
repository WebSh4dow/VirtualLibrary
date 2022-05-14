
package CONTROLLER;
import DAO.DAOUsuario;
import MODEL.ModelUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jarmison
 * 
 * 
 * SALVA UM USUARIO ADMINISTRADOR DA BIBLIOTECA
 * CREATE
 * 
 */
public class ControllerUsuario {
    DAOUsuario dAoUsuario = new DAOUsuario ();
    
    public boolean SalvarUsuarioController (ModelUsuario modelUsuario) {
    return this.dAoUsuario.SalvarUsuarioDao(modelUsuario);
    
    }
       
    public List<ModelUsuario> getListaUsuariosController() {
    return this.dAoUsuario.getListaUsuarioDAO();
    }

    public boolean excluirUsuarioController(int codigo) {
    return this.dAoUsuario.deletarUsuarioDAO(codigo);
    }

    public ModelUsuario alterarUsuarioController(int pCodigo) {
    return  this.dAoUsuario.getUsuarioDAO(pCodigo);
        
        
        
        }

    public boolean atualizarUsuarioController(ModelUsuario modelUsuario) {
        return this.dAoUsuario.atualizarUsuario(modelUsuario);
    }
    
    public ModelUsuario pesquisarUsuarioController(int pCodigo){
    return this.dAoUsuario.getUsuarioDAO(pCodigo);
    }
    

    
}
