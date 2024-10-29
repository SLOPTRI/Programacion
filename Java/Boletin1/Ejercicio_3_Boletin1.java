package Boletin1;

public class Ejercicio_3_Boletin1 {
    public static void main(String[] args) {
        double longitud;
        int radio;
        System.out.println("Ingrese el radio del circulo en cm: ");
        radio = Entrada.LeerInt();
        longitud = 2*Math.PI*radio;
        System.out.println("La longitud del circulo es " + longitud+" cm");
    }
}
