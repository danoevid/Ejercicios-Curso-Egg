/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist_egg1.Entidades;

/**
 *
 * @author Usuario
 */
public class Perro {
    private String raza;
    public Perro(){
        
    }
    public Perro(String Raza){
        this.raza=Raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }
    
}
