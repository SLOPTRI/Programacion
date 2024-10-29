package Boletin1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada {
    public static String LeerString(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String cadena = "";
        try {
            cadena = entrada.readLine();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return cadena;
    }
    public static int LeerInt(){
        int numero;
        numero = Integer.parseInt(LeerString());
        return numero;
    }
    public static double LeerDouble(){
        double numero;
        numero = Double.parseDouble(LeerString());
        return numero;
    }
    public static char LeerChar(){
        char letra;
        letra = LeerString().charAt(0);
        return letra;
    }
}
