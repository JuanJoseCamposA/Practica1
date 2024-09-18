
package practica1;
public class Practica1 {
    public static void main(String[] args) {
        int Radio;

	System.outprintln("Ingresa el tamaño del radio: ");
	Scanner radio=new Scanner(System.in);
	radio=radio.nextInt();
	double Area=Math.PI*Math.pow(Radio,2);
	System.out.println("El area del circulo es de: "+Area);
    }
}
