package unidade04.src;

public class No {
   private int informacao;
    private No proximo;

    public No(){
        informacao = 0;
        proximo = null;
    }

    public void setInfo(int informacao){
        this.informacao = informacao;
    }

    public void setProx(No proximo){
        this.proximo = proximo;
    }

    public No getProx(){
        return this.proximo;
    }

    public int getInfo(){
        return this.informacao;
    }
}
