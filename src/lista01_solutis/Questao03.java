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
public class Questao03 {

    public static void resposta(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = scan.nextInt();

        for (int i = num; i > 0; i--) {
            if (ehPrimo(i)) {
                System.out.println("O numero " + i + " eh primo");
            }
        }
    }

    public static boolean ehPrimo(int num) {

        if (num <= 1) {
            return false;
        }

        //Verificar se num é divisivel por algum numero entre 2 e sua raiz quadrada
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
