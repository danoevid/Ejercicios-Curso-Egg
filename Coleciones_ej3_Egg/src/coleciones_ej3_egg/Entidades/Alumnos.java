/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleciones_ej3_egg.Entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class Alumnos {
    private ArrayList<Integer>notas;
    private String nombre;
    public Alumnos(){
        
    }
    public Alumnos(String nombre,ArrayList<Integer> notas) {
        this.notas = notas;
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "notas=" + notas + ", nombre=" + nombre + '}';
    }
    

    

   
            
}
