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
public class Questao05 {

    public static void resposta(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] diasDaSemana = {"Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        int num = 0;
        
        System.out.print("Digite um numero de 1 a 7: ");
        num = scan.nextInt();
        
        do {
            System.out.println("Numero invalido!");
            System.out.print("Digite um numero de 1 a 7: ");
            num = scan.nextInt();
        } while ((num <= 0) || (num > 7));
        System.out.println("================");
        System.out.println("Dia escolhido: " + diasDaSemana[num-1]);
    }
}
