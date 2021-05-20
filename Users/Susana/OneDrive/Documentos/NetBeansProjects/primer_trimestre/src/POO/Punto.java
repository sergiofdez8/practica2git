/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author Susana
 */
public class Punto {
    //atributos 
    private int x;
    private int y;
    
//Constructores
    //constructor 
    public Punto(){
        this.x=0;
        this.y=0;
    }
    //constructor por parametros
    public Punto(int x, int y){
        this.x=x;//this significa el atributo y x a secas el parametro que el introducimos
        this.y=y;
    }
    
//metodos getters and setters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
//metodos    
    
    public void moverHorizontal(int desplazax){//public void o public int
        this.x = this.x+desplazax;
        
}
    
    
    
    
    
    
    
}
