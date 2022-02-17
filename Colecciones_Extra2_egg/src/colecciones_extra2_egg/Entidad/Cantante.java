
package colecciones_extra2_egg.Entidad;

import java.util.Objects;


public class Cantante {
    private String nombre,disco;
    public Cantante(){
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.disco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cantante other = (Cantante) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public Cantante(String nombre, String disco) {
        this.nombre = nombre;
        this.disco = disco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "Cantante{" + "nombre=" + nombre + ", disco=" + disco + '}';
    }
    
}
