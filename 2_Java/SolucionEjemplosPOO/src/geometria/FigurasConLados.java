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
public class FigurasConLados extends Figura {
    //ATRIBUTOS ----------------------------
    protected float base;
    protected float altura;
    
    //CONSTRUCTORES ------------------------
    public FigurasConLados(){
        
    }
    
    /*public FigurasConLados(String color){
        super(color);
    }*/
    
    public FigurasConLados(float base, float altura){
        super("blanco");
        this.base = base;
        this.altura = altura;
    }
    
    public FigurasConLados(String color, float base, float altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    public FigurasConLados(String textoDeserializar){
        super();
        
    }

    //GETTERS Y SETTERS ------------------------------------
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString(){
        return "Rectangulo, base = " + this.getBase() + ", altura = " + this.getAltura() + ", color = " + this.getColor();
    }
    
}
