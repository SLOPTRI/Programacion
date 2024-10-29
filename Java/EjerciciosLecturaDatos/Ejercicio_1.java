package EjerciciosLecturaDatos;

public class Ejercicio_1 {

    public static void main(String[] args){
        int numero1,numero2;
        int multiplicacion;
        System.out.println("Ingrese el primer numero: ");
        numero1 = Entrada.LeerInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = Entrada.LeerInt();
        multiplicacion = numero1*numero2;
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
    }
}
