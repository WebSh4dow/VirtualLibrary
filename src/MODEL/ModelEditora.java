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
public class ModelEditora {
    
   private String nome_editora;
   private String cidade_editora;
   private int  id_editora;
   
   
   
   public ModelEditora(String nome_editora,String cidade_editora,int id_editora){
       this.nome_editora = nome_editora;
       this.cidade_editora = cidade_editora;
       this.id_editora = id_editora;
   
   }
   
   public ModelEditora(){
   
   }

    /**
     * @return the nome_editora
     */
    public String getNome_editora() {
        return nome_editora;
    }

    /**
     * @param nome_editora the nome_editora to set
     */
    public void setNome_editora(String nome_editora) {
        this.nome_editora = nome_editora;
    }

    /**
     * @return the cidade_editora
     */
    public String getCidade_editora() {
        return cidade_editora;
    }

    /**
     * @param cidade_editora the cidade_editora to set
     */
    public void setCidade_editora(String cidade_editora) {
        this.cidade_editora = cidade_editora;
    }

    /**
     * @return the id_editora
     */
    public int getId_editora() {
        return id_editora;
    }

    /**
     * @param id_editora the id_editora to set
     */
    public void setId_editora(int id_editora) {
        this.id_editora = id_editora;
    }
   
    
}
