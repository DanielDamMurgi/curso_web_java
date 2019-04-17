/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo.Geometria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author German
 */
public class LectorFiguras {

    public static void cargarFichero(String nomFich) {
        /*Figura fig;

        fig = new Figura("BLUE");
        System.out.println(fig.toString());

        Rectangulo rec;
        rec = new Rectangulo(2, 3);
        System.out.println(rec.toString());

        //POLIMORFISMO ------------------------------=(
        fig = rec;
        System.out.println(fig.toString());

        fig.setColor("blanco");
        System.out.println(rec.toString());*/
    }

    public static void coleccionesFiguras() {
        Figura[] figuras = {
            new Rectangulo(2, 3),
            new Circulo(5, "blanco"),
            new Triangulo("Tiangulo: base=5.5, altura=3.3, color=morado")
        };

        for (Figura fig : figuras) {
            System.out.println(fig.toString());
            System.out.println(" - Area: " + fig.calcArea());
        }

        System.out.println("---------------- ARRAYLIST -----------------");

        ArrayList<Figura> array = new ArrayList<>();
        array.add(new Rectangulo(4, 3, "verde"));
        array.add(new Circulo(5, "blanco"));
        array.add(new Triangulo("Tiangulo: base=5.5, altura=3.3, color=morado"));

        for (Figura fig : array) {
            System.out.println(fig.toString());
            System.out.println(" - Area: " + fig.calcArea());
        }

        IImprimible[] objImp = {
            new Circulo(5),
            new Cuadrado(6) 
            //new Triangulo(5,5,null)
        };

        for (IImprimible imp : objImp) {
            imp.imprimir();
        }
        
        System.out.println("-------------------------------------------");
        
        float[] lados = {1,2,3};
        IMostrable [] objMos ={
            new Triangulo(3,3, lados),
            new Cuadrado(3)   
        };
        
        for (IMostrable mos : objMos) {
            mos.mostrar();
        }
        
        System.out.println("-------------------------------------------");
        
        Cuadrado cuadrado = new Cuadrado(5, "negro");
        Rectangulo cuadR = cuadrado;
        FiguraConLados cuadFL = cuadrado;
        Figura cuadF = cuadrado;
        cuadF.setColor("gris");
        IImprimible cuadI = cuadrado;
        cuadI.imprimir();
        IMostrable cuadM = cuadrado;
        cuadM.mostrar();
        
        System.out.println("-------------------------------------------");
        
        array.add(cuadrado);
        array.add(cuadrado);
        
        Set<Figura> setFig = new HashSet<>();
        setFig.add(new Triangulo(4,5,null));
        setFig.addAll(array);
        
        System.out.println(">> ArrayList");
        for (Figura fig : array) {
            System.out.println(fig.toString());
        }
        
        System.out.println(">> SET");
        for (Figura fig : setFig) {
            System.out.println(fig.toString());
        }
    }
}
