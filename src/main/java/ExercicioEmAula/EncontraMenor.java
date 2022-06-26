/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicioEmAula;

import java.util.Scanner;

/**Nesta aula aprendemos a criar e como utilizar funções;
 *
 * @author cilucena
 */
public class EncontraMenor {

    static int soma(int a, int b) {

        System.out.println("** Soma **");
        return a + b;
    }

    static int menor(int a, int b) {

        System.out.println("** Menor ** ");
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }

    static int entradaDados() {

        Scanner input = new Scanner(System.in);
        System.out.println("** Entrada de Dados **");
        System.out.println("Número: ");
        int n = input.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int n1 = entradaDados();
        int n2 = entradaDados();
        int r = soma(n1, n2);
        System.out.println("Resultado: " + r);

        int m = menor(n1, n2);
        System.out.println("O menor elemento entre os dois inseridos é " + m);
    }
}


    
    

