/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_herencia_ex_02.entidades.servicios;

import ejercicio_herencia_ex_02.entidades.Polideportivo;

/**
 *
 * @author Walter
 */
public class PolideportivoServicio {
    
    public static Polideportivo CrearPolideportivo(){
        System.out.println("\nPolideportivo:");
        
        System.out.print("Ingrese el nombre del polideportivo: ");
        String nombre=MainServicio.leer.next();
        
        boolean techado= false;
        boolean continuar=false;
        do {            
            System.out.print("¿El polideportivo está techado?(s/n) ");
            switch (MainServicio.leer.next()) {
                case "s":
                    techado=true;
                    break;
                case "n":
                    break;
                default:
                    System.out.println("Opción no valida.");
                    continuar=true;
            }
        } while (continuar);
        
        System.out.print("Ingrese el ancho del polideportivo: ");
        float ancho=Float.parseFloat(MainServicio.leer.next());
        
        System.out.print("Ingrese el alto del polideportivo: ");
        float alto=Float.parseFloat(MainServicio.leer.next());

        System.out.print("Ingrese el largo del polideportivo: ");
        float largo=Float.parseFloat(MainServicio.leer.next());
        
        return new Polideportivo(nombre, techado, ancho, alto, largo);
    }
    
    public static void MostrarPolideportivo(Polideportivo poli){
        System.out.println("\nPolideportivo: "+poli.getNombre());
        System.out.println("Superficie: "+String.format("%.2f", poli.CalcularSuperficie())+"m^2");
        System.out.println("Volumen: "+String.format("%.2f", poli.CalcularVolumen())+"m^3");
        System.out.println("Techado o abierto: "+ ((poli.getTechado())?"Techado":"Abierto") );
    }
    
}
