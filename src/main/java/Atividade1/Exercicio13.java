/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Fazer um algoritmo que leia três números e imprime o maior deles.
 *
 *
 * @author cilucena
 */
public class Exercicio13 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //criação de váriaveis 
        float n1, n2,n3; 
        
        //entrada de dados 
        System.out.println("Insira um número ");
        n1 = input.nextFloat();
        System.out.println("Insira um outro número ");
        n2 = input.nextFloat();
        System.out.println("Insira novamente um outro número ");
        n3 = input.nextFloat(); 
        
        //saída de dados
        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior número é " + n1);
        } 
        else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior número é " + n2);
        }
        else {
            System.out.println("O maior número é " + n3);
        }
    }
    
}
