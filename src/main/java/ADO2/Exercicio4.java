/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ADO2;

import java.util.Scanner;

/**Calcular a conta de consumo de energia elétrica de um consumidor, dado
o kWh consumido, de acordo com a tabela.
 *
 * @author cilucena
 */
public class Exercicio4 {

    public static void main(String[] args) {
         Scanner imput = new Scanner (System.in);
        
        //declaração de váriaveis 
        double kwh,consumo; 
        
        //dados de entrada 
        System.out.println("Cálculo de consumo de energia elétrica");
        System.out.println("Insira o valor em kWh da energia comsumida ");
        kwh = imput.nextDouble();
        
        if (kwh <=59.5) {
            System.out.println("O valor do consumo de energia a ser pago é de R$11,90");
        }
        else if (kwh >59.5 && kwh <150) {
            consumo = kwh * 0.20;
            System.out.println("O valor do consumo a ser pago é " + consumo);
        }
        
        else if (kwh >=150 && kwh <500) {
            consumo = kwh * 0.25; 
           System.out.println("O valor do consumo a ser pago é " + consumo);
        }
        
        else {
            consumo = kwh * 0.30;
            System.out.println("O valor do consumo a ser pago é " + consumo);       
        } 
    }
    
}
