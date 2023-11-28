/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;


import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.copy;
import java.util.List;

/**
 * Vamos fazer um metodo para retornar a soma da areas de uma lista de figuras
 * 
 */
public class Program {
    
    
    public static void main(String[] args){
        
       List<Integer> myInts = Arrays.asList(1 , 2, 3, 4);
       List<Double> myDouble = Arrays.asList(3.14, 6.28);
       List<Object> myObjs = new ArrayList<Object>();
       
       
       copy(myInts, myObjs);   // metodo copy
       printList(myObjs);
       
       
       copy(myDouble,myObjs);
        printList(myObjs);
       
     
     
     
    }
    
      // a lista de origem vai ser de qualquer tipo numerico ? extends de number  === source = origem
       
       // lista de destino poder ser lista mais generic LIST(OBJECT)
                                                              // contravariancia posso add
      public static void copy(List<? extends Number> source, List< ? super Number> destiny){
           // como vou fazer para copiar
           // fazer um for
           // para cada NUMBER apelido : da lista de origem 
           for (Number number : source){
               destiny.add(number);
           }
           
       }
    
      
      
      // imprimir a lista
      public static void printList(List<?> list){
          for (Object obj : list){
              System.out.print(obj + " ");
          }
           System.out.println();
          
      }
      
    
    
    
        
    
}

