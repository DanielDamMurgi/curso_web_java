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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Formacion
 */
public class DesdeFicheros {

    public static void guardarRectangulos() {
        Rectangulo rec = new Rectangulo(10, 5);
        FileWriter fichero = null;
        PrintWriter pw = null;

        try { //Intentamos hacer cosas con ficheros 
            fichero = new FileWriter("C:/figuras/rectangulo.txt");
            pw = new PrintWriter(fichero);
            pw.println("Rectangulo: base = " + rec.getBase() + ", altura = " + rec.getAltura() + ", color = " + rec.getColor());
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
            String aux = "";

            String cadena = br.readLine();

            if (cadena != null) {
                System.out.println(cadena);
                
                String[] cad = cadena.split(",");
                
                for (int i = 0; i < cad.length; i++) {
                    System.out.println(cad[i]);
                    /*for (int j = 0; j < cad.length; j++) {
                        for (int k = 0; k < cad[j].length(); k++) {
                            aux += cad[j].charAt(k);
                        }
                    }*/
                    
                }
                System.out.println("-----> " + aux);
                /*for (int i = 0; i < cad.length; i++) {
                    String[] cad2 = cad[i].split("=");
                    System.out.println(cad2[i]);
                }*/
                System.out.println("");
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
