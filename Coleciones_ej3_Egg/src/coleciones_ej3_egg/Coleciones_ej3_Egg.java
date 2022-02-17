/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleciones_ej3_egg;

import coleciones_ej3_egg.Servicios.AlumnosServicios;

/**
 *
 * @author Usuario
 */
public class Coleciones_ej3_Egg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnosServicios service = new AlumnosServicios();
        service.Proceso();
        service.calcularNota();
    }
    
}
