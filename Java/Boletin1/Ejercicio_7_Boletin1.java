package Boletin1;

public class Ejercicio_7_Boletin1 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Ingrese el primer numero");
        a = Entrada.LeerInt();
        System.out.println("Ingrese el segundo numero");
        b = Entrada.LeerInt();
        if (a > b){
            System.out.println("El numero "+a+" es mayor que el numero "+b);
        }
        else{
            System.out.println("El numero "+b+" es mayor que el numero "+a);
        }
    }
}
