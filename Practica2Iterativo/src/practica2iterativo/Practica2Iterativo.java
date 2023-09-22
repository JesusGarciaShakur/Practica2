/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2iterativo;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
    /**
     * @param args the command line arguments
     */
public class Practica2Iterativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su primer valor : ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingrese su segundo valor : ");
        int divisor = scanner.nextInt();

        int mcd = calcularMCD(dividendo, divisor);
        System.out.println("El maximo comun divisor es: " + mcd);
    }

    public static int calcularMCD(int dividendo, int divisor) {
        while (divisor != 0) {
            int resto = dividendo % divisor;
            dividendo = divisor;
            divisor = resto;
        }
        return dividendo;
    }
}
