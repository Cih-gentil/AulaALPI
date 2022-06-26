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
public class ExercicoVetor2 {
      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("tamanho: ");
        int t = input.nextInt();

        int []v = new int[t];

        for (int i =0; i< v.length; i++){


            System.out.printf("vetor[%d]: %n",i);

            v[i] = input.nextInt();



        }

        for (int i = 0; i< v.length; i++){

            System.out.printf("vetro[%d]: %d%n",i,v[i]);


        }

        int soma = 0;
        int maior = v[0];
        int menor = v[0];

        for(int i =0; i< v.length; i++){

            soma +=v[i];
            if(v[i]> maior){
                maior = v[i];
            }
            if(v[i]< menor){
                menor = v[i];
            }



        }
        for (int i =0;i<v.length;i++){
            System.out.print("v["+i+"]: "+v[i]);
            if(v[i]== maior){
                System.out.print(" <--- maior");
                System.out.println("");

            }else if(v[i]==menor){
              
                System.out.print(" <--- menor");
                System.out.println("");

            }

        }

        System.out.printf(" Soma: %d ",soma);





    }
    }
    

