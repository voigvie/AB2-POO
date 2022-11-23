import java.util.ArrayList;

public class Cleaning extends Section {
    ArrayList<Limpeza> clean = new ArrayList<>(); 

    void addLimpeza(Limpeza limpeza) {
        clean.add(limpeza);
    }

    public ArrayList<Limpeza> getLimpeza() {
        return clean;
    }

    @Override
    public String toString() {
        return "Cleaning{" + "clean=" + clean + '}';
    }

}