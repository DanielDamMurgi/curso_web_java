/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospoo;

import geometria.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Formacion
 */
public class EjemplosPOO {
    //ATRIBUTOS
    private static int opFigura;
    private static double dato1, dato2, dato3;
    private static String color;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        Rectangulo r;

        menuFigura();
        opFigura = teclado.nextInt();

        switch (opFigura) {
            case 1:
                System.out.print("Inserta la base: ");
                dato1 = teclado.nextDouble();
                System.out.print("Inserta la altura: ");
                dato2 = teclado.nextDouble();
                teclado.nextLine();
                System.out.print("Inserta el color: ");
                color = teclado.nextLine();
                
                
                r = new Rectangulo(dato1,dato2);
                r = new Rectangulo(r.calcularArea(), r.calcularPerimetro(), color);
                
                System.out.println("---------------------------------------");
                System.out.println("Color: " + r.getColor());
                System.out.println("Área: " + r.getArea());
                System.out.println("Perimetro: " + r.getPerimetro());
                System.out.println("---------------------------------------");
                
                break;
            default:
                System.out.println("No existe la opción");
        }
    }

    private static void menuFigura() {
        System.out.println("1 - RECTANGULO");
        System.out.println("2 - PERIMETRO");
    }
    
    private static void calcularRectangulo(){
        
    }

}
