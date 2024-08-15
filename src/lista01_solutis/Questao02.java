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
public class Questao02 {

    public static void resposta(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor 1: ");
        int valorA = scan.nextInt();
        
        System.out.print("Digite o valor 2: ");
        int valorB = scan.nextInt();
        
        int resposta = valorA > valorB ? valorA : valorB;
        
        System.out.println("O maior valor eh: " + resposta);
    }
}
