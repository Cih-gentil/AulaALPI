/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/** Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a
 * hipotenusa do triângulo.
. Dica: nesse programa, você deve usar a função matemática Math.sqrt(). Por exemplo, 
* a raiz de 121 ficaria Math.sqrt(121)
 *
 * @author cilucena
 */
public class Exercicio7 {

    public static void main(String[] args) {
         Scanner imput = new Scanner (System.in);
        
        // declaração de variáveis 
        double ladoA, ladoB, hipo;
        
        // entrada de dados
        System.out.println("Cálculo da hipotenusa de um triângulo retângulo");
        System.out.println("Insira o lado A do triângulo retângulo ");
        ladoA = imput.nextDouble(); 
        System.out.println("Insira o lado B do triângulo retângulo ");
        ladoB = imput.nextDouble(); 
        
        //processamento de dados
       
        hipo = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB,2));
        
        //Saída de dados
        System.out.println("A hipotenusa do triângulo retângulo é " + hipo);
     
    }
    
}
