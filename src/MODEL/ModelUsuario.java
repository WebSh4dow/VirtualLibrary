
package MODEL;


public class ModelUsuario {
  private int id_usuario;
  private String senha_usuario;
  private String nome_usuario;
    
   
    
    
    
 public ModelUsuario(int id_usuario,String senha_usuario,String nome_usuario){
    this.id_usuario = id_usuario;
    this.nome_usuario = nome_usuario;
    this.senha_usuario = senha_usuario;
    
    }
    
    
    
    public ModelUsuario(){
    
    
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the senha_usuario
     */
    public String getSenha_usuario() {
        return senha_usuario;
    }

    /**
     * @param senha_usuario the senha_usuario to set
     */
    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    /**
     * @return the nome_usuario
     */
    public String getNome_usuario() {
        return nome_usuario;
    }

    /**
     * @param nome_usuario the nome_usuario to set
     */
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }
    
    
    
}
