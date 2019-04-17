/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo;

import ejemplospoo.Geometria.Circulo;
import ejemplospoo.Geometria.Cuadrado;
import ejemplospoo.Geometria.Rectangulo;
import ejemplospoo.Geometria.Triangulo;

/**
 *
 * @author German
 */
public class ObjetosSueltos {
     
    public static void calculosSueltos() {
        Rectangulo rec = new Rectangulo(10, 5);
        //rec.setAltura(10);
        //rec.setBase(5);
        rec.setColor("Azul");
        System.out.println("Area rectangulo: " 
                + rec.calcArea());
        System.out.println("Perimetro rectangulo: " 
                + rec.calcPerimetro());
        
        float[] ladosTri = {2,3,5};
        Triangulo tri = new Triangulo(10, 5, ladosTri);
        // tri.setAltura(10);        // tri.setBase(5);
        System.out.println("Area Triangulo: " 
                + tri.calcArea());
        System.out.println("Perimetro Triangulo: " 
                + tri.calcPerimetro());
        
        Circulo cir = new Circulo(10);
        System.out.println("Area Circulo: " 
                + cir.calcArea());
        System.out.println("Perimetro Circulo: " 
                + cir.calcPerimetro());
        
        Cuadrado  cuad = new Cuadrado(12, "rojo");
        System.out.println("Area Cuadrado: " 
                + cuad.calcArea());
        System.out.println("Perimetro Cuadrado: " 
                + cuad.calcPerimetro()); 
    }
}
