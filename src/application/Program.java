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
        
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);
      
        List<? extends Number> list = intList;
    
        Number x = list.get(0);  // ele deixa eu acessar elementos
    
       
        // erro de compilacao porque ele nao sabe 20 qual tipo é
        // isso a gente chama de covariancia
        // operacao get é permitida 
        // operacao inserir nao é permitida
        //list.add(20); 
    }
    
    
    
    
    
        
    
}

