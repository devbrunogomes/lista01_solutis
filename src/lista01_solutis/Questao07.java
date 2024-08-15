/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01_solutis;

/**
 *
 * @author bsgom
 */
public class Questao07 {
    public static void resposta(String args[]){
        int divisaoInt = 0;
        double divisaoDouble = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0) {
                if (i % 2 == 0) {
                    divisaoInt = i /2 ;
                    System.out.printf("%d / 2 = %d\n",i, divisaoInt);
                } else {
                    divisaoDouble = (double) i / 2;
                    System.out.printf("%d / 2 = %.2f\n",i, divisaoDouble);
                }
            }
        }
    }
}
