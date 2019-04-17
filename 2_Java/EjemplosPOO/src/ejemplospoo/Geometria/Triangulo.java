/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo.Geometria;

/**
 *
 * @author German
 */
public class Triangulo extends FiguraConLados {
        
    private float[] lados;

    public Triangulo(float base, float altura, float[] lados) {
        super(base, altura);
        this.lados = lados;
    }
    public Triangulo(float base, float altura, float[] lados, String color) {
        super(base, altura, color);
        this.lados = lados;
    }    
    public Triangulo(String textoDeserializar) {
        super(textoDeserializar);
    }
    public float[] getLados() { return lados; }
    public void setLados(float[] lados) {
        this.lados = lados;
    }    
    public float calcArea() {
        return this.base * this.altura / 2;
    }
    public float calcPerimetro() {
        return lados[0] + lados[1] + lados[2];
    }
}
