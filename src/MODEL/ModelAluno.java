
package MODEL;

/**
 *========================== ======================== =======================
 * ==================@author Jarmison   MEU    GitHub: FireXtz ============================
 * ==========================================================================
 */
public class ModelAluno {
    private String nome_aluno;
    private String cidade_aluno;
    private String endereço_aluno;
    private String email_aluno;
    private int id_aluno;
    
    
    
    public ModelAluno(String nome_aluno,String cidade_aluno,String email_aluno,int id_aluno,String endereço_aluno){
     this.endereço_aluno = endereço_aluno;   
     this.nome_aluno = nome_aluno;
     this.cidade_aluno= cidade_aluno;
     this.email_aluno = email_aluno;
     this.id_aluno = id_aluno;
    }
    
    public ModelAluno(){
    
    }

    /**
     * @return the nome_aluno
     */
    public String getNome_aluno() {
        return nome_aluno;
    }

    /**
     * @param nome_aluno the nome_aluno to set
     */
    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    /**
     * @return the cidade_aluno
     */
    public String getCidade_aluno() {
        return cidade_aluno;
    }

    /**
     * @param cidade_aluno the cidade_aluno to set
     */
    public void setCidade_aluno(String cidade_aluno) {
        this.cidade_aluno = cidade_aluno;
    }

    /**
     * @return the email_aluno
     */
    public String getEmail_aluno() {
        return email_aluno;
    }

    /**
     * @param email_aluno the email_aluno to set
     */
    public void setEmail_aluno(String email_aluno) {
        this.email_aluno = email_aluno;
    }

    /**
     * @return the id_aluno
     */
    public int getId_aluno() {
        return id_aluno;
    }

    /**
     * @param id_aluno the id_aluno to set
     */
    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    /**
     * @return the endereço_aluno
     */
    public String getEndereço_aluno() {
        return endereço_aluno;
    }

    /**
     * @param endereço_aluno the endereço_aluno to set
     */
    public void setEndereço_aluno(String endereço_aluno) {
        this.endereço_aluno = endereço_aluno;
    }

    
   
    

   
    
}
