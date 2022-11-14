import java.util.ArrayList;

public class Hygiene extends Section {
    ArrayList<HigienePessoal> higiene = new ArrayList<>(); 

    void addHigienePessoal(HigienePessoal higienePessoal) {
        higiene.add(higienePessoal);
    }

    public ArrayList<HigienePessoal> getHigienePessoal() {
        return higiene;
    }

    @Override
    public String toString() {
        return "Hygiene{" + "higiene=" + higiene + '}';
    }

    
}
