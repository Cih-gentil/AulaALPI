/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

import java.util.Scanner;

/** Escreva um programa que leia um conjunto de 10 números inteiros positivos. ]
 * Seu programa deve determinar e imprimir o maior deles. Use o laço FOR
 *
 * @author cilucena
 */
public class Exercicio3 {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        
        int n;
        int maior=0; 
        
        for(int i=1; i<=10; i++) { 
        System.out.println("Insira um número ");
        n = input.nextInt();
        
        if(n > maior)
                maior = n;     
    }
        
        System.out.println("O maior número é " + maior);
}
    }
    

