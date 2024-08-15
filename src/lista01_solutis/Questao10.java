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
public class Questao10 {

    public static void resposta(String args[]) {
        Scanner scan = new Scanner(System.in);

        int contadorVogais = 0, contadorEspaco = 0, contadorConsoante = 0;

        System.out.print("Digite uma palavra ou frase: ");
        String input = scan.nextLine().toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> contadorVogais++;
                case ' ' -> contadorEspaco++;
                default -> contadorConsoante++;
            }
        }
        
        System.out.println("Total de Vogais: " + contadorVogais);
        System.out.println("Total de espacos em branco: " + contadorEspaco);
        System.out.println("Total de consoantes: " + contadorConsoante);
    }
}
