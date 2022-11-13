import java.util.HashMap;
import java.util.Map;

class Market {
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