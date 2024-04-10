package SerieFibonaci;

import javax.swing.JOptionPane;

public class Ejemplo {

    public void leer() {
        int numero;
        JOptionPane.showMessageDialog(null, "Serie fibonaci");
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
            JOptionPane.showMessageDialog(null, "La sucesion Fibonoci del numero: " + numero
                    + "\n Mediante recursividad es: " + FibonaciRecursividad(numero));
            JOptionPane.showMessageDialog(null, "La sucesion Fibonoci del numero: " + numero
                    + "\n Mediante Ciclo es:  " + FibonaciRecursividad(numero));
        } while (numero != 0);
    }

    //metodo con recursividad
    public int FibonaciRecursividad(int numero) {
        if (numero < 0) {//validamos
            return 0;
        } else {
            if (numero == 1 || numero == 2) {//case base 
                return 1;
            } else {//caso Dominio 
                return FibonaciRecursividad(numero - 1) + FibonaciRecursividad(numero - 2);
            }
        }
    }

    public int FibonaciCiclo(int num) {
        int fibo = 0;
        int primero = 1;
        int segundo = 0;
        while (num > 0) {
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            num--;
        }
        //n = 4  - 1 = 3
        /*
        fibo = 0 
        primero = 1
        segundo = 0 
        
        fibo = 1 + 0 =1
        primero = 0
        segundo = 1 
        
        */
        return fibo;
    }
    

    public static void main(String[] args) {
        Ejemplo f = new Ejemplo();
        f.leer();
    }
}
