/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicioEmAula;

import java.util.Scanner;

/**Nesta aula aprendemos a usar a estrutura de repetição While;
 *
 * @author cilucena
 */
public class ExercicioWhile4 {

   
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        
        int x, soma=0, i=0;
        
        while(i < 10) {
            System.out.println("Numero: ");
            x = input.nextInt();
            
            if(x <0) {
                break;
            }
            
            soma+=x; //soma=soma+x;
            i++;
            
            
        }
        System.out.println("Resultado: " + soma);
    }   

    }
    

