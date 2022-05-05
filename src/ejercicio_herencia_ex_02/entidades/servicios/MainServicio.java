/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_herencia_ex_02.entidades.servicios;

import ejercicio_herencia_ex_02.entidades.Edificio;
import ejercicio_herencia_ex_02.entidades.EdificioDeOficinas;
import ejercicio_herencia_ex_02.entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class MainServicio {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static ArrayList<Edificio> LlenarLista(ArrayList<Edificio> edificios){
        
        for(int i=0;i<2;i++){
            edificios.add(PolideportivoServicio.CrearPolideportivo());
        }
        
        for(int i=0;i<2;i++){
            edificios.add(EdificioDeOficinasServicio.CrearEdificioDeOficinas());
        }
        
        return edificios;
    }
    
    public static void MostrarLista(ArrayList<Edificio> edificios){
        System.out.println("\nInformación de los edificios:");
        for (Edificio edificio : edificios) {
            if(edificio instanceof Polideportivo){
                Polideportivo poli = (Polideportivo) edificio;
                PolideportivoServicio.MostrarPolideportivo(poli);
            }
            
            if(edificio instanceof EdificioDeOficinas){
                EdificioDeOficinas ediOfi = (EdificioDeOficinas) edificio;
                EdificioDeOficinasServicio.MostrarEdificioDeOficinas(ediOfi);
            }
            
        }
    }
}
