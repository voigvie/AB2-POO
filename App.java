import java.util.Iterator;
import java.util.Map;

public class App {
   public static void main(String[] args) { 
      Market market = new Market();
      
      Drinks drinks = new Drinks();
      drinks.addBebida(new Refrigerante("Coca-Cola", 30));  
      drinks.addBebida(new Refrigerante("Sprite", 15));     
      drinks.addBebida(new Suco("Tang", 2)); 

      market.addSection(1, drinks);

      Section section = market.getSection(1);
      System.out.println(section);
      Drinks drinksSection = ((Drinks)section);

      for(int i = 0; i<drinksSection.getBebidas().size(); i++){
         System.out.println(drinksSection.getBebidas().get(i));
      }

      //System.out.println(drinksSection.getBebidas().get(1));
      //System.out.println(w);
   }
}
