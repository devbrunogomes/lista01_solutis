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
public class Questao11 {
    public static void resposta(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a 1a Palavra: ");
        String palavra1 = scan.next().trim();
        
        System.out.print("Digite a 2a Palavra: ");
        String palavra2 = scan.next().trim();
        
        int result = palavra1.compareTo(palavra2);
        
        if (result < 0) {
            System.out.println(palavra1 + "\n" + palavra2);
        } else if (result == 0) {
            System.out.println(palavra1 + "//" + palavra2);
        } else {
            System.out.println(palavra2 + "\n" + palavra1);
        }
        
        String maiorPalavra = palavra1.length() > palavra2.length() ? palavra1 : palavra2;
        System.out.println("A maior palavra eh: " + maiorPalavra + " com " + maiorPalavra.length() + " caracteres");
        
    }
}
