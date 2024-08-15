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
public class Questao04 {
    public static void resposta(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um valor em Milhas a ser transformado em Km: ");
        double milhas = scan.nextDouble();
        double km = milhas * 1.609;
        
        System.out.printf("%.2f Milhas equivalem a %.2fKm \n",milhas, km);
    }
}
