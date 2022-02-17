/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_extra3_egg.Entidades;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Libro implements Comparable<Libro>{
    private String autor, titulo;
    private int ejemplo, prestado;
    public Libro() {
    }

    public Libro(String titulo, String autor, int ejemplo, int prestado) {
        this.autor = autor;
        this.titulo = titulo;
        this.ejemplo = ejemplo;
        this.prestado = prestado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEjemplo() {
        return ejemplo;
    }

    public void setEjemplo(int ejemplo) {
        this.ejemplo = ejemplo;
    }

    public int getPrestado() {
        return prestado;
    }

    public void setPrestado(int prestado) {
        this.prestado = prestado;
    }
    
    
    
//     public int compareTo(Libro t) {
//        return titulo.compareTo(t.getTitulo());
//    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", titulo=" + titulo + ", ejemplo=" + ejemplo + ", prestado=" + prestado + '}';
    }

    @Override
    public int compareTo(Libro t) {
       return titulo.compareTo(t.getTitulo());
    }
    
}
