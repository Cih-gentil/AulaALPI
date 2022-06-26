/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicioEmAula;

import java.util.Scanner;

/**
 * Nesta aula aprendemos a criar e como utilizar funções;
 *
 * @author cilucena
 */
public class CalculadoraSimples {

    static int menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("** MENU **");
        System.out.println("1 - ADIÇÃO");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");
        int op = input.nextInt();

        return op;

    }

    static double entradaDados() {
        System.out.println("** ENTRADA DE DADOS **");
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        return n;
    }

    static double add(double n1, double n2) {
        System.out.println("** ADIÇÃO **");
        double r = n1 + n2;
        return r;
    }

    static double sub(double n1, double n2) {
        System.out.println("** SUBTRAÇÃO **");
        double r = n1 - n2;
        return r;
    }

    static double mult(double n1, double n2) {
        System.out.println("** MULTIPLICAÇÃO **");
        double r = n1 * n2;
        return r;
    }

    static double div(double n1, double n2) {
        System.out.println("** DIVISÃO **");
        double r = n1 / n2;
        return r;
    }

    static void imprimir(double result) {
        System.out.println("** IMPRIMIR **");
        System.out.println("Resultado " + result);
    }

    static double controlador(double n1, double n2, int op) {
        System.out.println("** CONTROLADOR **");
        double r = 0;
        switch (op) {
            case 1:
                r = add(n1, n2);
                break;

            case 2:
                r = sub(n1, n2);
                break;

            case 3:
                r = mult(n1, n2);
                break;

            case 4:
                r = div(n1, n2);
                break;
        }
        return r;
    }

    public static void main(String[] args) {
        int op = menu();
        double n1 = entradaDados();
        double n2 = entradaDados();
        double r = controlador(n1, n2, op);
        imprimir(r);
    }
}
