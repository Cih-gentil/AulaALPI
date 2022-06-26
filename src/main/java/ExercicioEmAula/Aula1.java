
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicioEmAula;

import java.util.Scanner;

/**Nesta aula aprendemos a utilizar a classe Scanner
 *
 * @author cilucena
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //criação do objeto scanner (imput)
        Scanner imput = new Scanner(System.in);
        
        //declarando variáveis
        float n1, n2, n3, media;
        
        //entrada de dados
        System.out.println("Cálculo da Média");
        System.out.println("Nota 1: ");
        n1 = imput.nextFloat();
        System.out.println("Nota 2: ");
        n2 = imput.nextFloat();
        System.out.println("Nota 3: ");
        n3 = imput.nextFloat();
        
        //processamento
        media = (n1+n2+n3)/3;
        
        //saída de dados 
        System.out.println("Média: " + media);
    }
    
}
    
    

