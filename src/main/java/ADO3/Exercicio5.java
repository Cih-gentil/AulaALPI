/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ADO3;

import java.util.Scanner;

/**Leia um valor inteiro N do usuário, onde N é maior ou igual a 2 e menor ou igual a
1000.
A seguir, mostre a tabuada de N no seguinte formato:
1 x N = N 2 x N = 2N ... 10 x N = 10N
 *
 * @author cilucena
 */
public class Exercicio5 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        int n, mult; 
        
        System.out.println("Insira um número maior que 2 e menor que 1000: ");
        n = input.nextInt();
        
        for(int i=1; i<=10; i++) {
            mult = i*n;
            System.out.println(i + " x " +  n +  " = " + mult);
        }
    }
    
}
