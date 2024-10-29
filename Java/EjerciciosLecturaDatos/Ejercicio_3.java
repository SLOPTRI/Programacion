package EjerciciosLecturaDatos;

public class Ejercicio_3 {

    public static void main(String[] args) {
        double euros = 166.40;
        double pesetas,conversion;
        System.out.println("Ingrese cuantas pesetas quieres convertir a euros: ");
        pesetas = Entrada.LeerInt();
        conversion = (pesetas/euros);
        System.out.println("La conversion es: " + conversion+" euros");
    }

}
