/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleciones_ej3_egg.Servicios;

import coleciones_ej3_egg.Entidades.Alumnos;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlumnosServicios {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Integer>nota = new ArrayList();
    private ArrayList<Alumnos>listaAlumno = new ArrayList();
    public Alumnos crear(){
        System.out.println("Ingrese alumno");
        String nombre=sc.next();
        ArrayList<Integer>notas=notas();
        Alumnos alum = new Alumnos(nombre,notas);
       return alum; 
        
    }
    public ArrayList notas(){
        ArrayList<Integer>alumno=new ArrayList();
        System.out.println("Ingrese sus tres notas");
        for (int i = 0; i <3; i++) {
             Integer nota = sc.nextInt();
             alumno.add(nota);
        }
        return alumno;
    }
    public void añadir(Alumnos estudiante){
      listaAlumno.add(estudiante);
    }
    public void mostrar(){
        for (Alumnos al : listaAlumno) {
            System.out.println(al);
        }
    }
    public void Proceso(){
        boolean t=false;
        do{
           Alumnos alumnos = crear();
           añadir(alumnos);
           System.out.println("¿Desea agregar algun otro alumno?");
           System.out.println("Ingrese si o no");
           String op = sc.next();
           if(op.equals("no")){
                System.out.println("Carga finalizada");
                t=true;
            }
        }while(!t);
        mostrar();
            
    }
    public double notaFinal(Alumnos est){
        double promedio=0,suma=0;
        ArrayList<Integer>nota = est.getNotas();
        for (int i = 0; i <est.getNotas().size(); i++) {
            suma+=nota.get(i);
        }
        promedio=suma/3;
        return promedio;
    }
    public void calcularNota(){
        /*
            int index = sc.nextInt();
            Alumnos alu = listaAlumno.get(index);
            double nota = notaFinal(alu);
            System.out.println("La nota final es: "+nota);
        */
         double notaF=0;
         boolean t=false;
        System.out.println("Ingrese nombre del alumno a calcular nota");
        String nombre = sc.next();
        for (int i = 0; i <listaAlumno.size(); i++) {
            Alumnos al = listaAlumno.get(i);
            if(al.getNombre().equals(nombre)){
                notaF=notaFinal(al);
                t=true;
                break;
            }       
        }
        if(t==true){
                System.out.println("La nota final de "+nombre+" es: "+notaF);
        }else{
                System.out.println("EL alumno no fue encontrado");
        }
    }
            
            
   
    }
            

