/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;
import DAO.DAOLivro;
import CONTROLLER.ControllerLivro;

import MODEL.ModelLivro;
import java.util.List;

/**
 *
 * @author sansepiol
 */
public class ControllerLivro {
   DAOLivro dAOLivro = new DAOLivro();
    public boolean salvarLivroController(ModelLivro pmodelLivro) {
    return this.dAOLivro.salvarLivroDAO(pmodelLivro);

    }

    public List<ModelLivro> getListaAlunosController() {
        return this.dAOLivro.getListaLivroDAO();
    }

    public boolean deletarLivroController(int codigo) {
        return this.dAOLivro.excluirLivroDAO(codigo);
    }

    public ModelLivro alterarLivroController(int pCodigoLivro) {
     return this.dAOLivro.getLivroDao(pCodigoLivro);

    }

    public boolean  atualizarLivroController(ModelLivro modelLivro) {
        return this.dAOLivro.atualizarLivro(modelLivro);
    }

    
    
}
