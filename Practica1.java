/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class Practica1 {

    // Método para calcular el área de un círculo
    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el área de un rectángulo
    public static double areaRectangulo(double largo, double ancho) {
        return largo * ancho;
    }

    // Método para calcular el área de un triángulo
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Calculadora de Áreas");
            System.out.println("1. Círculo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El área del círculo es: " + areaCirculo(radio));
                    break;
                case 2:
                    System.out.print("Introduce el largo del rectángulo: ");
                    double largo = scanner.nextDouble();
                    System.out.print("Introduce el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.println("El área del rectángulo es: " + areaRectangulo(largo, ancho));
                    break;
                case 3:
                    System.out.print("Introduce la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Introduce la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("El área del triángulo es: " + areaTriangulo(base, altura));
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta nuevamente.");
            }

            System.out.println();

        } while (opcion != 4);

        scanner.close();
    }
}



