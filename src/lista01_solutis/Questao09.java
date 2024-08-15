/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01_solutis;

import java.util.Scanner;

/**
 *
 * @author bsgom
 */
public class Questao09 {
   public static void resposta(String args[]) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Vamos calcular a area de um circulo, a partir do Raio");
       System.out.print("Insira o raio de um circulo: ");
       double raio = scan.nextDouble();
       double area = Math.PI * (raio * raio);
       
       System.out.printf("A area eh igual a: %.2f\n", area);
   } 
}
