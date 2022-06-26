/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
 * efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão
 * sobre suas vendas efetuadas, calcular e imprimir o total a receber no final do mês.
 *
 *
 * @author cilucena
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
      //declaração de variáveis 
      String vendedor;
      double salarioFixo, vendas, comissao, salarioFinal;
         
        //Entrada de dados 
        System.out.println("~~ Cálculo de salário ~~");
        System.out.println("Insira o nome do vendedor ");
        vendedor = input.nextLine();
        System.out.println("Insira o salário fixo do vendedor ");
        salarioFixo = input.nextDouble(); 
        System.out.println("Insira o valor de vendas feitas pelo vendedor ");
        vendas = input.nextDouble(); 
       
        //processamento de dados 
        comissao = vendas * 0.15;
        salarioFinal = salarioFixo + comissao; 
        
        //saida de dados
        System.out.println("O sálario total de " + vendedor + " é " + salarioFinal);
    }
    
    }
    

