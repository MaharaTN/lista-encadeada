package unidade04.src;

import java.util.*;
import java.lang.*;
import java.io.*;

public class App {
    
    public static void main(String[] args) throws Exception{


        Lista l = new Lista();
        
      /*System.out.println("vazia: " + l.vazia());*/
        
      l.insereUltimo(10);
      l.insereUltimo(20);        
      l.insereUltimo(30);
      l.inserePrimeiro(50);        
      l.inserePrimeiro(5); 
      l.inserePrimeiro(999999);       
      l.mostrar();
        /*l.removeUltimo();
        l.mostrar();*/
        /*l.removePrimeiro();
        System.out.println("\n******************************");
        l.mostrar();*/

      System.out.println("\n******************************");
      l.insereUltimo(9);
      l.insereDepois(2, 111111);
      l.insereUltimo(555);
      l.mostrar();
    }
}
