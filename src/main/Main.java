package main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //PREGUNTA 1:

        JOptionPane.showMessageDialog(null,
                "Cree una aplicación que le pedirá un nombre de usuario y luego una habilidad. " +
                        "Luego, el programa imprimirá \"nombre es habilidad\"\n", "PREGUNTA 1", 1);
        Scanner entrada = new Scanner(System.in);
        String Nombre = "";
        String Habilidad = "";

            Nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
            Habilidad = JOptionPane.showInputDialog("Ingrese Habilidad: ");

            String msg = Nombre + " es " + Habilidad + ".";


            JOptionPane optionPane = new JOptionPane();
            optionPane.setMessage(msg);
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "Resultado");
            dialog.setVisible(true);

        //PREGUNTA 2:

        JOptionPane.showMessageDialog(null,
                "Cree una aplicación que solicite un número entero e " +
                        "imprima su segunda potencia (x al cuadrado).", "PREGUNTA 2", 1);

        Scanner potencia = new Scanner(System.in);
        int numero, resultado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número: "));
        numero = numero*numero;
        resultado = numero;
        resultado = resultado*resultado;

        JOptionPane.showMessageDialog(null, "La potencia es: " + resultado);

        //PREGUNTA 3:

        JOptionPane.showMessageDialog(null,
                "Crea una aplicación que te pida el radio de un círculo. " +
                        "Luego imprime su circunferencia y su área.", "PREGUNTA 3", 1);
        Scanner circulo = new Scanner(System.in);

        double radio, area, diametro, circunfenrencia;

        radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio: "));
        diametro=radio*2;
        area=(3.1416)*(radio*radio);
        circunfenrencia=(3.1416)*diametro;
        String msg3 = "El Área del Círculo es: "+area+" y la Circunferencia es: "+circunfenrencia;

        optionPane = new JOptionPane();
        optionPane.setMessage(msg3);
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        dialog = optionPane.createDialog(null, "Resultado");
        dialog.setVisible(true);

        //PREGUNTA 4

        JOptionPane.showMessageDialog(null,
                "Crea una clase que te permite generar automóviles con sus características, " +
                        "por ejemplo: (Mazda, 2008, KT (Modelo), 24L (Capacidad de Llenado), etc..)\n", "PREGUNTA 4", 1);
        Scanner herencia = new Scanner(System.in);

        List<Auto> lista = new ArrayList<>();

        Auto auto1 = new Auto ("Mazda, 2008, KT",2008,"250 CF", "Kia","54 Kmph","24 Litros\n");
        Auto auto2 = new Auto ("Toyota Yaris 5P 2017 70 City",2010,"300 CF", "Toyota","70 Kmph","50 Litros\n");

        lista.add(auto1);
        lista.add(auto2);

        JOptionPane.showMessageDialog(null, "Models de Autos: " + lista);

        //PREGUNTA 5

        JOptionPane.showMessageDialog(null,
                "Crea una función que compruebe que un nuevo sea par o impar.", "PREGUNTA 5", 1);

        Scanner numeropar = new Scanner(System.in);

        int num;

        num= Integer.parseInt(JOptionPane.showInputDialog("Ingrese número: "));

        if (num % 2 ==0){
            JOptionPane.showMessageDialog(null, num+" es par.");
        }else {
            JOptionPane.showMessageDialog(null, num+" es impar.");
        }

        //PREGUNTA 6

        JOptionPane.showMessageDialog(null,
                "Crea una función que multiplique dos números decimales.", "PREGUNTA 6", 1);

        Scanner multiplicar = new Scanner(System.in);

        float valor, valor2, rs;

        valor=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número decimal: "));
        valor2= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número decimal: "));

        rs= valor*valor2;

        JOptionPane.showMessageDialog(null, "El resultado es: " + rs);

    }
}