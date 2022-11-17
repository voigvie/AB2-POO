import java.util.ArrayList;

public class Food extends Section {
    ArrayList<Alimento> alimentos = new ArrayList<>();

    void addAlimento(Alimento alimento){
        alimentos.add(alimento);
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    @Override
    public String toString() {
        return "Food{" + "alimentos=" + alimentos + '}';
    }



}
