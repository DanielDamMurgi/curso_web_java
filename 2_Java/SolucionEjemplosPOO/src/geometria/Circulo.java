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
public class Circulo extends Figura {

    private float radio;

    public Circulo() {

    }

    public Circulo(String color, float radio) {
        super(color);
        this.radio = radio;
    }

    /**
     * Get the value of radio
     *
     * @return the value of radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * Set the value of radio
     *
     * @param radio new value of radio
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcularArea() {
        return (float) (Math.PI * (Math.pow(radio, 2)));
    }

    public float calcularPerimetro() {
        return (float) (2 * Math.PI * radio);
    }
}
