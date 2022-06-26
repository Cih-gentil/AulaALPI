/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área 
 * entre um quadrado de lado L e um círculo de raio R. Imprimir na tela qual o maior:
 * "Quadrado" ou "Círculo".
 *
 * @author cilucena
 */
public class Exercicio12 {

   
    public static void main(String[] args) {
          Scanner imput = new Scanner (System.in);
        
        //declaração de váriaveis
        double L, R, areaC, areaQ; 
        
        //entrada de dados 
        System.out.println("~~ Qual área é maior? ~~");
        System.out.println("Insira o lado do quadrado ");
        L = imput.nextDouble(); 
        System.out.println("Insira o raio do círculo ");
        R = imput.nextDouble(); 
        
        //processamento de dados
        areaQ = Math.pow(L,2);
        areaC = Math.PI * Math.pow(R, 2);
        
        //saída de dados 
        if(areaQ > areaC) {
            System.out.println("A área do quadrado é maior");           
        }
        
        else {
            System.out.println("A área do círculo é maior");
        } 
       
    }
    
}
