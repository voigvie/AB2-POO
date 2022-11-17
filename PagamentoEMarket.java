import java.util.ArrayList;

public class PagamentoEMarket implements Pagamento{

    @Override
    public void pagar(double total,ArrayList<Object> carrinho) {
        double desc = total-(total*0.30);
        System.out.println("\n-------------------------");
        for (Object a : carrinho) {
            System.out.println(a);
        }
        System.out.println("-------------------------\no");
        System.out.println("Valor da compra \nR$:"+total+"\nTotal a ser pago \nR$:"+desc);
    }
    
}
