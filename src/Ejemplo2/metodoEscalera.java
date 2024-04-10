package Ejemplo2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class metodoEscalera {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ejemplo2.metodoEscalera d = new metodoEscalera();
        System.out.println("En que escalon estan: ");
        int escalones = leer.nextInt();
        d.BajarEscalera(escalones);
    }

    //creando un metodo para bajar una escalera de manera recursiva
    public void BajarEscalera(int escalones) {
        if (escalones < 0) {//hacemos una validacion 
            System.out.println("No puedes bajar escalones negativos!");
        } else {
            if (escalones == 0) {
                //case base respuesta explicita
                System.out.println("!Has termido de bajar la escalera :^) !");
            } else {
                try {
                    //Dominio, la division del problema original(problema - 1)
                    Thread.sleep(500);//retarda el tiendo
                    System.out.println("Bajando escalon " + escalones + " :)");
                    //haciendo uso de la recursividad
                    BajarEscalera(escalones - 1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(metodoEscalera.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
