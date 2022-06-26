/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a 
mensagem "Numero negativo"
 *
 * @author cilucena
 */
public class Exercicio11 {

    public static void main(String[] args) {
          Scanner input = new Scanner (System.in); 
        
     //declaração de variáveis
       int numero; 
     
     //entrada de dados 
        System.out.println("Insira um número ");
        numero = input.nextInt(); 
        
      //saída de dados 
      if (numero <0) {
          System.out.println("O número é negativo");
     
      } else {
          System.out.println("O número não é negativo");
      }
    }
    }
    

