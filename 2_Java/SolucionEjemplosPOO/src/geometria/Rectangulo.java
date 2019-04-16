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
public class Rectangulo extends FigurasConLados {
    
    //CONSTRUCTORES -----------------------------------------
    public Rectangulo(){
        
    }
    
    public Rectangulo(float base, float altura){
        super(base, altura);
    }
    
    public Rectangulo(String color, float base, float altura){
        super(color, base, altura);
    }

    public float calcularArea() {
        return this.base * this.altura;
    }

    public float calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }

}
