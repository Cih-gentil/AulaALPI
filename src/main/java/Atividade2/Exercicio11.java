/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

import java.util.Scanner;

/**Faça um programa que leia um número natural N e calcule a soma abaixo (
 * lembre-se de que tanto as divisões quanto o resultado devem ser decimais). 
 * Utilize o laço que lhe for mais conveniente.
 *
 * @author cilucena
 */
public class Exercicio11 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int n;
        float soma = 1, div, denominador = 2, numerador = 1;

        System.out.println("Insira um valor: ");
        n = input.nextInt();

        while (denominador <= n) {
            div = numerador / denominador;
            if (denominador % 2 == 0) {
                soma = soma - div;
                denominador++;
                
            } else {
                soma = soma + div;
                denominador++;
            }
            

        }
        System.out.println("A soma de todos os resultados da divisão é " + soma);
    }
    
}
