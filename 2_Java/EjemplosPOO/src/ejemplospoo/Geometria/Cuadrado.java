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
public class Cuadrado extends Rectangulo {
        
    public Cuadrado(float lado) {
        super(lado, lado);
    }
    public Cuadrado(float lado, String color) {
        super(lado, lado, color);
    }
    public Cuadrado(String textoDes) {
        super(0,0,"");
        String[] partesCampos = textoDes.split(":")[1].split(",");
        for (String parteCampo : partesCampos) {
            int posIgual = parteCampo.indexOf("=");
            String campo = parteCampo.substring(0, posIgual).trim().toLowerCase();
            String valor = parteCampo.substring(posIgual + 1).trim();
            switch (campo) {
                case "lado":
                    this.base = Float.parseFloat(valor);
                    this.altura = Float.parseFloat(valor);
                    break;
                case "color":
                    this.color = valor; // CAMBIAR color a PROTECTED
                    break;
            }
        }
    }
   /* public float calcArea() {
        return this.base * this.base;
    }*/
    @Override
    public String toString() {
        return "Cuadrado: lado = " + this.base
                + ", color = " + this.getColor();
    }
}
