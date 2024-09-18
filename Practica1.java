package Practica1;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        
        do {
            int radio = 0;

            System.out.println("Ingresa el tamaño del radio: ");
            radio = scanner.nextInt();

            double Area = Math.PI * Math.pow(radio, 2);
            double perimetro = 2 * Math.PI * radio;

            System.out.println("El área del círculo es: " + Area);
            System.out.println("El perímetro del círculo es: " + perimetro);
            System.out.println("¿Quieres calcular otro círculo? (S/N): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("¡Gracias por usar el programa!");
        scanner.close();
    }
}
