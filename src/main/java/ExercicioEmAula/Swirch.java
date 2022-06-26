/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicioEmAula;

import java.util.Scanner;

/**Nesta aula aprendemos a utilizar a estrutura condicional Switch case
 *
 * @author cilucena
 */
public class Swirch {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        float nota1, nota2, media;
        char grade;

        System.out.println("Insira a primeira nota ");
        nota1 = input.nextFloat();
        System.out.println("Insira a segunda nota ");
        nota2 = input.nextFloat();

        media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10) {
            grade = 'A';

        } else if (media < 9 && media >= 8) {
            grade = 'B';

        }
        else if (media < 8 && media >= 7) {
            grade = 'C';

        } else if (media < 7 && media >= 6) {
            grade = 'D';
        } else if (media <6 && media >=5) {
            grade = 'E';
        } else {
            grade = 'X'; 
        }

        switch (grade) {
            case 'A':
                System.out.println("Conceito A");
                break;
            case 'B':
                System.out.println("Conceito B");
                break;
            case 'C':
                System.out.println("Conceito C");
                break;
            case 'D':
                System.out.println("Conceito D");
                break;
            case 'E':
                System.out.println("Conceito E");
                break;
            default:
                System.out.println("Nota inválida");

        }
    }

}

  
