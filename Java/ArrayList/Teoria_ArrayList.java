package ArrayList;

import java.util.ArrayList;

public class Teoria_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++){
            n.add(i);
        }
        int buscar = n.get(0);
        System.out.println(buscar);
        int eliminar = n.remove(4);
        System.out.println(n);

        ArrayList<Integer> clonado = (ArrayList<Integer>) n.clone();
        clonado.add(5);
        System.out.println(clonado);

        int numeroBuscar = 4;
        if (n.contains(numeroBuscar)){
            System.out.println("El numero esta");
        } else{
            System.out.println("El numero no esta");
        }

        n.clear();
        n.add(1);
        System.out.println(n);
    }
}
