/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;


import java.util.ArrayList;
import java.util.List;

/**
 * Vamos fazer um metodo para retornar a soma da areas de uma lista de figuras
 * 
 */
public class Program {
    
    
    public static void main(String[] args){
        
        // agora criar lista object que pode ser qualquer tipo
        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");  // String sub tipo de object
        myObjs.add("Alex");
      
        
        
        /* vou declarar uma lista myNums
        do tipo ? qualquer tipo super Number
        ou seja 
        pode ser Number ou qualquer tipo super Number no caso Object
        
                                   object
                                     |
        ----------------------------------------------------------
        |                            |                           |
        NUMBER                      BOOLEAN                  CHARACTER
          |
          |
        --------------------------------------------------------
           |           |         |        |         |          |
        Integer      Byte       Long     Shot      Float      Double
        
        
        
        */
        
        List<? super Number> myNums = myObjs;
        
        myNums.add(10);
        myNums.add(3.14);   // posso add qualquer tipo number tipo - int double float etc
    
        // tambem posso add qualquer tipo Object - String
        // so que nao posso acessar 
        
        // erro de compilaçao
        Number x = myNums.get(0);      
       
        // eu nao passo acessar minha lista e guardar na minha variavel do tipo Number
        // porque o tipo dessa lista pode ser um tipo ser tipo super tipo de Number
     
    }
    
    
    
    
    
        
    
}

