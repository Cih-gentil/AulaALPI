/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade2;

/**Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73.
 * Utilize o laço que lhe for mais conveniente.
 *
 * @author cilucena
 */
public class Exercicio8 {

    public static void main(String[] args) {
        int soma=0, i, media;
        
      for(i=13; i<=73; i++) {
          if(i % 2 == 0) {
            soma= soma + i; 
          
  }
      }
       media = soma/30;
            System.out.println(soma);
              System.out.println("a media aritmética dos números pares entre 13 e 73, é " + media);
          
    }
    
}
