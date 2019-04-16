/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import ejemplospoo.Figura;

/**
 *
 * @author Formacion
 */
public class Rectangulo extends Figura {
    //ATRIBUTOS
    private double base, altura;
    
    //CONSTRUCTORES
    public Rectangulo(){
        super();
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo(double area, double perimetro, String color){
        super(area, perimetro, color);
    }
    
    //GETTERS Y SETTERS

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    //METODOS
    public double calcularArea(){
        double area = base * altura;
        return area;
    }
    
    public double calcularPerimetro(){
        double perimetro = (2*base) + (2*altura);
        return perimetro;
    }
}
 