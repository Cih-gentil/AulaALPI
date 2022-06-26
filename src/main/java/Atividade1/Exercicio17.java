/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A,
 * e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a
 * variável A for par escrever a smensagem "Valores aceitos", senão escrever "Valores não aceitos".
 *
 * @author cilucena
 */
public class Exercicio17 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        //declaração de variáveis 
        float a, b, c, d;
        
        //entrada de dados 
        System.out.println("Insira o valor do 1º número ");
        a = input.nextFloat();
        System.out.println("Insira o valor do 2º número ");
        b = input.nextFloat();
        System.out.println("Insira o valor do 3º número ");
        c = input.nextFloat();
        System.out.println("Insira o valor do 4º número ");
        d = input.nextFloat();
        
       if((b > c) && (d > a) && (c + d > a + b) && (c > 0) && (d > 0) && (a%2==0)) {
           System.out.println("Valores aceitos");
           
       } else {
           System.out.println("Valores não aceitos");
    }
    
    }
}
