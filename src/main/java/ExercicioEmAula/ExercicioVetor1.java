/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicioEmAula;

import java.util.Scanner;

/**Nesta aula aprendemos a utilizar vetores do tipo Arrays
 *
 * @author cilucena
 */
public class ExercicioVetor1 {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("Tamanho: ");
        int t = input.nextInt();

        int[] vetor = new int[t];

        for (int i = 0; i < t; i++) {
            System.out.printf("vetor[%d]: \n", i);
            vetor[i] = input.nextInt();

        }
        System.out.println("");
        for (int i = 0; i < t; i++) {
            if (vetor[i] % 2 == 0) {

                System.out.printf("Vetor [%d]: %d \n", i, vetor[i]);
            }
        }
    }
    }
    

