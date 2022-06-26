/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado 
de um número A é representado por A2 = A * A.
 *
 * @author cilucena
 */
public class Exercicio3 {

    public static void main(String[] args) {
       Scanner imput = new Scanner (System.in);
        
        //declaração de váriaveis 
        int n1, n2;
        double quadrado1, quadrado2, soma;
             
       //entrada de dados
       System.out.println(" ==Soma de dois expoentes== ");
       System.out.println("Digite o primeiro número: ");
       n1 = imput.nextInt();
       System.out.println("Digite o segundo número: ");
       n2 = imput.nextInt();
       
       //processamento de dados
       quadrado1 = Math.pow(n1, 2);
       quadrado2 = Math.pow(n2, 2);
       soma = quadrado1 + quadrado2;
       
       //saída de dados
        System.out.println("A potência do primeiro número é: " + quadrado1);
        System.out.println("E do segundo número é: " + quadrado2);
        System.out.println("O resultado da soma das duas potências é: " + soma);
       
    }
    
       
    }
    

