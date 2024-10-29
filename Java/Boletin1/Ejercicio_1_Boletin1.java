package Boletin1;

public class Ejercicio_1_Boletin1 {
    public static void main(String[] args) {
        int a,c;
        double arriba, r1, r2,b,d;
        System.out.println("Ingrese los 3 numeros pulsando enter cada vez que introduzca uno: ");
        a = Entrada.LeerInt();
        b = Entrada.LeerInt();
        c = Entrada.LeerInt();
        d = Math.pow(b,2)-4*a*c;
        if (d < 0) {
            System.out.println("La solucion no tiene soluciones reales");
        }else {
            arriba = Math.sqrt(d);
            r1 = (-b + arriba) / (2 * a);
            r2 = (-b - arriba) / (2 * a);
            System.out.println("El resultado 1 es: " + r1);
            System.out.println("El resultado 2 es: " + r2);
        }
    }
}
