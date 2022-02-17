/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_extra2_egg.Utilidades;

import colecciones_extra2_egg.Entidad.Cantante;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class comparador {
     public static Comparator<Cantante>compararCantante = new Comparator<Cantante>() {
        @Override
         public int compare(Cantante t, Cantante t1){
          return t.getNombre().compareTo(t1.getNombre());
       }
        
    };
}
