/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ADO3;

import java.util.Scanner;

/**Use o laço for para ler 06 valores do usuário. Ao final 
do laço, imprimir:
1. Soma de todos os valores digitados que foram positivos;
2. Quantidade de valores digitados que foram positivos.
3. Média (decimal) de todos os valores digitados que foram positivos.
 *
 * @author cilucena
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1, soma=0, cont=0, media;
         
        for(int i=1; i<=6; i++) {
           System.out.println("insira um número ");
           n1 = input.nextInt();
           
           if(n1 >=0) {
               soma= soma + n1;
              cont++;      
           }
        }
        media = soma/cont;
            System.out.println("A soma dos números positivos é " + soma);
            System.out.println("A quantidade de números positivos é de " + cont);
            System.out.println("A média da soma dos números positivos é " + media);
            
                  
           
    }
    
}
