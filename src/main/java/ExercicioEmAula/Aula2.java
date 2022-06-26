/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicioEmAula;

import java.util.Scanner;

/**Nesta aula aprendemos a utilizar as estruturas condicionais if e else
 *
 * @author cilucena
 */
public class Aula2 {

   
    public static void main(String[] args) {
         Scanner imput = new Scanner (System.in);
        
        float n1, n2, media, falta, sub; 
        
        System.out.println("~~ Calcula Média ~~");
        System.out.println("Digite n1");
        n1 = imput.nextFloat();
        System.out.println("Digite n2");
        n2 = imput.nextFloat();
        System.out.println("Insira sua quantidade de faltas ");
        falta = imput.nextFloat();
        
        media = (n1+n2)/2;
        
        System.out.println("A sua média é " + media);
        
        if(media >=6 & falta <=18) {
            System.out.println("Aprovado");  
      
        }else if(falta >=18) {
        
         System.out.println("Reprovado");
        }
        else {
            System.out.println("Você está de exame");
            System.out.println("Insira sua nota do exame ");
            sub = imput.nextFloat();
            
            sub = (media + sub)/2; 
            
            if (sub >=6) {
                System.out.println("Você está aprovado");
                
            } else {
                System.out.println("Você está reprovado");
            }
            
        }
    }
    
}

    
    

