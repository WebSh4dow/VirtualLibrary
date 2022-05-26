/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import MODEL.ModelEmprestimo;
import DAO.DAOEmprestimo;
import java.util.List;

/**
 *
 * @author sansepiol
 */
public class ControllerEmprestimo {
DAOEmprestimo dAOEmprestimo = new DAOEmprestimo();  


    public boolean salvarLivroController(ModelEmprestimo modelEmprestimo) {
        return this.dAOEmprestimo.salvarEmprestimoDAO(modelEmprestimo);
        
        
        
        
    }

    public List<ModelEmprestimo> getListaEmprestimoController() {
        return this.dAOEmprestimo.getListaEmprestimo();
    }

    public boolean excluirEmprestimoController(int codigo) {
       return this.dAOEmprestimo.excluirEmprestimoDAO(codigo);
    }

    public ModelEmprestimo alterarEmprestimoController(int codigo) {
        return this.dAOEmprestimo.getEmprestimoDao(codigo);
    }

    public boolean atualizarEmprestimoController(ModelEmprestimo modelEmprestimo) {
        return this.dAOEmprestimo.atualizarEmprestimo(modelEmprestimo);
    }
    
}
