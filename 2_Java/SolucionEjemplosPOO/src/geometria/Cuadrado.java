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
public class Cuadrado extends Rectangulo{
    
    public Cuadrado(){
        
    }
    
    public Cuadrado(float lado){
        super(lado, lado);
    }
    
    public Cuadrado(String color, float lado){
        super(color,lado, lado);
    }
}
