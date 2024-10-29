package Boletin1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio_10_Boletin1 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Ingrese el primer numero");
        a = Entrada.LeerInt();
        System.out.println("Ingrese el segundo numero");
        b = Entrada.LeerInt();
        System.out.println("Ingrese el tercer numero");
        c = Entrada.LeerInt();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(a);
        lista.add(b);
        lista.add(c);
        Collections.sort(lista,Collections.reverseOrder());
        System.out.println(lista);
    }
}
