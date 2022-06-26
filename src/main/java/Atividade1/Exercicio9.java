/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas trabalhadas, 
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o número e o 
salário do funcionário.
 *
 * @author cilucena
 */
public class Exercicio9 {

    public static void main(String[] args) {
         Scanner imput = new Scanner (System.in);
        
        // criação de variáveis 
        double numHrsTr,valorHr, salario;
        String nome;
        int numFunc;
                
        // entrada de dados 
        System.out.println("Cálculo de salário");
        System.out.println("Insira o nome do(a) funcionário(a) ");
        nome = imput.nextLine(); 
        System.out.println("Insira o número de cadastro do(a) funcionário(a): " + nome);
        numFunc = imput.nextInt(); 
        System.out.println("Insira a quantidade de horas trabalhadas por: " + nome);
        numHrsTr = imput.nextDouble();
        System.out.println("Insira o valor por hora trabalhada de: " + nome);
        valorHr = imput.nextDouble();
        
        //processamento de dados 
        salario = numHrsTr * valorHr; 
        
        //saída de dados 
        System.out.println("Funcionário " + nome + " cadastrado no número " + numFunc +
                " irá receber de sálario R$" + salario + " pelas horas trabalhadas.");
        
        
    }
    
}
