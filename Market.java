import java.util.HashMap;
import java.util.Map;

class Market {
    public static Market instance;

    private Market() {}

    public static Market getInstance() {
        if(instance == null) {
            instance = new Market();
        }
        return instance;
    }

    HashMap<Integer, Section> sections = new HashMap<>();

    void addSection(Integer id, Section section) {
        sections.putIfAbsent(id, section);
    }

    Section getSection(int id) {
        return sections.get(id);
    }

    Map<Integer, Section> getSections() {
        return sections;
    }
}