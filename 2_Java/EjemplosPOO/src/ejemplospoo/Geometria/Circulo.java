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
public class Circulo extends Figura {
    
    private float radio;
    
    public Circulo (float radio) {
        super("blanco");
        this.radio = radio;
    }
    public Circulo (float radio, String color) {
        super(color);
        this.radio = radio;
    }
    public Circulo(String textoDes) {
        super("");
        String[] partesCampos = textoDes.split(":")[1].split(",");
        for (String parteCampo : partesCampos) {
            int posIgual = parteCampo.indexOf("=");
            String campo = parteCampo.substring(0, posIgual).trim().toLowerCase();
            String valor = parteCampo.substring(posIgual + 1).trim();
            switch (campo) {
                case "radio":
                    this.radio = Float.parseFloat(valor);
                    break;
                case "color":
                    this.color = valor; // CAMBIAR color a PROTECTED
                    break;
            }
        }
    }
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public float calcArea() {
        return (float)(Math.PI 
            * Math.pow(this.radio, 2));
    }
    public float calcPerimetro() {
        return 2 * (float) Math.PI * radio;
    }
    @Override
    public String toString() {
        return "Circulo: radio = " + this.radio
                + ", color = " + this.getColor();
    }
}
