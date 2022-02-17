/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_egg_colecciones.Entidades;

/**
 *
 * @author Usuario
 */
public class Pelicula {
    private String titulo,autor;
    private Double hora;

    public Pelicula() {
    }
    

    public Pelicula(String titulo, String autor, Double hora) {
        this.titulo = titulo;
        this.autor = autor;
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getHora() {
        return hora;
    }

    public void setHora(Double hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", autor=" + autor + ", horas=" + hora +"hs." + '}';
    }
    
    
}
