/**
 *========================== ======================== =======================
 * ==================@author Jarmison   MEU    GitHub: FireXtz ============================
 * ==========================================================================
 */
package MODEL;


public class ModelLivro {
 private int id_livro;
 private String nome_livro;
 private String nome_autor;
 private String nome_editora;
 private String lançamento;
 private int quantidade_livro;
 
 public ModelLivro(int id_livro,String nome_livro,String nome_autor,String nome_editora,String lançamento,int  quantidade_livro){
 this.id_livro =id_livro;
 this.nome_livro = nome_livro;
 this.nome_autor = nome_autor;
 this.nome_editora = nome_editora;
 this.lançamento = lançamento;
 this.quantidade_livro =quantidade_livro;
 }
 
 public ModelLivro (){
     
 }

    /**
     * @return the id_livro
     */
    public int getId_livro() {
        return id_livro;
    }

    /**
     * @param id_livro the id_livro to set
     */
    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    /**
     * @return the nome_livro
     */
    public String getNome_livro() {
        return nome_livro;
    }

    /**
     * @param nome_livro the nome_livro to set
     */
    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    /**
     * @return the nome_autor
     */
    public String getNome_autor() {
        return nome_autor;
    }

    /**
     * @param nome_autor the nome_autor to set
     */
    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
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
     * @return the lançamento
     */
    public String getLançamento() {
        return lançamento;
    }

    /**
     * @param lançamento the lançamento to set
     */
    public void setLançamento(String lançamento) {
        this.lançamento = lançamento;
    }

    /**
     * @return the quantidade_livro
     */
    public int getQuantidade_livro() {
        return quantidade_livro;
    }

    /**
     * @param quantidade_livro the quantidade_livro to set
     */
    public void setQuantidade_livro(int quantidade_livro) {
        this.quantidade_livro = quantidade_livro;
    }
 
}

