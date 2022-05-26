package MODEL;
/**
*
* @author Jarmison
*/
public class ModelEditora {

    private String  nome_editora;
    private String cidade_editora;
    private int id_editora;

    /**
    * Construtor
    */
    public ModelEditora(){}

    /**
    * seta o valor de nome_editora
    * @param pNome_editora
    */
    public void setNome_editora(String  pNome_editora){
        this.nome_editora = pNome_editora;
    }
    /**
    * @return nome_editora
    */
    public String  getNome_editora(){
        return this.nome_editora;
    }

    /**
    * seta o valor de cidade_editora
    * @param pCidade_editora
    */
    public void setCidade_editora(String pCidade_editora){
        this.cidade_editora = pCidade_editora;
    }
    /**
    * @return cidade_editora
    */
    public String getCidade_editora(){
        return this.cidade_editora;
    }

    /**
    * seta o valor de id_editora
    * @param pId_editora
    */
    public void setId_editora(int pId_editora){
        this.id_editora = pId_editora;
    }
    /**
    * @return pk_id_editora
    */
    public int getId_editora(){
        return this.id_editora;
    }

    @Override
    public String toString(){
        return "ModelEditora {" + "::nome_editora = " + this.nome_editora + "::cidade_editora = " + this.cidade_editora + "::id_editora = " + this.id_editora +  "}";
    }
}