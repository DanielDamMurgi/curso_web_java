package pruebasjava;

import java.util.Random;

/**
 *
 * @author Formacion
 */
public class PruebasJava {
    
    static final float MI_PI = 3.1416f;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        contador();

        String letra = "b";
        letra = letra.toUpperCase();

        switch (letra) {
            case "A":
                System.out.println("Letra: " + letra);
                break;
            case "B":
                System.out.println("Letra: " + letra);
                break;
            case "C":
                System.out.println("Letra: " + letra);
                break;
            default:
                System.out.println("Ni A, ni B, ni C");
        }

        losMismosEjemplos();

    }

    static float calcularIva(float precio, float iva) {
        float result = precio + iva / 100 * precio;
        return result;
    }

    static float valorAleatorio() {
        Random r = new Random();
        return r.nextFloat();
    }

    static void losMismosEjemplos() {
        for (int i = 5; i > 0; i--) {
            System.out.println("El cuadrado de: " + i + " es: " + i * i);
        }

        System.out.println("IVA 10: " + calcularIva(10, 21));
        System.out.println("IVA 20: " + calcularIva(20, 21));
        System.out.println("IVA 30: " + calcularIva(30, 21));

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor aleatorio " + i + " : " + valorAleatorio());
        }
        
        System.out.println("PI = " + Math.PI);
        System.out.println("Mi PI = " + MI_PI);
    }
    
    static void contador(){
        int contador;
        contador = 0;

        while (contador < 19) {
            System.out.println("Contador vale: " + contador);
            contador = contador + 1;
            //contador += 1;
            //contador++;
        }

        if (contador < 10) {
            System.out.println("Menor que 10");
        } else if (contador == 10) {
            System.out.println("Igual que 10");
        } else if (contador < 20) {
            System.out.println("Menor que 20");
        } else {
            System.out.println("Mayor que 20");
        }
    }
} // FIN DE LA CLASE
