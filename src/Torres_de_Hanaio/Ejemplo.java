package Torres_de_Hanaio;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejemplo {

    public void Torres_Hanoi(int discos, int torre1, int torre2, int torre3) {
        if (discos == 1) {//case base 
            System.out.println("Mover Disco de Torre: " + torre1 + " a torre " + torre3);
        } else {
            try {
                //Domimio (Problema -1)
                Thread.sleep(500);//retarda el tiendo
                Torres_Hanoi(discos - 1, torre1, torre3, torre2);
                System.out.println("Mover Discos de torre " + torre1 + " a torre " + torre3);
                Torres_Hanoi(discos - 1, torre2, torre1, torre3);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejemplo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void leer() {
        Scanner leer = new Scanner(System.in);
        int discos, torre1, torre2, torre3;
        System.out.println("Ingresa la cantidad de discos: ");
        discos = leer.nextInt();
        System.out.println("Ingresa la torre 1");
        torre1 = leer.nextInt();
        System.out.println("Ingresa la torre 2 ");
        torre2 = leer.nextInt();
        System.out.println("Ingresa la torre 3");
        torre3 = leer.nextInt();
        Torres_Hanoi(discos, torre1, torre2, torre3);
        System.out.println("Juego Completado! :)");

    }

    public static void main(String[] args) {
        Ejemplo r = new Ejemplo();
        r.leer();

    }
}
