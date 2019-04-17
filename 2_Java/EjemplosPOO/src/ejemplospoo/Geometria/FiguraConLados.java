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
public class FiguraConLados extends Figura {

    protected float altura;
    protected float base;

    public FiguraConLados(float altura, float base) {
        super("blanco");
        this.altura = altura;
        this.base = base;
    }

    public FiguraConLados(float altura, float base, String color) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public FiguraConLados(String textoDeserializar) {
        super("");
        String[] partesCampos = textoDeserializar.split(":")[1].split(",");
        for (String parteCampo : partesCampos) {
            int posIgual = parteCampo.indexOf("=");
            String campo = parteCampo.substring(0, posIgual).trim().toLowerCase();
            String valor = parteCampo.substring(posIgual + 1).trim();
            switch (campo) {
                case "base":
                    this.base = Float.parseFloat(valor);
                    break;
                case "altura":
                    this.altura = Float.parseFloat(valor);
                    break;
                case "color":
                    this.color = valor; // CAMBIAR color a PROTECTED
                    break;
            }
        }
    }
    @Override
    public String toString() {
        return "Rectangulo: base = " + this.getBase()
                + ", altura = " + this.getAltura()
                + ", color = " + this.getColor();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

}
