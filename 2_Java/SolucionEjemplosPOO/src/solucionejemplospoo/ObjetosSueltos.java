/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionejemplospoo;

import geometria.Circulo;
import geometria.Cuadrado;
import geometria.Rectangulo;
import geometria.Triangulo;

/**
 *
 * @author Formacion
 */
public class ObjetosSueltos {
    
    public static void calculosSueltos(){
        Rectangulo r1 = new Rectangulo("Red", 3, 6);
        System.out.println("Área rectángulo: " + r1.calcularArea());
        System.out.println("Perímetro rectángulo: " + r1.calcularPerimetro());
        System.out.println("Color rectángulo: " + r1.getColor());
        System.out.println("-----------------------------------------------------");

        float[] lados = {1, 4, 6};
        Triangulo t1 = new Triangulo("Azul", 3, 6, lados);
        System.out.println("Área triangulo: " + t1.calcularArea());
        System.out.println("Área triangulo: " + t1.calcularPerimetro());
        System.out.println("Color triangulo: " + t1.getColor());
        System.out.println("-----------------------------------------------------");

        Circulo c1 = new Circulo("Rojo", 6);
        System.out.println("Área círculo: " + c1.calcularArea());
        System.out.println("Perímetro circulo: " + c1.calcularPerimetro());
        System.out.println("Color círculo: " + c1.getColor());
        System.out.println("-----------------------------------------------------");
        
        Cuadrado cu1 = new Cuadrado("ROJOOOOOOOO",5);
        System.out.println("Área cuadrado: " + cu1.calcularArea());
        System.out.println("Perímetro cuadrado: " + cu1.calcularPerimetro());
        System.out.println("Color cuadrado: " + cu1.getColor());
        System.out.println("-----------------------------------------------------");
    }
    
}
