/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionejemplospoo;

import geometria.Rectangulo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Formacion
 */
public class DesdeFicheros {

    public static void guardarRectangulos() {
        Rectangulo rec = new Rectangulo("Red", 10, 5);
        FileWriter fichero = null;
        PrintWriter pw = null;

        try { //Intentamos hacer cosas con ficheros 
            fichero = new FileWriter("C:/figuras/rectangulo.txt");
            pw = new PrintWriter(fichero);
            pw.println("Rectangulo, base = " + rec.getBase() + ", altura = " + rec.getAltura() + ", color = " + rec.getColor());
        } catch (Exception ex) { //Si ocurre algun error catch captura la excepcion
            ex.printStackTrace();
        } finally { //Lo ejecuta siempre haya error o no
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(DesdeFicheros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void leerRectangulo() {
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        String aux1 = "", aux2 = "";

        try {
            fichero = new File("C:/figuras/rectangulo.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
            String aux;

            String cadena = br.readLine();

            if (cadena != null) {
                //System.out.println(cadena);

                String[] cad = cadena.split("= ");

                String[] num = new String[cad.length];
                ArrayList<String> numero = new ArrayList<>();

                for (int i = 0; i < cad.length; i++) {
                    num = cad[i].split(",");
                    numero.add(String.valueOf(num[0]));
                }

                aux = String.valueOf(numero.get(0));
                String[] auxCad = aux.split(": ");
                numero.set(0, String.valueOf(auxCad[0]));

                /*for (int i = 0; i < numero.size(); i++) {
                   System.out.println("=> " + numero.get(i));
                }*/
                System.out.println("----------------------------------------------------");
                Rectangulo r3 = new Rectangulo(numero.get(3).trim(), Float.valueOf(numero.get(1).trim()), Float.valueOf(numero.get(2).trim()));
                System.out.println("Área rectángulo: " + r3.calcularArea());
                System.out.println("Perímetro rectángulo: " + r3.calcularPerimetro());
                System.out.println("Color rectángulo: " + r3.getColor());
                System.out.println("-----------------------------------------------------");

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(DesdeFicheros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void leerRectanguloDos() {
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        String aux1 = "", aux2 = "";
        String baseCad = "", alturaCad = "", color = "";

        try {
            fichero = new File("C:/figuras/rectangulo.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
            String aux;

            String cadena = br.readLine();

            if (cadena != null) {
                //System.out.println(cadena);

                String[] cad = cadena.split(", ");

                String[] num = new String[cad.length];
                ArrayList<String> numero = new ArrayList<>();

                for (int i = 0; i < cad.length; i++) {
                    numero.add(String.valueOf(cad[i]));
                }

                switch (numero.get(0).toLowerCase().trim()) {
                    case "rectangulo":
                        for (int i = 0; i < numero.size(); i++) {
                            if (numero.get(i).startsWith("base")) {
                                String a = numero.get(i).trim();
                                String[] s = a.split(" = ");
                                baseCad = String.valueOf(s[1]);
                            } else if (numero.get(i).startsWith("altura")) {
                                String a = numero.get(i).trim();
                                String[] s = a.split(" = ");
                                alturaCad = String.valueOf(s[1]);
                            } else if (numero.get(i).startsWith("color")) {
                                String a = numero.get(i).trim();
                                String[] s = a.split(" = ");
                                color = String.valueOf(s[1]);
                            }
                        }
                        System.out.println("---------------- RECTANGULO ------------------------");
                        Rectangulo r3 = new Rectangulo(color, Float.valueOf(baseCad), Float.valueOf(alturaCad));
                        System.out.println("Área rectángulo: " + r3.calcularArea());
                        System.out.println("Perímetro rectángulo: " + r3.calcularPerimetro());
                        System.out.println("Color rectángulo: " + r3.getColor());
                        System.out.println("-----------------------------------------------------");
                        break;
                    case "circulo":
                        break;
                    case "cuadrado":
                        break;
                    case "triangulo":
                        break;
                    default:
                        break;
                }

                /*System.out.println("baseCad " + baseCad);
                System.out.println("alturaCad " + alturaCad);
                System.out.println("color " + color);*/
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(DesdeFicheros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
