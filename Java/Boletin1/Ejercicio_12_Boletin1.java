package Boletin1;

public class Ejercicio_12_Boletin1 {
    public static void main(String[] args) {
        int n,numeroReves, digito;
        System.out.println("Ingrese un numero: ");
        n = Entrada.LeerInt();
        if (n > 9999){
            System.out.println("El numero es demasiado grande");
        }else{
            numeroReves = 0;
            while (n > 0){
                digito = n % 10;
                numeroReves = numeroReves * 10 + digito;
                n /= 10;
            }
            System.out.println("El numero invertido es: "+numeroReves);
        }
    }
}
