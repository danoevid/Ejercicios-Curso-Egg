/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_egg_colecciones.Servicios;

import ejercicio6_egg_colecciones.Entidades.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProductoServicio {
     private HashMap<Integer,Producto>listaProducto;
    private Scanner sc;
    public ProductoServicio(){
        this.listaProducto = new HashMap();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }
    public Producto crear(){
        System.out.println("Ingrese codigo del producto");
        Integer cod = sc.nextInt();
        System.out.println("Ingrese Nombre del producto");
        String nombre = sc.next();
        System.out.println("Ingrese Precio del producto");
        Double precio = sc.nextDouble();
        return new Producto(cod,nombre,precio);
    }
    public void Modificar(){
       Iterator<Map.Entry<Integer,Producto>> iterator = listaProducto.entrySet().iterator(); 
       System.out.println("Ingrese el codido del elemento que quiere modificar");
       Integer cod = sc.nextInt();
       while (iterator.hasNext()) {
          Map.Entry<Integer,Producto> entry = iterator.next();
          Producto p = entry.getValue();
          if(Objects.equals(entry.getKey(), cod)){
            System.out.println("Ingrese la modificacion que desea hacer");
            System.out.println("1- Nombre, 2- Precio");
            short i = sc.nextShort();
            if(i==1){
                System.out.println("Ingrese el nuevo nombre");
               String nombre = sc.next();
               p.setNombre(nombre);
            }else if (i==2){
                System.out.println("Ingrese el nuevo precio");
                Double precio = sc.nextDouble();
                p.setPrecio(precio);
            }
             
            
          }
        
       }
    }
    public void Eliminar(){
        Iterator<Map.Entry<Integer,Producto>> iterator = listaProducto.entrySet().iterator(); 
       System.out.println("Ingrese el codido del elemento que quiere eliminar");
       Integer cod = sc.nextInt();
       while (iterator.hasNext()) {
          Map.Entry<Integer,Producto> entry = iterator.next();
          if(Objects.equals(entry.getKey(), cod)){
              iterator.remove();
          }
        }
       
 }   
    public void añadir(Producto prod){
        listaProducto.put(prod.getCodigo(),prod);
    }
    public void mostrar(){
        Iterator<Map.Entry<Integer,Producto>> iterator = listaProducto.entrySet().iterator();
       while (iterator.hasNext()) {
          Map.Entry<Integer,Producto> entry = iterator.next();
           System.out.println(entry.getValue());
        
       }

    
    }
    public void cargar(){
        boolean t = false;
        System.out.println("INGRESE DATOS DEL PRODUCTO");
        do{
            Producto prod = crear();
            añadir(prod);
            System.out.println("¿Desea cargar otro producto? 1-si, 2-no" );
            short i = sc.nextShort();
            if(i==2){
                System.out.println("Carga exitosa");
                break;
            }
        }while(!t);
    }
    
    public void ProcesoCarga(){
        boolean t = false;
        do{
            System.out.println("MENÚ DE OPCIONES A REALIZAR");
            System.out.println("1- Cargar producto");
            System.out.println("2- Modificar producto");
            System.out.println("3- Elinar producto");
            System.out.println("4- Mostrar Datos");
            System.out.println("5- Exit");
            short i = sc.nextShort();
            switch(i){
                case 1:
                    Producto prod = crear();
                    añadir(prod);
                    break;
                case 2:
                    Modificar();
                    break;
                case 3:
                    Eliminar();
                    break;
                case 4:
                    mostrar();
                    break;
                case 5:
                    t=true;
                    break;
                default:
                    System.out.println("Opción mal ingresada");
                    break;
            }
        }while(!t);
            
               
        
    }
    
}
