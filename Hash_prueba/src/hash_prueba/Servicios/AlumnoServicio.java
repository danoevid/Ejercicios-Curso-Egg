/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_prueba.Servicios;

import hash_prueba.Entidades.Alumno;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Usuario
 */
//Iterator<Map.Entry<String, Double>> iterator = listaDeProductos.entrySet().iterator();
//public void eliminarProducto(){
//        int seEncontro=0;
//        System.out.println("Ingrese el producto a eliminar: ");
//        String productoEliminar = scan.next();
//        Iterator<Map.Entry<String, Double>> iterator = listaDeProductos.entrySet().iterator();
//        while (iterator.hasNext()) {
//          Map.Entry<String,Double> entry = iterator.next();
//          if (entry.getKey().equalsIgnoreCase(productoEliminar)){
//         iterator.remove();
//        }
//        }
//
//    }


public class AlumnoServicio {
    private Scanner sc;
    private Set<Alumno>estudiantes;
    public AlumnoServicio(){
        this.sc = new Scanner(System.in);
        this.estudiantes = new HashSet();
    }
    public Alumno crear(){
        System.out.println("Ingrese nombre");
        String nombre = sc.next();
        System.out.println("Ingrese Apellido");
        String apellido = sc.next();
        System.out.println("Ingrese DNI");
        Integer dni = sc.nextInt();
        ArrayList<Integer>notas=new ArrayList();
        notas(notas);
        Alumno alumno = new Alumno(nombre,apellido,dni,notas);
        return alumno;
    }
     public ArrayList notas(ArrayList<Integer>notas){
        System.out.println("Ingrese sus tres notas");
        for (int i = 0; i <3; i++) {
             Integer nota = sc.nextInt();
             notas.add(nota);
        }
        return notas;
    }
     public void añadir(Alumno alumno){
         estudiantes.add(alumno);
     }
     public void mostrar(){
         for (Alumno estudiante : estudiantes) {
             System.out.println(estudiante);
         }
     }
             
     public void Proceso(){
         boolean t=false;
         System.out.println("Comienza el proceso de carga para los alumnos, una vez finalizado"
                 + "este procedimiento, no podra volver a cargar ningun alumno mas");
        do{
           Alumno alumnos = crear();
           añadir(alumnos);
           System.out.println("¿Desea agregar algun otro alumno?");
           System.out.println("Ingrese si o no");
           String op = sc.next();
           String min = op.toLowerCase();
           if(min.equals("no")){
                System.out.println("Carga finalizada");
                t=true;
            }else if(!min.equals("si")){
                do{
                    System.out.println("Ingreso mal la opcion");
                    System.out.println("Vuelva a intentarlo");
                    System.out.println("¿Desea agregar algun otro alumno?");
                    System.out.println("Ingrese si o no");
                    op = sc.next();
                    min = op.toLowerCase();
                }while(!min.equals("si"));
            }
        }while(!t);
        mostrar();
     }
      public double notaFinal(Alumno est){
        double promedio=0,suma=0;
        ArrayList<Integer>nota = est.getNotas();
        for (int i = 0; i <est.getNotas().size(); i++) {
            suma+=nota.get(i);
        }
        promedio=suma/3;
        return promedio;
    }
    public void volver(){
        
           System.out.println("Desea buscar otro alumno");
           System.out.println("Ingrese si o no");
           String op=sc.next();
           String min = op.toLowerCase();
           switch(min){
               case "si":
                   Buscar();
                   break;
               case "no":
                   System.out.println("Proceso de busqueda terminado");
                   break;
               default:
                   System.out.println("Opcion mal ingresada");
                   break;
           }
         
        // Buscar();
        
//         String nombre="";
//        System.out.println("Ingrese DNI del alumno, para calcular la nota");
//        Integer dni = sc.nextInt();
//        Iterator<Alumno>it=estudiantes.iterator();
//        while(it.hasNext()){
//            Alumno y=it.next();
//            if(Objects.equals(y.getDni(), dni)){
//                notaF=notaFinal(y);
//                t=true;
//                nombre=y.getNombre();
//                break;
//            }
//        }
         
              
         
     }
         
                 
    
   public void encontrado(Alumno a){
       DecimalFormat formateador = new DecimalFormat(".##");
       double notaF;
        notaF=notaFinal(a);
        System.out.println("La nota final de "+a.getNombre()+" es: "+formateador.format(notaF));
       
   }
     
   public void Buscar(){
       boolean t=false;
        System.out.println("Ingrese DNI del alumno, para calcular la nota");
        Integer dni = sc.nextInt();
        Iterator<Alumno>it=estudiantes.iterator();
        while(it.hasNext()){
            Alumno y=it.next();
            if(Objects.equals(y.getDni(), dni)){
               encontrado(y);
                t=true;
                break;   
            }
        }
        if(t==false){
            System.out.println("Alumno no encontrado");
            volverAbuscar();
        }else if(t==true){
           volver();
        }
       
   }
   public void volverAbuscar(){
       Buscar();
   }
}       
