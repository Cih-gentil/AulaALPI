/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/** Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números.
 *
 * @author cilucena
 */
public class Exercicio8 {
    
    public static void main(String[] args) {
         Scanner imput = new Scanner (System.in);
        
        //declaração de variáveis
        float n1, n2, n3, n4, media;
        
        // entrada de dados 
        System.out.println("Cálculo de média aritmética");
        System.out.println("Insira n1");
        n1 = imput.nextFloat(); 
        System.out.println("Insira n2");
        n2 = imput.nextFloat();
        System.out.println("Insira n3");
        n3 = imput.nextFloat(); 
        System.out.println("Insira n4");
        n4 = imput.nextFloat(); 
        
        //processamento de dados 
        media = (n1 + n2 + n3 + n4)/4;
        
        //saída de dados 
        System.out.println("A média aritmética dos números inseridos é " + media);
    }
    
}
    

