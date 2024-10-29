package Boletin1;

public class Ejercicio_15_Boletin1 {
    public static void main(String[] args) {
        int dia,mes,anio;
        System.out.println("Introduce el dia");
        dia = Entrada.LeerInt();
        System.out.println("Introduce el mes");
        mes = Entrada.LeerInt();
        System.out.println("Introduce el año");
        anio = Entrada.LeerInt();

        if (dia < 1 || dia > 30){
            System.out.println("El dia no es valido");
        } else if(mes < 1 || mes > 12){
            System.out.println("El mes no es valido");
        } else{
            System.out.println("La fecha es correcta: "+ dia +":"+ mes +":"+ anio);
        }
    }
}
