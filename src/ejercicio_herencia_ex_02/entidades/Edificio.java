/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_herencia_ex_02.entidades;

/**
 *
 * @author Walter
 */
public abstract class Edificio {
    protected Float ancho;
    protected Float alto;
    protected Float largo;

    public Edificio(){
    }
    
    public Edificio(Float ancho, Float alto, Float largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    public abstract float CalcularSuperficie();
    public abstract float CalcularVolumen();
    
}
