package ejemplospoo.Geometria;

/**
 *
 * @author German
 */
public class Cuadrado extends Rectangulo implements IImprimible, IMostrable{
        
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

    @Override
    public void imprimir() {
        System.out.println("Cuadrado.imprimir(): " + this.toString());
    }

    @Override
    public void mostrar() {
        System.out.println("Cuadrado.imprimir(): " + this.toString());
    }
}
