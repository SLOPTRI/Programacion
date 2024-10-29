import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Entrada_Datos {
    public static void main(String[] args) {
        Scanner prueba = new Scanner(System.in);

        // .nextInt() Lee un numero entero
        System.out.println("Ingrese un numero int: ");
        int numero_int = prueba.nextInt();

        // .nextFloat() Lee un numero float
        System.out.println("Ingrese un numero float: ");
        float numero_float = prueba.nextFloat();

        // .nextDouble() Lee un numero double
        System.out.println("Ingrese un numero double: ");
        double numero_double = prueba.nextDouble();

        // .next() Lee una palabra
        System.out.println("Ingrese una palabra: ");
        String palabra = prueba.next();

        // .nextLine() Lee una linea entera incluyendo espacios
        System.out.println("Ingrese un texto: ");
        String texto = prueba.nextLine();

        //Imprimir las variables
        System.out.println("Numero entero: "+numero_int+" Numero float: "+numero_float+" Numero double: "+numero_double+" Palabra: "+palabra+" Texto: "+texto);

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        String nombre;
        int edad;
        float decimal;
        double decimalexacto;
        //Para poder usar BufferedReader tenemos que usar try catch
        try{
            System.out.println("Ingrese el nombre: ");
            nombre = lector.readLine();
            System.out.println("Ingrese el edad: ");
            edad = Integer.parseInt(lector.readLine()); // .parseInt Convierte una cadena de texto en un numero entero
            decimal = Float.parseFloat(lector.readLine());
            decimalexacto = Double.parseDouble(lector.readLine());
            System.out.println("El nombre es: "+nombre+", La edad es: "+edad);
            System.out.println(decimal+" "+decimalexacto);
        } catch(IOException e){ //Genera un objeto "e" y en el podemos guardar el error con .getMessage()
            System.out.println("No se puede ingresar el nombre"+e.getMessage());
        }
    }
}
