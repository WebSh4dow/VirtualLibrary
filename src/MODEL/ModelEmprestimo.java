/**
 *========================== ======================== =======================
 * ==================@author Jarmison   MEU    GitHub: FireXtz ============================
 * ==========================================================================
 */
package MODEL;

/**
 *
 * @author Jarmison
 */
public class ModelEmprestimo {
   private int id_emprestimo;
   private String livro_alugado;
   private String usu_emprestimo;
   private String data_emprestimo;
   private String data_previsao;
   private String data_devolucao;
   
   
   
   public ModelEmprestimo(int id_emprestimo,String livro_alugado,String uso_emprestimo,String data_previsao,String data_devolucao,String data_emprestimo){
   this.id_emprestimo = id_emprestimo;
   this.livro_alugado = livro_alugado;
   this.usu_emprestimo = uso_emprestimo;
   this.data_emprestimo = data_emprestimo;
   this.data_previsao = data_previsao;
   this.data_devolucao = data_devolucao;
   }
   
    public ModelEmprestimo(){
   
   }

    /**
     * @return the id_emprestimo
     */
    public int getId_emprestimo() {
        return id_emprestimo;
    }

    /**
     * @param id_emprestimo the id_emprestimo to set
     */
    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    /**
     * @return the livro_alugado
     */
    public String getLivro_alugado() {
        return livro_alugado;
    }

    /**
     * @param livro_alugado the livro_alugado to set
     */
    public void setLivro_alugado(String livro_alugado) {
        this.livro_alugado = livro_alugado;
    }

    /**
     * @return the usu_emprestimo
     */
    public String getUsu_emprestimo() {
        return usu_emprestimo;
    }

    /**
     * @param usu_emprestimo the usu_emprestimo to set
     */
    public void setUsu_emprestimo(String usu_emprestimo) {
        this.usu_emprestimo = usu_emprestimo;
    }

    /**
     * @return the data_emprestimo
     */
    public String getData_emprestimo() {
        return data_emprestimo;
    }

    /**
     * @param data_emprestimo the data_emprestimo to set
     */
    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    /**
     * @return the data_previsao
     */
    public String getData_previsao() {
        return data_previsao;
    }

    /**
     * @param data_previsao the data_previsao to set
     */
    public void setData_previsao(String data_previsao) {
        this.data_previsao = data_previsao;
    }

    /**
     * @return the data_devolucao
     */
    public String getData_devolucao() {
        return data_devolucao;
    }

    /**
     * @param data_devolucao the data_devolucao to set
     */
    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
   
}
