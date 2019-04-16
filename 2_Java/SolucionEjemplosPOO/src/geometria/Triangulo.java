/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author Formacion
 */
public class Triangulo extends FigurasConLados{
    
    private float[] lados;
    
    public Triangulo(){
        
    }
    
    public Triangulo(float[] lados){
        this.lados = lados;
    }
    
    public Triangulo(String color, float base, float altura, float[] lados){
        super(color, base, altura);
        this.lados = lados;
    }

    public float[] getLados() {
        return lados;
    }

    public void setLados(float[] lados) {
        this.lados = lados;
    }
    
    public float calcularArea(){
        return (this.base * this.altura) / 2;
    }
    
    public float calcularPerimetro() {
        return lados[0] + lados[1] + lados[2];
    }
}
