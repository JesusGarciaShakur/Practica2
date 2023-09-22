/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import java.util.Scanner;
/**
 *
 * @author jesus
 */
public class Practica2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su primer valor : ");
        double dividendo = scanner.nextDouble();

        System.out.print("Ingrese su segundo valor : ");
        double divisor = scanner.nextDouble();

        double mcd = MaximoComun(dividendo, divisor);
        System.out.println("El maximo comun divisor es: " + mcd);
    }

    public static double MaximoComun(double dividendo, double divisor) {
        if (divisor == 0) {
            return dividendo;
        } else {
            return MaximoComun(divisor, dividendo % divisor);
        }
    }
}
