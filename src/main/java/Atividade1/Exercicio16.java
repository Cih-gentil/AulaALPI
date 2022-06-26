/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
 * sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração 
 * mínima de 1 hora e máxima de 24 horas.
 *
 * @author cilucena
 */
public class Exercicio16 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        //declaração de variáveis 
        int inicio, fim, duração; 
        
        //entrada de dados
        System.out.println("~~ Duração de jogo ~~");
        System.out.println("Insira o horário do inicio do jogo");
        inicio = input.nextInt();
        System.out.println("Insira o horario do fim do jogo");
        fim = input.nextInt(); 
        
        //processamento de dados
        duração = 24 - (24 + inicio - fim) % 24;
        
        //saida de dados 
        System.out.println("A duração do jogo foi de " + duração + "hora(s)");
    }
    
}
