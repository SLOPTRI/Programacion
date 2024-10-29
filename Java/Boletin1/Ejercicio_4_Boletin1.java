package Boletin1;

public class Ejercicio_4_Boletin1 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Ingrese el primer numero: ");
        a = Entrada.LeerInt();
        System.out.println("Ingrese el segundo numero: ");
        b = Entrada.LeerInt();
        if(a==b){
            System.out.println("Los numeros son iguales");
        } else{
            System.out.println("Los numeros son diferentes");
        }
    }
}
