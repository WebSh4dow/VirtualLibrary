/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;


import MODEL.ModelEditora;
import java.util.List;
import DAO.DAOEditora;
import java.util.List;

/**
 *
 * @authorjarmison
 */
public class ControllerEditora {
DAOEditora dAOEditora = new DAOEditora ();
    public ModelEditora getEditoraController(int pCodigo) {
        return this.dAOEditora.getEditoraDAO(pCodigo);
    }

    public boolean excluirEditoraController(int codigo) {
    return this.dAOEditora.deletarEditoraDAO(codigo);
    }

    public List<ModelEditora> getListaEditoraController() {
    return this.dAOEditora.getListaEditoraDAO();   
    }

   

    public boolean SalvarEditoraController(ModelEditora modelEditora) {
        return this.dAOEditora.SalvarEditoraDao(modelEditora);
    }

    public boolean atualizarEditoraController(ModelEditora modelEditora) {
     return this.dAOEditora.atualizarEditora(modelEditora);
        }
    
    
    
}
