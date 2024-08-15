/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01_solutis;

import java.util.Scanner;

public class Questao12 {

    public static void resposta(String args[]) {
        Scanner scan = new Scanner(System.in);
        int km = 0, gasolina = 0;
        String continuar = "s";

        do {
            System.out.print("Digite quantos Km foram dirigidos: ");
            km += scan.nextInt();

            System.out.print("Digite quantos Litros de gasolina foram gastos: ");
            gasolina += scan.nextInt();

            System.out.print("Quer continuar? (s/n) ");
            continuar = scan.next().toLowerCase();
            System.out.println("============");
        } while ("s".equals(continuar));

        float mediaDeConsumo = (float) km / gasolina;
        
        System.out.println("\n============");
        System.out.printf("Quilometros Rodados: %dKm\n", km);
        System.out.printf("Litros de combustivel: %dL\n", gasolina);
        System.out.printf("Media de consumo: %.2fkm/l\n", mediaDeConsumo);
        System.out.println("============");
    }
}
