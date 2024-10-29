package Boletin1;

public class Ejercicio_11_Boletin1 {
    public static void main(String[] args) {
        int a,n_cifras;
        System.out.print("Ingrese un numero: ");
        a = Entrada.LeerInt();
        n_cifras = 0;
        while(a != 0){
            a /= 10;
            n_cifras += 1;
        }
        if (n_cifras > 4){
            System.out.println("El número debe ser menor a 9999");
        }
        else{
            System.out.println("La cifras es: "+n_cifras);
        }
    }
}
