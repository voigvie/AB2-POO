
import java.util.ArrayList;

public class Drinks extends Section {
    ArrayList<Bebida> bebidas = new ArrayList<>(); 

    void addBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    @Override
    public String toString() {
        return "Drinks [bebidas=" + bebidas + "]";
    }
}
