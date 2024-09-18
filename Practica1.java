package practica1.Practica1;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        int radio = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del radio: ");
        radio = scanner.nextInt();
            double Area = Math.PI * Math.pow(radio, 2);
            double perimetro = 2 * Math.PI * radio;
            System.out.println("El área del círculo es: " + Area);
            System.out.println("El perímetro del círculo es: " + perimetro);
    }
}
