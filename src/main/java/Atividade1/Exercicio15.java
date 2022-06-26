/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara.
 *Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de número negativo,
 * mostre a mensagem correspondente “Impossível calcular”
 *
 * @author cilucena
 */
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        
        //declaração de váriaveis 
        double a, b, c, delta, x1, x2; 
        
        //entrada de dados 
        System.out.println("~~ Cálculo de raízes utilizando Bháskara ~~");
        System.out.println("Insira o valor de A ");
        a = imput.nextDouble();
        System.out.println("Insira o valor de B ");
        b = imput.nextDouble();
        System.out.println("Insira o valor de C ");
        c = imput.nextDouble();
        
        //processamento de dados
        delta = Math.pow(b,2) - 4 * a * c;
        x1 = (- b + Math.sqrt(delta)) / (2 * a); 
        x2 = (- b - Math.sqrt(delta))/ (2 * a); 
        
        //saída de dados 
         System.out.println("O valor de delta é " + delta); 
         
        if (delta <=0) {
            System.out.println("Operação inválida");
        }
        else { 
        System.out.println("O valor de x1 é " + x1);
        System.out.println("O valor de x2 é " + x2);
        }
   
    }
    
}
