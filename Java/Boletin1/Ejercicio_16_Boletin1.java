package Boletin1;

public class Ejercicio_16_Boletin1 {
    public static void main(String[] args) {
        int dia,mes,anio;
        System.out.println("Introduce el dia");
        dia = Entrada.LeerInt();
        System.out.println("Introduce el mes");
        mes = Entrada.LeerInt();
        System.out.println("Introduce el año");
        anio = Entrada.LeerInt();
        switch(mes){
            case 1,3,5,7,8,10,12:
                if(dia<1||dia>31){
                    System.out.println("Fecha incorrecta");
                }else{
                    System.out.println("Fecha correcta");
                }
                break;
            case 2:
                if(dia<1||dia>28){
                    System.out.println("Fecha incorrecta");
                }else {
                    System.out.println("Fecha correcta");
                }
                break;
            case 4,6,9,11:
                if(dia<1||dia>30){
                    System.out.println("Fecha incorrecta");
                }else {
                    System.out.println("Fecha correcta");
                }
                break;
        }
    }
}
