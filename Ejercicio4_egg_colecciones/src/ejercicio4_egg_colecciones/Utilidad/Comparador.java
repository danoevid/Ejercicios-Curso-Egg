/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_egg_colecciones.Utilidad;

import ejercicio4_egg_colecciones.Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Comparador {
     public static Comparator<Pelicula>compararTitulo = new Comparator<Pelicula>() {
        @Override
         public int compare(Pelicula t, Pelicula t1){
          return t.getTitulo().compareTo(t1.getTitulo());
       }
        
    };
      public static Comparator<Pelicula>compararHora = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getHora().compareTo(t1.getHora());
        }
        
    };
       public static Comparator<Pelicula>compararAutor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getAutor().compareTo(t1.getAutor());
        }
        
    };
}
