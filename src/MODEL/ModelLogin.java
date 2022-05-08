
package MODEL;


public class ModelLogin {
private  int senha;
private   String usuario;

// metodo acessor 
public ModelLogin(String usuario, int senha){
this.usuario = usuario;
this.senha = senha;

}

public ModelLogin(){


}

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
    
    
}
