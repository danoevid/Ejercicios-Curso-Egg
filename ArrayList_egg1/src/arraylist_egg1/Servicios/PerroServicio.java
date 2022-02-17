/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist_egg1.Servicios;

import arraylist_egg1.Entidades.Perro;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PerroServicio {
    Scanner sc = new Scanner(System.in);
    public static Comparator<Perro>compararRaza = new Comparator<Perro>() {
        @Override
        public int compare(Perro t, Perro t1) {
           return t.getRaza().compareTo(t1.getRaza());
        }
    };
        
    
    private ArrayList<Perro>lista = new ArrayList();
    public Perro crearPerro(){
        System.out.println("Ingrese raza del perro");
        String raza = sc.next();
        String r = raza.toUpperCase();
        Perro perroRaza=new Perro(r);
        return perroRaza; 
    }
   public void añadir(Perro p){
       lista.add(p);
   }
   public void mostrar(){
       lista.sort(compararRaza);
       for (Perro perro : lista) {
           System.out.println(perro);
       }
   }
   public void crear(){
       boolean t=false;
       while(!t){
           Perro p = crearPerro();
           añadir(p);
           System.out.println("Desea seguir ingresando raza de perros, s-si n-no");
           char op=sc.next().charAt(0);
           char m= Character.toUpperCase(op);
           if(Character.compare(m,'N')==0){
               t=true;
           }
           
       }
       mostrar();
   }
   public void elimarRaza(){
       System.out.println("Ingrese raza que desea elimanar");
       String r=sc.next();
       String raz=r.toUpperCase();
       boolean t=false;
       for (int i = 0; i <lista.size(); i++) {
           Perro p=lista.get(i);
           if(p.getRaza().equals(raz)){
               lista.remove(i);
               t=true;
           }
       }
       if(t==true){
           System.out.println("Eliminación Exitosa");
       }else{
           System.out.println("Raza no encontrada, o mal tipiada");
       }
       System.out.println("LISTA DE RAZA");
       mostrar();
   }

}
