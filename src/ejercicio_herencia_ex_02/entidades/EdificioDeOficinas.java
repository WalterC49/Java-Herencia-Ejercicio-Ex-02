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
public class EdificioDeOficinas extends Edificio{
    private Integer numOficinas;
    private Integer cantPersonasPorOficina;
    private Integer numPisos;
    
    public EdificioDeOficinas(){
    }
    
    public EdificioDeOficinas(Integer numOficinas, Integer cantPersonasPorOficina, Integer numPisos, Float ancho, Float alto, Float largo){
    super(ancho,alto,largo);
    this.numOficinas=numOficinas;
    this.cantPersonasPorOficina=cantPersonasPorOficina;
    this.numPisos=numPisos;
    }

    @Override
    public float CalcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public float CalcularVolumen() {
        return ancho*alto*largo;
    }
    
    public void cantPersonas(){
        System.out.println("Personas por piso: "+cantPersonasPorOficina);
        
        if(numOficinas>=numPisos){
            System.out.println("Personas en todo el edificio: "+cantPersonasPorOficina*numPisos);
        }else{
            System.out.println("Personas en todo el edificio: "+cantPersonasPorOficina*numOficinas);
        }
    }
    
}
