/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_herencia_ex_02.entidades.servicios;

import ejercicio_herencia_ex_02.entidades.EdificioDeOficinas;

/**
 *
 * @author Walter
 */
public class EdificioDeOficinasServicio {
    
    public static EdificioDeOficinas CrearEdificioDeOficinas(){
        System.out.println("\nEdificio de oficinas:");
        
        System.out.print("Ingrese el Nº de oficinas del edificio: ");
        int numO=MainServicio.leer.nextInt();
        
        System.out.print("Ingrese el Nº de personas por oficina: ");
        int cantP=MainServicio.leer.nextInt();
        
        System.out.print("Ingrese el Nº de pisos del edificio: ");
        int pisos=MainServicio.leer.nextInt();
        
        System.out.print("Ingrese el ancho del edificio: ");
        float ancho=Float.parseFloat(MainServicio.leer.next());
        
        System.out.print("Ingrese el alto del edificio: ");
        float alto=Float.parseFloat(MainServicio.leer.next());
        
        System.out.print("Ingrese el largo del edificio: ");
        float largo=Float.parseFloat(MainServicio.leer.next());
        
        return new EdificioDeOficinas(numO, cantP, pisos, ancho, alto, largo);
    }
    
    public static void MostrarEdificioDeOficinas(EdificioDeOficinas ediOfi){
        System.out.println("\nEdificio de oficinas:");
        System.out.println("Superficie: "+String.format("%.2f", ediOfi.CalcularSuperficie())+"m^2");
        System.out.println("Volumen: "+String.format("%.2f", ediOfi.CalcularVolumen())+"m^3");
        ediOfi.cantPersonas();
    }
}
