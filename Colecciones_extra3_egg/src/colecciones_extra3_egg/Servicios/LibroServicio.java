/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_extra3_egg.Servicios;

import colecciones_extra3_egg.Entidades.Libro;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class LibroServicio {
    private TreeSet<Libro>listaLibro;
    private Scanner sc;
    public LibroServicio(){
        this.listaLibro = new TreeSet<>();
        this.sc = new Scanner(System.in);//.useDelimiter("/n");
    }
    public Libro crearLibro(){
        
        System.out.println("Ingrese título del libro");
        String titulo = sc.next();
        System.out.println("Ingrese autor del libro");
        String autor = sc.next();
        System.out.println("Ingrese cantidad de ejemplos disponibles");
        int dis = sc.nextInt();
        int pres =0;
        return new Libro(titulo,autor,dis,pres);
        
    }
    public void añadir(Libro libro){
        listaLibro.add(libro);
    }
    public Libro buscarLibro(){
        Iterator<Libro>it = listaLibro.iterator();
        Libro libro = new Libro();
        System.out.println("Ingrese libro que desea buscar");
        String nombre = sc.next();
        while(it.hasNext()){
            libro = it.next();
            if(libro.getTitulo().equals(nombre)){
                System.out.println("El libro se encontro");
                System.out.println("Título: "+libro.getTitulo()+" Autor: "+libro.getAutor());
                if(libro.getEjemplo()>0){
                        System.out.println("El libro se encuentra disponible: "+libro.getEjemplo()+" ejemplos");  
                }else if(libro.getEjemplo()==0){
                        System.out.println("El libro no se encuentra disponible");
                }
                    
              break;   
            }
        }
        return libro;
   }
    public void mostrar(){
        for (Libro libro : listaLibro) {
            System.out.println(libro);
        }
    }
    public void Disponibles(){
        Iterator<Libro>it = listaLibro.iterator();
        while(it.hasNext()){
            Libro libro = it.next();
            if(libro.getEjemplo()>0){
                System.out.println(libro);
            }
            
            
        }
    }
    public void Prestamo(Libro libro){
         System.out.println("¿Seguro que desea prestar el libro?");
         System.out.println("1-si 2-no");
         short i=sc.nextShort();
         if(i==1){
             int pres = libro.getPrestado()+1;
             int dis = libro.getEjemplo()-1;
             libro.setPrestado(pres);
             libro.setEjemplo(dis);
             System.out.println("Libro Prestado");
             System.out.println("Cantidad disponible actual: "+libro.getEjemplo()+" ejemplos");
         }else if (i==2){
             System.out.println("Salida exitosa");
         }else{
             System.out.println("Error al ingresar número");
         }
             
         
       
                    
   }
    public void devolucion(Libro libro){
        System.out.println("¿Seguro que desea devolver el libro?");
        System.out.println("1-si 2-no");
        short i=sc.nextShort();
        int disp = libro.getEjemplo();
        int pres = libro.getPrestado();
        if(i==1){
            disp+=1;
            pres-=1;
        }else if(i==2){
            System.out.println("Salida exitosa");
        }else{
            System.out.println("Error al ingresar número");
        }
        libro.setEjemplo(disp);
        libro.setPrestado(pres);
        
            
        
        
    }
    public void menu(){
        boolean t = false;
        System.out.println("1- Cargar libro");
        System.out.println("2- Prestar libro");
        System.out.println("3- Devolver libro");
        System.out.println("4- Buscar libro");
        System.out.println("5- Mostrar lista de libros");
        System.out.println("6- Mostrar lista de libros disponibles");
        System.out.println("7- Salir");
        do{
            System.out.println("Ingrese opcion del menú");
          short op = sc.nextShort();
          switch(op){
              case 1:
                  Libro libro = crearLibro();
                  añadir(libro);
                  break;
              case 2:
                  Libro l = buscarLibro();
                  Prestamo(l);
                  break;
              case 3:
                  Libro lib = buscarLibro();
                  devolucion(lib);
                  break;
              case 4:
                  Libro libr = buscarLibro();
                  break;
              case 5:
                  mostrar();
                  break;
              case 6:
                  Disponibles();
                  break;      
              case 7:
                  t=true;
                  break; 
              default:
                  System.out.println("Error al ingresar número del menú");
                  break;
          }
        }while(!t);
    }
   public void proceso(){
       menu();
        
    }
}
    

