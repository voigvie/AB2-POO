
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Market market = new Market();
        Scanner ler = new Scanner(System.in);

        Drinks drinks = new Drinks();
        drinks.addBebida(new Refrigerante("Coca-Cola", 30));
        drinks.addBebida(new Refrigerante("Sprite", 15));
        drinks.addBebida(new Suco("Tang", 2));

        market.addSection(1, drinks);

        Section section = market.getSection(1);
        Drinks drinksSection = ((Drinks) section);

        /*for (int i = 0; i < drinksSection.getBebidas().size(); i++) {
            System.out.println(drinksSection.getBebidas().get(i));
         }*/
        //System.out.println(drinksSection.getBebidas().get(1));
        //System.out.println(w);
        int opc;
        System.out.println("Bem vindo(a), ao E-Market, seu supermecado online\n");
        System.out.println("---------MENU----------");
        System.out.println("Seleciione um numero a seguir para começar suas compras:\n");
        System.out.println("[1] Alimentos");
        System.out.println("[2] Higiene Pessoal");
        System.out.println("[3] Bebidas");
        System.out.println("[4] Limpeza");
        System.out.println("[0] Sair");
        System.out.print("opc: ");
        opc = Integer.parseInt(ler.nextLine());

        switch (opc) {
            case 1:

                System.out.println("[1] Carnes");
                System.out.println("[2] Massas");
                System.out.println("[3] Molhos");
                break;

            case 2:
                System.out.println("[1] Creme Dental");
                System.out.println("[2] Sabonetes");
                System.out.println("[3] Shampoos");
                break;
                
            case 3:
                System.out.println("[1] Sucos");
                System.out.println("[2] Refrigerantes");
                System.out.println("[3] Vinhos");
                break;
              
            case 4:
                System.out.println("[1] Sabão");
                System.out.println("[2] Água Sanitária");
                System.out.println("[3] Detergente");
                break;
        } while (opc != 0);
    }
}
