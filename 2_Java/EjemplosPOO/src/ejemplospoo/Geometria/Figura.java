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
public class Figura {
    
    protected String color;

    public Figura(String textoDes) {
        String[] partesTexto = textoDes.split(":");
        if (partesTexto.length == 1) {
            this.color = color;
        } 
        else if (partesTexto.length == 2) {
            String[] partesCampos = textoDes.split(":")[1].split(",");
            for (String parteCampo : partesCampos) {
                int posIgual = parteCampo.indexOf("=");
                String campo = parteCampo.substring(0, posIgual).trim().toLowerCase();
                String valor = parteCampo.substring(posIgual + 1).trim();
                switch (campo) {
                    case "color":
                        this.color = valor; // CAMBIAR color a PROTECTED
                        break;
                }
            }
        }
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
