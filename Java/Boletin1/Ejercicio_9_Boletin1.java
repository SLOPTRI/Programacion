package Boletin1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio_9_Boletin1 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Ingrese el primer numero");
        a = Entrada.LeerInt();
        System.out.println("Ingrese el segundo numero");
        b = Entrada.LeerInt();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(a);
        lista.add(b);
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println(lista);
    }
}
