
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Consumer;


public class PersonaServicios {
    private ArrayList<Persona>listaPersona;
    private ArrayList<Perro>listaPerro;
    private Scanner sc;
    public PersonaServicios(){
        this.sc = new Scanner(System.in);
        this.listaPerro = new ArrayList();
        this.listaPersona = new ArrayList();
    }
    public Persona crearPersona(){
        Persona person = new Persona();
        System.out.println("Ingrese nombre de la persona");
        person.setNombre(sc.next());
        System.out.println("Ingrese apellido");
        person.setApellido(sc.next());
        System.out.println("Ingrese edad");
        person.setEdad(sc.nextInt());
        System.out.println("Ingrese dni");
        person.setDni(sc.nextInt());
        return person;
    }
    public Perro crearPerro(){
        Perro dog = new Perro();
        System.out.println("Ingrese nombre del perro");
        dog.setNombre(sc.next());
        System.out.println("Ingrese raza del perro");
        dog.setRaza(sc.next());
        System.out.println("Ingrese tamaño del perro");
        dog.setTama(sc.next());
        return dog;
    }
    public void añadirPersona(Persona person){
        listaPersona.add(person);
    }
    public void añadirPerro(Perro perro){
        listaPerro.add(perro);
    }
    public void cargarPersona(){
        for (int i = 0; i < 2; i++) {
            Persona person = crearPersona();
            añadirPersona(person);
        }
    }
    public void cargarPerro(){
        for (int i = 0; i <2; i++) {
            Perro perro = crearPerro();
            añadirPerro(perro);
        }
    }
    public void mostrarPerro(){
        listaPerro.forEach((perro) -> {
            System.out.println(perro);
        });
    }
    public void mostrarPersona(){
        for (Persona persona : listaPersona) {
            System.out.println("Nombre: "+persona.getNombre()+" Apellido: "+persona.getApellido());
            System.out.println("Edad: "+persona.getEdad()+" Dni: "+persona.getDni());
            System.out.println("-----------------------------------------------------");
        }
    }
    public void elegirPersona(){
        System.out.println("Ingrese la Persona cual desea adoptar un perro");
        String nombre = sc.next();
        Iterator<Persona> it = listaPersona.iterator();
        while(it.hasNext()){
            Persona p = it.next();
            if(p.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Datos de la persona responsable de la adopción");
                System.out.println("Nombre: "+p.getNombre());
                System.out.println("Apellido: "+p.getApellido());
                System.out.println("Edad: "+p.getEdad());
                System.out.println("Dni: "+p.getDni());
                elegirMascota(p);
            }
        }
    }
    public void elegirMascota(Persona persona){
        boolean adop = false;
        System.out.println("Elegir la mascota que desea adoptar");
        String nombre = sc.next();
        String n="";
        Iterator<Perro> it = listaPerro.iterator();
        while(it.hasNext()){
            Perro p = it.next();
            if(p.getNombre().equalsIgnoreCase(nombre)){
                persona.setPerro(p);
                n=p.getNombre();
                adop = true;
                it.remove();
            }
        }
        if(adop=true){
            System.out.println("Adopción exitosa");
        }else{
            System.out.println("Adopción fallida");
        }
        System.out.println("Lista de perros en espera de adopción");
        mostrarPerro();
        System.out.println("Personas que adoptaron");
        if(persona.getPerro()==null){
            System.out.println(persona.getNombre()+ persona.getApellido()+" no ha adoptado");
        }else{
           System.out.println(persona.getNombre()+ persona.getApellido()+" ha adoptado a: "+n);
        }
    }
    public void Proceso(){
        cargarPersona();
        cargarPerro();
        System.out.println("Lista de personas");
        mostrarPersona();
        System.out.println("Lista de perros");
        mostrarPerro();
        elegirPersona();
    }
}
