package unidade04.src;

public class Lista{

    private No primeiro;
    
    
    public Lista(){
        primeiro = null;
    }
    
    public boolean vazia(){
        return primeiro == null;
    }
    
    public void inserePrimeiro(int info){
        No auxiliar = new No();
        auxiliar.setInfo(info);
        auxiliar.setProx(primeiro);
        primeiro = auxiliar;
    }
    
    public void insereUltimo(int info){
        if(vazia() == true){
            inserePrimeiro(info);
        }
        else{
            No auxiliar = primeiro;

            while(auxiliar != null && auxiliar.getProx() != null){
                auxiliar = auxiliar.getProx();
            }

            if(auxiliar.getProx() == null){
                No novo = new No();
                novo.setInfo(info);
                auxiliar.setProx(novo);
            }
        }
    }
    
    public No removePrimeiro(){
        if(inicio == null){
            return null;
        }
        int info = inicio.getInfo();
        inicio = inicio.getProx();
        tamanho --;
        return null;
    }

    public void mostrar(){
        No auxiliar = primeiro;
        while(auxiliar != null){
            System.out.print(auxiliar.getInfo() + ", ");
            auxiliar = auxiliar.getProx();
        }
    }
}
