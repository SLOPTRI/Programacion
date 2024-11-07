package Prueba1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        int ancho, alto,numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la ancho de la tabla: ");
        ancho = entrada.nextInt();
        System.out.println("Ingrese la alto de la tabla: ");
        alto = entrada.nextInt();
        for (int i = 0; i < alto; i++) {  // Recorre el alto
            for (int j = 0; j < ancho; j++) {  // Recorre el ancho
                numero = (int)(Math.random()*ancho+2); //Genero un numero aleatorio
                System.out.print("*"+" ");  // Imprime un asterisco sin salto de línea
                if (numero > ancho){ //Condicion para hacerle un bocado a la tabla
                    //Suma uno a la variable iteradora para que asi se ejecute menos veces y sea como un bocado ya que
                    //imprimira menos veces
                    j += 1;
                }
            }
            System.out.println(" ");
        }
    }
}
