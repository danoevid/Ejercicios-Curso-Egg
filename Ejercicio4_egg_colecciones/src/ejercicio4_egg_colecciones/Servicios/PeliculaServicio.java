
package ejercicio4_egg_colecciones.Servicios;

import ejercicio4_egg_colecciones.Entidades.Pelicula;
import ejercicio4_egg_colecciones.Utilidad.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


public class PeliculaServicio {
    
    private Scanner sc;
    private ArrayList<Pelicula>listaPeli;
    public PeliculaServicio(){
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.listaPeli = new ArrayList();
    }
    
    public void Iterador(){
        Iterator <Pelicula> it = listaPeli.iterator();
        while(it.hasNext()){
            Pelicula peli = it.next();
            System.out.println(peli);
            
        }
    }
    public Pelicula crear(){
        System.out.println("Ingrese titulo de la película");
        String titulo = sc.next();
        System.out.println("Ingrese autor de la película");
        String autor = sc.next();
        System.out.println("Ingrese duracion de la película");
        double hora =sc.nextDouble();
        Pelicula peli = new Pelicula(titulo,autor,hora);
        return peli;
    }
    public void añadir(Pelicula peli){
        listaPeli.add(peli);
    }
    public void ProcesoCarga(){
        boolean exit=false;
        System.out.println("Proceso de carga para peliculas");
        do{
            Pelicula peli = crear();
            añadir(peli);
            System.out.println("Desea seguir ingresando datos, 1 para si y 2 para no");
            short op = sc.nextShort();
            if(op==2){
                exit=true;
            }
        }while(!exit);
        mostrar();
        mayorUnaHora();
        MayorAmenorHora();
        ordenarTitulo();
        ordenarDirector();
    }
    public void mostrar(){
        for (Pelicula pelicula : listaPeli) {
            System.out.println(pelicula);
        }
    }
    public void mayorUnaHora(){
        System.out.println("----------");
        System.out.println("Películas cuya duracion es mas de una hora");
        IteradorMayor();
    }
     public void MayorAmenorHora(){
        System.out.println("----------");
        System.out.println("Orden de películas segun su duracion, de mayor a menor");
        Collections.sort(listaPeli,Comparador.compararHora);
         for (Pelicula peli : listaPeli) {
             System.out.println(peli);
         }
        
    }
     public void ordenarTitulo(){
         System.out.println("----------");
         System.out.println("Orden de películas segun su título");
         Collections.sort(listaPeli,Comparador.compararTitulo);
         for (Pelicula peli : listaPeli) {
             System.out.println(peli);
         }
     }
     public void ordenarDirector(){
          System.out.println("----------");
         System.out.println("Orden de películas segun su título");
         Collections.sort(listaPeli,Comparador.compararAutor);
         for (Pelicula peli : listaPeli) {
             System.out.println(peli);
         }
     }
      public void IteradorMayor(){
        Iterator <Pelicula> it = listaPeli.iterator();
        while(it.hasNext()){
            Pelicula peli = it.next();
            if(peli.getHora()>1){
                System.out.println(peli);
            }
            
            
        }
    }
}
