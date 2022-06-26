/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

/**Escreva um programa que imprima todos os múltiplos de 7 menores que 200. Use o laço WHILE.
 *
 * @author cilucena
 */
public class Exercicio7 {

    public static void main(String[] args) {
         int n = 6; 
        
      
        while(n <=200) {
            n++;
             if(n % 7 == 0){
            System.out.println(n);
         
        }
    }
    
}
}