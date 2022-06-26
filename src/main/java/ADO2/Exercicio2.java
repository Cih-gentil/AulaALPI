/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ADO2;

import java.util.Scanner;

/** Dados dois números, verificar se a divisão do primeiro número pelo
segundo é exata (o resto da divisão deve ser igual a 0). Se for, o
algoritmo deve imprimir a mensagem “A divisão de (número 1) por
(número 2) é exata”.
 *
 *
 * @author cilucena
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        
        //declaração de variáveis 
        float n1, n2, resultado; 
        
        //dados de entrada
        System.out.println(" ~~ Cálculo de divisão ~~");
        System.out.println("Insira um número ");
        n1 = imput.nextFloat();
        System.out.println("Insira outro número ");
        n2 = imput.nextFloat();
        
        //processamento de dados
        resultado = n1 % n2;
        
        //saida de dados
        if(resultado == 0) {
            System.out.println("A divisão de " + n1 + " por " + n2 + " é exata");
            
        }else {
            System.out.println("A divisão de " + n1 + " por " + n2 + " não é exata");
        }
    }
    
}
