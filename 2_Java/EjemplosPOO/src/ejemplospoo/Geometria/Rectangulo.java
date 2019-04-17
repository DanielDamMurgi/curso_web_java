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
public class Rectangulo extends FiguraConLados {

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }
    public Rectangulo(float base, float altura, String color) {
        super(base, altura, color);
    }
    public Rectangulo(String textoDeserializar) {
        super(textoDeserializar);
    }
    public float calcArea() {
        return this.base * this.altura;
    }
    public float calcPerimetro() {
        return 2 * base + 2 * altura;
    }
}
