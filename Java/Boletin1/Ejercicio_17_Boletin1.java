package Boletin1;

public class Ejercicio_17_Boletin1 {
    public static void main(String[] args) {
        int dia,mes,anio;
        System.out.println("Introduce el dia");
        dia = Entrada.LeerInt();
        System.out.println("Introduce el mes");
        mes = Entrada.LeerInt();
        System.out.println("Introduce el anio");
        anio = Entrada.LeerInt();
        switch(mes){
            case 1,2,3,4,5,6,7,8,9,10,11,12:
                if (dia < 1 && dia > 30){
                    System.out.println("El dia es incorrecto");
                }
                else if (dia == 30){
                    dia = 1;
                    if (mes == 12){
                        anio += 1;
                        mes = 1;
                        System.out.println("La fecha es: "+dia+"/"+mes+"/"+anio);
                    }
                    else{
                        mes += 1;
                        System.out.println("La fecha es: "+dia+"/"+mes+"/"+anio);
                    }
                }
                else{
                    dia += 1;
                    System.out.println("La fecha es: "+dia+"/"+mes+"/"+anio);
                }
                break;
            default:
                if (mes > 12){
                 System.out.println("El mes es incorrecto");
                }
        }
    }
}
