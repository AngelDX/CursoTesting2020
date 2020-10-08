/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juliacasoft.testingfizzbuzz;

import java.util.Arrays;

/**
 *
 * @author Andree
 */
public class FizzBuzz {

    public String validaNumero(int n) {
        String numero="";
        if(esFizzBuzz(n)){
            numero="fizzbuzz";
        }
        else if(esFizz(n)){
            numero="fizz";
        }else if(esBuzz(n)){
            numero="buzz";
        }else{
            numero=String.valueOf(n);
        }
        return numero;
    }
    
    public boolean esFizz(int numero){
        return numero%3==0; 
    }
    
    public boolean esBuzz(int numero){
        return numero%5==0; 
    }
    
    public boolean esFizzBuzz(int numero){
        return esFizz(numero) && esBuzz(numero); 
    }
    
    public String[] generaNumeros(){
        String[] arrayNumeros=new String[100];
        for (int i = 0; i < 100; i++) {
            arrayNumeros[i]=String.valueOf(i+1);
        }
        return arrayNumeros;
    }
    
  
    
}
