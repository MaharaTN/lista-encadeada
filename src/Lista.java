package unidade04.src;

public class Lista{

    private No inicio;
    private int tamanho = 0;
    
    public Lista(){
        inicio = null;
    }
    
    public boolean vazia(){
        return inicio == null;
    }
    
    public void inserePrimeiro(int info){
        No auxiliar = new No();
        auxiliar.setInfo(info);
        auxiliar.setProx(inicio);
        inicio = auxiliar;
        tamanho ++;
    }

    public void insereDepois(int indice, int info){
        if(indice <= 0){
            inserePrimeiro(info);
        }else if(indice >= tamanho){
            insereUltimo(info);
        }else{
            No local = inicio;
            for(int i = 0; i < indice -1; i ++){
                local = local.getProx();
            }
            No novo = new No();
            novo.setInfo(info);
            novo.setProx(novo);
            local.setProx(novo);
            tamanho ++;
        }
    }
    
    public void insereUltimo(int info){
        if(vazia() == true){
            inserePrimeiro(info);
        }
        else{
            No auxiliar = inicio;

            while(auxiliar != null && auxiliar.getProx() != null){
                auxiliar = auxiliar.getProx();
            }

            if(auxiliar.getProx() == null){
                No novo = new No();
                novo.setInfo(info);
                auxiliar.setProx(novo);
            }
        }
        tamanho ++;
    }

    public No removePrimeiro(){
        if(vazia() == true){
            return null;
        }
        int info = inicio.getInfo();
        inicio = inicio.getProx();
        tamanho --;
        return null;
    }

    public No removeUltimo(){
        if(vazia()== true){
            return null;
        }
        No local = inicio;
        while(local.getProx() != null){
            No aux = local;
            local = local.getProx();
            if(local.getProx() == null){
                aux.setProx(null);            
                tamanho --;
                return null;   
            }
        }
        inicio = null;
        tamanho --;
        return null;
    }

    /*public No remove(int no){
        if(no < 0 || no >= tamanho || inicio == null ){

        }
    }*/


    public void mostrar(){
        No auxiliar = inicio;
        System.out.println("------ LISTA --------\n");
        while(auxiliar != null){
            
            System.out.print(auxiliar.getInfo() + "\n");
            auxiliar = auxiliar.getProx();
        }
    }
}
