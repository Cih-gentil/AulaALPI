/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor.
 *
 *
 * @author cilucena
 */
public class Exericicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //declaração de váriavéis 
        float n1, n2, resultado; 
        
        //entrada de dados 
        System.out.println("~~ Divindo o maior número pelo menor ~~");
        System.out.println("Insira um número ");
        n1 = input.nextFloat();
        System.out.println("Insira outro número ");
        n2 = input.nextFloat();
        
        if(n1 > n2) {
            resultado = n1 / n2; 
            System.out.println("O resultado de " + n1 + " divido por " + n2 + " é " + resultado);
        }
        else {
            resultado = n2 / n1;
            System.out.println("O resultado de "+ n2 + " divido por " + n1 + " é " + resultado);
        }
    }
    
}
