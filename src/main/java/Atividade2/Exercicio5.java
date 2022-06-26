/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

/**Faça um programa para imprimir os números pares entre 100 e 1, em ordem decrescente, ou seja, o laço 
deve iniciar em 100 e encerrar em 1. Use o laço FOR
 *
 * @author cilucena
 */
public class Exercicio5 {

    public static void main(String[] args) {
        for(int i=100; i>=1; i--) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
    }
    
}
}
