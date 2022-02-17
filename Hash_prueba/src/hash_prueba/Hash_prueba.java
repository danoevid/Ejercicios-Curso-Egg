
package hash_prueba;

import hash_prueba.Servicios.AlumnoServicio;

public class Hash_prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoServicio service = new AlumnoServicio();
        service.Proceso();
        service.Buscar();
    }
    
}
