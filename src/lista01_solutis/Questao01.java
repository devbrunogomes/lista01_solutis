/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01_solutis;

/**
 *
 * @author bsgom
 */
public class Questao01 {

    public static void resposta(String args[]) {
        int i = 5;
        int j = i != 0 ? i : 0;
        j = 10;
        System.out.println("i + j = " + j + i);

        /*
        O programa terá a saída: “i + j = 105)”, pois, na linha de output o sinal “+” 
        é interpretado como concatenação, e não como soma. Se fosse pra ser 
        interpretado como soma, a operação “j+i” deveria ser envolvida com parenteses.
        
         */
    }
}
