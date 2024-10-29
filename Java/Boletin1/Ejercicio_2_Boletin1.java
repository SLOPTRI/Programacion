package Boletin1;

public class Ejercicio_2_Boletin1 {
    public static void main(String[] args) {
        int radio;
        double area;
        System.out.println("Ingrese el radio del circulo en cm: ");
        radio = Entrada.LeerInt();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area+" cm");
    }
}
