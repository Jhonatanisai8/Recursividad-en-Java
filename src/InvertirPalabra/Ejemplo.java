package InvertirPalabra;

import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int logitud;
        
        System.out.println("Ingresa una palabra: ");
        palabra = leer.nextLine();
        logitud = palabra.length();
        //llamamos al metodo
        System.out.println(InvertirPalabra(palabra, logitud-1));

    }

    public static String InvertirPalabra(String cadena, int longitug) {
        if (longitug == 0) {
            return cadena.charAt(longitug) + "";
        } else {
            return cadena.charAt(longitug) + (InvertirPalabra(cadena, longitug - 1));
        }
    }
}
