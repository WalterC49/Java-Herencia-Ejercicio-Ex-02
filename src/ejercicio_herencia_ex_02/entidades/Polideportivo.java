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
public class Polideportivo extends Edificio{
    
    private String nombre;
    private Boolean techado;
    
    public Polideportivo(){
    }
    
    public Polideportivo(String nombre, Boolean techado, Float ancho, Float alto, Float largo){
    super(ancho, alto, largo);
    this.nombre=nombre;
    this.techado=techado;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Boolean getTechado(){
        return techado;
    }
    
    @Override
    public float CalcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public float CalcularVolumen() {
        return ancho*alto*largo;
    }
    
}
