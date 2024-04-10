package Ejemplo;

import javax.swing.JOptionPane;

public class Ejemplo {

    public void leer() {
        int numero;
        //do {
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        JOptionPane.showMessageDialog(null, "Factorial de " + numero + " es : " + FactorialRecursivo(numero));
        JOptionPane.showMessageDialog(null, "Factorial de " + numero + " es : " + FactorialConBucle(numero));

        //} while (numero != 0);
    }

    //metodo factorial de manera recursiva
    public int FactorialRecursivo(int numero) {
        if (numero < 0) {//validamos para que no se ingresen numeros negativos
            return 0;
        } else {
            if (numero == 0) {//caso base 
                return 1;
            } else {
                //Dominio Problema-1
                return numero * FactorialRecursivo(numero - 1);
            }
        }
    }

    //metodo 
    public int FactorialConBucle(int num) {
        int fac = 1;
        if (num < 0) {
            return 0;
        } else {
            while (num != 0) {
                fac = num * fac;
                num--;
            }
            return fac;
        }
    }

    public static void main(String[] args) {
        Ejemplo g = new Ejemplo();
        g.leer();
    }
}
