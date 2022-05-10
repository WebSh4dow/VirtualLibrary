
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
    

    
}
