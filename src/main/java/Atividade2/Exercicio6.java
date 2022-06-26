/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

import java.util.Scanner;

/**Faça um programa para ler e escrever dados de uma turma de 5 alunos. O programa deve pedir dados como 
nome, idade e sexo. O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE.
 *
 * @author cilucena
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome, sexo, aluno = "Cintia", genero; 
        int i=1,idade, maior=0; 
        
        
        do {
            System.out.println("Insira o nome do aluno: ");
            nome = input.next();
            System.out.println("Insira o genero do aluno: ");
            sexo = input.next();
            System.out.println("Insira a idade do aluno: ");
            idade = input.nextInt(); 
            if(idade > maior) {
            maior = idade;
            aluno = nome;
            genero = sexo;
            }
            i++;
            } 
        while (i <= 5);
        
        System.out.println("O aluno mais velho é " + aluno);
        
        
      

    }
    
}
