/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

import java.util.Scanner;

/**Faça um programa que leia um número natural N e calcule a soma abaixo 
 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais). 
 * Utilize o laço que lhe for mais conveniente.
 *
 * @author cilucena
 */
public class Exercicio14 {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        
        int n;
        float soma=1, denominador=3, numerador=2, div;
        
        System.out.println("Insira um valor: ");
        n = input.nextInt();
       
       while(denominador <=n && numerador <=n) {
           div = numerador / denominador;
           soma = soma + div; 
           denominador++;
           denominador++;
           numerador++;
           numerador++; 
    }
        System.out.println("O resultado é " + soma);
}
       
    }
    


