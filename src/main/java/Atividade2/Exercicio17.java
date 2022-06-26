/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

import java.util.Scanner;

/**Ler um número inteiro N e calcular e imprimir todos os seus divisores. 
 * Exemplo: para o número 6, temos os seguintes divisores 1, 2, 3, 6. Utilize o 
 * laço que lhe for mais conveniente.
 *
 * @author cilucena
 */
public class Exercicio17 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int n1;

        System.out.println("Insira um número: ");
        n1 = input.nextInt();

        for (int i = n1; i > 0; i--) {
            if (n1 % i == 0) {

                System.out.println(i);

            }
    }
    
    }
}
