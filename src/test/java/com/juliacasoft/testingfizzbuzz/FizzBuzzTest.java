/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juliacasoft.testingfizzbuzz;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {
    
    @ParameterizedTest
    @CsvSource({
        "1,1",
        "2,2",
        "4,4"
    })
    public void test_no_multiplos_3_y_5(int numero,String vesperado) {
        FizzBuzz fb=new FizzBuzz();
        String vencontrado=fb.validaNumero(numero);
        assertEquals(vesperado, vencontrado);
    }
    
    @ParameterizedTest
    @CsvSource({"3","6","9","24"})
    public void test_multiplos_3(int numero){
        FizzBuzz fb=new FizzBuzz();
        String vencontrado=fb.validaNumero(numero);
        String vesperado="fizz";
        assertEquals(vesperado, vencontrado);
    }
    
    @ParameterizedTest
    @CsvSource({"5","10","20","100"})
    public void test_multiplos_5(int numero){
        FizzBuzz fb=new FizzBuzz();
        String vencontrado=fb.validaNumero(numero);
        String vesperado="buzz";
        assertEquals(vesperado, vencontrado);
    }
    
    @ParameterizedTest
    @CsvSource({"15","30","60"})
    public void test_multiplos_3_y_5(int numero){
        FizzBuzz fb=new FizzBuzz();
        String vencontrado=fb.validaNumero(numero);
        String vesperado="fizzbuzz";
        assertEquals(vesperado, vencontrado);
    }
    
    @Test
    public void test_array_numeros_generador(){
        FizzBuzz fb=new FizzBuzz();
        int vencontrado=fb.generaNumeros().length;
        int vesperado=100;
        System.out.println(Arrays.toString(fb.generaNumeros()));
        assertEquals(vesperado, vencontrado);
    }
    
    @Test
    public void test_fizzbuzz_100_numeros(){
        FizzBuzz fb=new FizzBuzz();
        String[] numerosFizzBuzz=new String[100];
        String numeros[]=fb.generaNumeros();
        for (int i = 0; i < 100; i++) {
            numerosFizzBuzz[i]=fb.validaNumero(Integer.parseInt(numeros[i]));
        }
        System.out.println(Arrays.toString(numerosFizzBuzz));
    }
}
