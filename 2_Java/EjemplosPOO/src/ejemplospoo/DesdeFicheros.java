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

    public static void guardarRectangulos() {

        Circulo cir = new Circulo(10, "verde");
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {   // Intentamos hacer cosas con ficheros
            fichero = new FileWriter("C:/figuras/rectangulo.txt");
            pw = new PrintWriter(fichero);
            pw.println(cir.toString());
            
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
            fichero = new File("C:/figuras/rectangulo.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String linea;
            linea = br.readLine();
            if (linea != null) {
                System.out.println(linea);
                String tipoFigura = linea.split(":")[0].trim().toLowerCase();
                String[] partesCampos;
                switch (tipoFigura) {
                    case "rectangulo":
                        Rectangulo rec = new Rectangulo(linea);
                        System.out.println("Area rectangulo: "
                                + rec.calcArea());
                        System.out.println("Perimetro rectangulo: "
                                + rec.calcPerimetro());
                        break;
                    case "circulo":
                        Circulo cir = new Circulo(linea);
                        System.out.println("Area circulo: "
                                + cir.calcArea());
                        System.out.println("Perimetro circulo: "
                                + cir.calcPerimetro());
                        break;
                }
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
