/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01_solutis;

/**
 *
 * @author bsgom
 */
public class Questao06 {
    public static void resposta(String args[]){
        double produto = 1;
        
        for (int i = 15; i <= 30; i++) {
            if (i%2 != 0) {
                System.out.println(i);
                produto *= i;
            }
        }
        
        System.out.println(produto);
    }
}
