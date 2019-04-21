/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo;

import ejemplospoo.Geometria.*;
import java.io.*;

/**
 *
 * @author German
 */
public class DesdeFicheros {

    private static final String RUTA_FICHERO = "C:\\Users\\Equipo\\Documents\\pruebaFicheros\\figura.txt";

    public static void guardarRectangulos() {

        Circulo cir = new Circulo(10, "verde");
        Rectangulo c1 = new Rectangulo(5, 4);
        float[] lados = {2, 5, 6};
        Triangulo tri = new Triangulo(4, 6, lados);
        Cuadrado cua = new Cuadrado(6);

        FileWriter fichero = null;
        PrintWriter pw = null;

        try {   // Intentamos hacer cosas con ficheros
            fichero = new FileWriter(RUTA_FICHERO);
            pw = new PrintWriter(fichero);
            pw.println(cir.toString());
            pw.println(c1.toString());
            pw.println(tri.toString());
            pw.println(cua.toString());
            pw.println(c1.toString());

        } catch (Exception ex) {    // Si ocurre algún error, 
            // catch() captura la excepción, con la info en ex.
            ex.printStackTrace();
        } finally {
// Lo ejecuta siempre, tanto si ha habido error como si no       
            try {   // Anidamos try-catch dentro del finally
                if (fichero != null) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void leerRectangulo() {
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fichero = new File(RUTA_FICHERO);
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String linea;
            linea = br.readLine();

            while (linea != null) {

                System.out.println(linea);
                String tipoFigura = linea.split(":")[0].trim().toLowerCase();
                switch (tipoFigura) {
                    case "rectangulo":
                        Rectangulo rec = new Rectangulo(linea);
                        System.out.println("Area rectangulo: " + rec.calcArea());
                        System.out.println("Perimetro rectangulo: " + rec.calcPerimetro() + "\n");
                        break;
                    case "circulo":
                        Circulo cir = new Circulo(linea);
                        System.out.println("Area circulo: " + cir.calcArea());
                        System.out.println("Perimetro circulo: " + cir.calcPerimetro() + "\n");
                        break;
                    case "cuadrado":
                        Cuadrado cua = new Cuadrado(linea);
                        System.out.println("Area cuadrado: " + cua.calcArea());
                        System.out.println("Perimetro cuadrado: " + cua.calcPerimetro() + "\n");
                        break;
                    case "triangulo":
                        Triangulo tri = new Triangulo(linea);
                        System.out.println("Area triangulo: " + tri.calcArea());
                    //System.out.println("Perimetro triangulo" + tri.calcPerimetro() + "\n");
                    default:
                        break;

                }

                linea = br.readLine();

            }

            Rectangulo rec = new Rectangulo(0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
