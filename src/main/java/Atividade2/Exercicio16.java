/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

import java.util.Scanner;

/**Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida do usuário.
Para cada valor lido, mostre uma mensagem em português dizendo se este valor lido é par (PAR), ímpar 
(ÍMPAR), positivo (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser igual a zero (0), seu programa 
deverá imprimir apenas NULO. Utilize o laço DO-WHILE
 *
 * @author cilucena
 */
public class Exercicio16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, cont=1;
        float numero;
        
        System.out.println("Insira um número inteiro: ");
        n = input.nextInt();
        
        do {
            System.out.println("Insira qualquer número: ");
            numero = input.nextFloat();
            if(numero % 2 == 0 && numero < 0) {
                System.out.println("Número PAR e NEGATIVO");    
            } else if (numero % 2 == 0 && numero > 0 ) {
                System.out.println("Número PAR e POSITIVO");
            } else if(numero % 2 != 0 && numero < 0 ) {
                System.out.println("Número ÍMPAR E NEGATIVO");
            } else if (numero % 2 !=0 && numero > 0){
                System.out.println("Número ÍMPAR e POSITIVO");
            } else {
                System.out.println("NULO");
            }
            
             cont++;
             
        } while(cont <= n);
    
        
    }
    
}
