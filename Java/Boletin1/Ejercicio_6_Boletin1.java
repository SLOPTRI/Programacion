package Boletin1;

public class Ejercicio_6_Boletin1 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Ingrese el primer numero");
        a = Entrada.LeerInt();
        System.out.println("Ingrese el segundo numero");
        b = Entrada.LeerInt();
        if (a%b==0) {
            System.out.println("El numero " + a + " es multiplo de " + b);
        } else{
            System.out.println("El numero " + a + " no es multiplo de " + b);
        }
    }
}
