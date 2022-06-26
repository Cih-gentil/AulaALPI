/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicioEmAula;

import java.util.Scanner;

/**Nesta aula aprendemos a utilizar a estrutura condicional switch case.
 *
 * @author cilucena
 */
public class VerificaNome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        
        String nome, sobrenome;
        
        System.out.println("Digite seu nome: ");
        nome = input.next();
        
        switch(nome) {
            case "Cintia":
            case "CINTIA":
            case "cintia":
                System.out.println("Digite seu Sobrenome: ");
                sobrenome = input.next();
                
        if(sobrenome.equals("LUCENA") || sobrenome.equals("lucena") || sobrenome.equals("Lucena")) {
                    System.out.println("PASSOU");
                    break;
        }else {
            System.out.println("Usuário não cadastrado");
        }
            default: {
                System.out.println("Usuário não cadastrado");
            }
    }
  }
    }
    

