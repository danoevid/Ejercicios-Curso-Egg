
package colecciones_extra1_egg.Entidades;

public class Numeros {
    private int num;
    public Numeros(){
        
    }

    public Numeros(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Numeros{" + "num=" + num + '}';
    }
    
}
