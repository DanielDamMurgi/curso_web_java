/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo;

/**
 *
 * @author Formacion
 */
public class Figura {
    //ATRIBUTOS
    private double area;
    private double perimetro;
    private String color;
    
    public Figura(){
        
    }
    
    public Figura(double area, double perimetro, String color){
        this.area= area;
        this.perimetro=perimetro;
        this.color=color;
    }
    
    //GETTERS Y SETTERS

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
