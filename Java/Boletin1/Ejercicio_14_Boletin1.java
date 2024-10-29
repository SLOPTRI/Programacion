package Boletin1;

public class Ejercicio_14_Boletin1 {
    public static void main(String[] args) {
        double nota;
        System.out.println("Ingrese la nota del estudiante: ");
        nota = Entrada.LeerDouble();
        if (nota > 0 && nota < 5){
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota < 6){
            System.out.println("Suficiente");
        } else if (nota >= 6 && nota < 7){
            System.out.println("Bien");
        } else if (nota >= 7 && nota < 9){
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10){
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota no valida");
        }
    }
}
