/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.
 *
 * @author cilucena
 */
public class Exercicio5 {

    public static void main(String[] args) {
       Scanner imput = new Scanner (System.in);
        
        // declaração de variáveis 
        double L, area;
        
        //entrada de dados
        System.out.println("Cálculo da área de um quadrado");
        System.out.println("Insira o tamanho do lado do quadrado ");
        L = imput.nextDouble();
        
        //processamento de dados
        area = Math.pow(L, 2);
        
        //saída de dados
        System.out.println("A área do quadrado é " + area);
        
    }
    
}

    
    

