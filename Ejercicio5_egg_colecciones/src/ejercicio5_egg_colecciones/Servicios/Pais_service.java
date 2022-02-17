/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_egg_colecciones.Servicios;

import ejercicio5_egg_colecciones.Entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Pais_service {
    private TreeSet<Pais>Paises;
    private Scanner sc;
    public Pais_service(){
        this.sc = new Scanner(System.in);
        this.Paises = new TreeSet();
    }
    public Pais crear(){
        System.out.println("Igrese pais que desa agregar");
        String p = sc.next();
        String nombre = Validar(p);
        return new Pais(nombre);
    }
    public void añadir(Pais pais){
        Paises.add(pais);
    }
    public void mostrar(){
        Iterator<Pais> it = Paises.iterator();
        while(it.hasNext()){
          Pais pai = it.next();
            System.out.println(pai);
        }
    }
    
    public void eliminar(){
        Iterator<Pais> it = Paises.iterator();
        boolean t = false;
        System.out.println("Ingrese Pais que desea eliminar");
        String p = sc.next();
        while(it.hasNext()){
            Pais pai = it.next();
            if(pai.getPais().equals(p)){
                it.remove();
                System.out.println("Eliminación Exitosa");
            }
        }
        
        mostrar();
    }
    public String  Validar(String pais){
        Iterator<Pais> it = Paises.iterator();
        boolean t = false;
        String destino = "";
        while(it.hasNext()){
          Pais pai = it.next();
          if(pai.getPais().equals(pais)){
              do{
                  System.out.println("Pais ya ingresado, intente con otro destino");
                  String nombre = sc.next();
                  if(!pai.getPais().equals(nombre)){
                      t=true;
                      destino = nombre;
                  }
              }while(!t);
          }  
          
        }
        return destino;
    }
   
    public void ProcesoCarga(){
        boolean exit = false;
        do{
            Pais pais = crear();
            añadir(pais);
            System.out.println("Desea agregar otro pais, 1 -si 2-no");
            int i = sc.nextInt();
            if(i==2){
                exit=true;
                System.out.println("Fin proceso de carga");
            }
        }while(!exit);
        mostrar();
        eliminar();
        
    }
}
