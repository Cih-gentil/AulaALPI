/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

/**Faça um programa que calcule e imprima o resultado da soma abaixo (lembre-se de que tanto as divisões 
quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.
 *
 * @author cilucena
 */
public class Exercicio10 {

    public static void main(String[] args) {
       
       float soma=1, denominador=2, numerador=1, div;
       
       while(denominador <=20) {
           div = numerador / denominador;
           soma = soma + div; 
           denominador++;
       }
  
        System.out.println("A soma de todos os resultados da divisão é "+ soma);
    }
    
}
