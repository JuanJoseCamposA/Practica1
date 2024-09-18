package practica1;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);  
        
        System.out.println("Escoja la figura deseada");
        Scanner figura=new Scanner (System.in); 
        
        int opcion = scanner.nextInt();
                  
        switch(opcion){
            
            case 1:
                System.out.println("Circulo");
                
            case 2:
                System.out.println("Cuadrado");
                    
            case 3:     
                System.out.println("Triangulo");
     
     }
    }   

    private static String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}