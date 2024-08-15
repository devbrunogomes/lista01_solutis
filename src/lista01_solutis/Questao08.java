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
public class Questao08 {
    public static void resposta(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um palavra: ");
        String palavra = scan.next();
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        
        System.out.println("Palavra Original: " + palavra);
        System.out.println("Palavra Invertida: " + palavraInvertida);
        
        if (palavra.equals(palavraInvertida)) {
            System.out.println("A palavra eh um palindromo");
        } else {
            System.out.println("A palavra nao eh um palindromo");
        }
        
        
    }
}
