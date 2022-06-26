/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

import java.util.Scanner;

/**Faça um programa que leia um número natural N e calcule a soma abaixo 
 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais).
 * Utilize o laço que lhe for mais conveniente
 *
 * @author cilucena
 */
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float soma=0, denominador, numerador=1, div, soma1, soma2;
        
        System.out.println("Insira o valor do denominador: ");
        denominador = input.nextFloat();
       
       while(denominador > 0) {
           div = numerador / denominador;
           soma = soma + div; 
           denominador--;
       }
       soma1 = soma + (denominador - 1) / 2;
       soma2 = soma1 + denominador /1;
  
        System.out.println("A soma de todos os resultados da divisão é "+ soma2);
    }
    
}
