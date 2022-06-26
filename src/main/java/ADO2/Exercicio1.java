/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ADO2;

import java.util.Scanner;

/**Dado um número, verificar se ele é maior que 100. Se for, o algoritmo
deve somar 150 a esse número. No final, imprimir o resultado da soma.
 *
 * @author cilucena
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        
        //declaração de variáveis 
       float numero, soma;
        
        //dados de entrada
        System.out.println("~~ Verificação de números ~~");
        System.out.println("Insira um número ");
        numero = imput.nextFloat(); 
        
        //saída de dados
        if(numero >100) {
            soma = numero + 150;
            System.out.println("O resultado é " + soma);
            
        } else {
            System.out.println("O número é menor que 100");
        }
    }
    
}
