package EjerciciosLecturaDatos;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int b,a;
        double area;
        System.out.println("Ingrese la altura: ");
        a = Entrada.LeerInt();
        System.out.println("Ingrese la base: ");
        b = Entrada.LeerInt();
        area = a*b;
        System.out.println("El area es: "+area);
    }
}
