package Prueba1;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        int numeros;

        for (int i = 0; i < 20; i++) {
            numeros = (int) (Math.random() * 100);
            if (numeros % 2 == 0) {
                pares.add(numeros);
            } else {
                impares.add(numeros);
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i < pares.size()) {
                listaNumeros.add(pares.get(i));
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i < impares.size()) {
                listaNumeros.add(impares.get(i));
            }
        }
        System.out.println(listaNumeros);
    }
}
