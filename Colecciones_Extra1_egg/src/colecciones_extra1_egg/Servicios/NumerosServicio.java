
package colecciones_extra1_egg.Servicios;

import colecciones_extra1_egg.Entidades.Numeros;
import java.util.ArrayList;
import java.util.Scanner;


public class NumerosServicio {
    private ArrayList<Numeros>numero;
    private ArrayList<Integer>num;
    private Scanner sc;
    public NumerosServicio(){
        this.sc = new Scanner(System.in);
        this.numero = new ArrayList();
        this.num = new ArrayList();
    }
    public Numeros crear(int num){
        return new Numeros(num);
    }
    public void añadir(Numeros num){
        numero.add(num);
    }
    // en este metodo vamos a llenar una lista con nuemeros y no objetos
    public void llenarLista(){
        boolean t = false;
        
        System.out.println("Ingrese numeros a cargar, finaliza el proceso cuando ingre -99");
        do{
            System.out.println("Ingrese Numero");
            Integer nume = sc.nextInt();
            if(nume==(-99)){
                System.out.println("Fin del proceseo de carga");
                break;
            }else {
                num.add(nume);
            }
            
        }while(!t);
        mostrarLista();
    }
    public void mostrarLista(){
        System.out.println("números ingresados a la lista");
        for (Integer numeros: num) {
            System.out.print(numeros+" ");
        }
        System.out.println("");
    }
    public void procesoCarga(){
        boolean t = false;
        
        System.out.println("Ingrese numeros a cargar, finaliza el proceso cuando ingre -99");
        do{
            System.out.println("Ingrese Numero");
            int num = sc.nextInt();
            if(num==(-99)){
                System.out.println("Fin del proceseo de carga");
                break;
            }else {
                Numeros n = crear(num);
                añadir(n);
            }
            
        }while(!t);
        mostrar();
    
                
    }
    public void mostrar(){
        for (Numeros numeros : numero) {
            System.out.println(numeros);
        }
    }
    
}
