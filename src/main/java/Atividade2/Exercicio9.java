/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

import java.util.Scanner;

/**Escreva um programa para ler a quantidade de alunos existentes em uma turma.
 * Depois disso, o programa deve ler as notas de cada um destes alunos, calcular 
 * e mostrar na tela a média aritmética destas notas. 
 * Utilize o laço WHILE
 *
 * @author cilucena
 */
public class Exercicio9 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); 
        
        int numAlunos, nota, rep=0, soma=0, media; 
        
        System.out.println("Insira os números de alunos: ");
        numAlunos = input.nextInt(); 
        
        while(rep < numAlunos) {
            System.out.println("Insira a nota de cada aluno ");
            nota = input.nextInt();
            rep++;
         soma = soma + nota; 
      
    }
        media = soma / rep;
        System.out.println("A média aritmética das notas é de: " + media);
   
    }
    
}
