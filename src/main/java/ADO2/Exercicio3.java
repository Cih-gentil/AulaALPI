/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ADO2;

import java.util.Scanner;

/**Dada a altura e o peso de uma pessoa, determinar seu grau de
obesidade. O grau de obesidade é determinado pelo índice da massa
corpórea (Massa = Peso / Altura2).
 *
 * @author cilucena
 */
public class Exercicio3 {

    public static void main(String[] args) {
        
     Scanner imput = new Scanner (System.in);
        
        //declaração de variáveis 
        double peso, altura, massa; 
        
        //entrada de dados
        System.out.println("~~ Descubra seu IMC ~~");
        System.out.println("Insira seu peso ");
        peso = imput.nextDouble();
        System.out.println("Insira sua altura ");
        altura = imput.nextDouble();
        System.out.println("");
        
        //processamento de dados
        massa = (peso) / Math.pow(altura, 2);
        
        //saída de dados 
        if(massa <26)   {
            System.out.println("O resultado do seu imc é " + massa + " e está normal");     
        }
        
     else if (massa >=26 & massa<30) { 
        System.out.println("O resultado do seu imc é " + massa + " e você está com obesidade");
     }   
     
    else {
         System.out.println("O resultado do seu imc é " + massa + " e você está com obesidade mórbida");   
            }
    
}
}