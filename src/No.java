package unidade04.src;

public class No {
   private int informacao;
    private No proximo,anterior;


    public No(){
        informacao = 0;
        proximo = null;
        anterior = null;
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

    public No getAnt() {
        return anterior;
    
    }

    public void setAnt(No anterior){
        this.anterior = anterior;
    }

}
