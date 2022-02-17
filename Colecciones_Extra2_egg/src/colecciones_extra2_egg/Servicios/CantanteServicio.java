
package colecciones_extra2_egg.Servicios;

import colecciones_extra2_egg.Entidad.Cantante;
import colecciones_extra2_egg.Utilidades.comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class CantanteServicio {
    private ArrayList<Cantante>cantantes;
    private Scanner sc;
    public CantanteServicio(){
        this.sc = new Scanner(System.in);//.useDelimiter("/n");
        this.cantantes = new ArrayList();
    }
    public Cantante crear(){
        System.out.println("ingrese nombre del cantante");
        String nombre = sc.next();
        System.out.println("Nombre del disco mas vendio");
        String disco = sc.next();
        return new Cantante(nombre,disco);
    }
    public void añadir(Cantante c){
        cantantes.add(c);
    }
    public void mostrar(){
        ordenar();
        for (Cantante cantante : cantantes) {
            System.out.println(cantante);
        }
    }
    public void ordenar(){
        Collections.sort(cantantes,comparador.compararCantante);
    }
    public void eliminar(){
        Iterator<Cantante>it = cantantes.iterator();
        System.out.println("Ingrese cantante a eliiminar");
        String c = sc.next();
        while(it.hasNext()){
            Cantante cant = it.next();
            if(cant.getNombre().equals(c)){
                it.remove();
            }
        }
    }
    public short menu(){
        System.out.println("1- Agregar nuevo cantante");
        System.out.println("2- Eliminar nuevo cantante");
        System.out.println("3- Mostrar");
        System.out.println("4- Salir");
        short i = sc.nextShort();
        switch(i){
            case 1:
                   Cantante c = crear();
                   añadir(c);
                   break;
            case 2:
                   eliminar();
                   break;
            case 3: 
                   mostrar();
                   break;
            case 4:
                   System.out.println("Proceso finalizado");
                   break;
            default: 
                   System.out.println("Opcion mal ingresada");
                   break;
        }
        return i;
    }
    public void cargarCinco(){
        for (int i = 0; i < 5; i++) {
            Cantante cant = crear();
            añadir(cant);
            
        }
    }
    public void proceso(){
        cargarCinco();
        short i;
        do{
            i = menu();
        }while(i!=4);
        
    }
}
