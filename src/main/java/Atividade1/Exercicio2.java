/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao 
expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria 
Math.pow(5, 3). Você pode trocar esses números por variáveis
 *
 * @author cilucena
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double n1, n2, potencia;
        
        System.out.println(" ==Potenciação== ");
        System.out.println("Digite a base: ");
        n1 = input.nextDouble();
        System.out.println("Digite o expoente: ");
        n2 = input.nextDouble();
        
        potencia = Math.pow (n1,n2);
        
        System.out.println("Resultado da Potência: " + potencia);
        
        
    }
    
}
