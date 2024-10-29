package EjerciciosLecturaDatos;

public class Ejercicio_4 {

    public static void main(String[] args){
        int numero1,numero2,multiplicacion,suma;
        double division,resta;
        System.out.println("Ingrese el primer numero: ");
        numero1 = Entrada.LeerInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = Entrada.LeerInt();
        multiplicacion = (numero1*numero2);
        resta = (numero1-numero2);
        division = (numero1/numero2);
        suma = (numero1+numero2);
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        System.out.println("El resultado de la division es: "+division);
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
    }

}
