package EjerciciosLecturaDatos;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int euros;
        double pesetas = 0.00601, conversion;
        System.out.println("Ingrese cuantos Euros quiere convertir a pesetas: ");
        euros = Entrada.LeerInt();
        conversion = (euros * pesetas);
        System.out.println("La conversion es: " + conversion+" pesetas");
    }

}

