/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/** Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação)
 * dos dois números. 

 *
 * @author cilucena
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
          Scanner imput = new Scanner(System.in);
           
        // declaração de variáveis
        float n1, n2, multiplicacao;
                
       //entrada de dados
       System.out.println("Multiplicação");
       System.out.println("Insira o primeiro número: ");
       n1 = imput.nextFloat();
       System.out.println("Insira o segundo número: ");
       n2 = imput.nextFloat();
       
       //processamento
      multiplicacao = n1 * n2; 
      
      // saída de dados
        System.out.println("Resultado " + multiplicacao);
        
               
       
               
                

    }
    
}
