/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

import java.util.Scanner;

/**Exercicio 2 - Faça um programa que leia um número N do usuário, some todos os números
 * inteiros de 1 a N, e mostre o resultado obtido. Use o laço WHILE.
 *
 * @author cilucena
 */
public class Exercicio2 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int n, numero=1, soma=0; 
        
        System.out.println("Insira um número: ");
        n = input.nextInt();
       
        while(numero <=n) {
          soma = soma + numero; 
          numero = numero+1;
        }
       
        System.out.println("A soma é de " + soma);
    }
    
    }
    

