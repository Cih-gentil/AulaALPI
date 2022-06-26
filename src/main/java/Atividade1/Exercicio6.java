/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/** Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (π = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B
 *
 * @author cilucena
 */
public class Exercicio6 {

    public static void main(String[] args) {
         Scanner imput = new Scanner (System.in);
        
        //declaração de variáveis 
        double a, b, c, areaTR, areaC, areaT, areaQ, areaR, periR;
        
        //entrada de dados
        System.out.println("Cálculos de aréas e perímetros");
        System.out.println("Digite o número A ");
        a = imput.nextDouble();
        System.out.println("Digite o número B ");
        b = imput.nextDouble();
        System.out.println("Digite o número C ");
        c = imput.nextDouble();
        
        /* processamento de dados */
        // cálculo da área de um triângulo retangulo com base A e altura C.
        areaTR = (a * c)/2;
       // cálculo da área de um círculo com raio C.
       areaC = Math.PI * Math.pow(c, 2);
       //cálculo da área de um trápezio com bases A e B, e altura C.
       areaT = (a + b)*c/2;
       //cálculo da área de um quadrado com lado B.
       areaQ = Math.pow(b, 2);
       //cálculo da área de um retângulo com lados A e B.
       areaR = a * b; 
       //cálculo do perímetro de um retangulo com lados A e B. 
       periR = Math.pow(a,2) + Math.pow(b,2);
       
               
      //saída de dados 
        System.out.println("A área do triângulo retangulo é " + areaTR);
        System.out.println("A área do círculo é " + areaC);
        System.out.println("A área do trápezio é " + areaT);
        System.out.println("A área do quadrado é " + areaQ);
        System.out.println("A área do retângulo é " + areaR + " E o perímetro deste mesmo retângulo é " + periR);
        
    }    
    

}
    
    

