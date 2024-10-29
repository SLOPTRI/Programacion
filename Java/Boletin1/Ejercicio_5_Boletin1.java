package Boletin1;

public class Ejercicio_5_Boletin1 {
    public static void main(String[] args) {
        int a;
        System.out.println("Ingrese un numero: ");
        a = Entrada.LeerInt();
        if (a < 0){
            System.out.println("El numero es negativo");
        } else{
            System.out.println("El numero es positivo");
        }
    }
}
