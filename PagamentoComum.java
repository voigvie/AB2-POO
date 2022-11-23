import java.util.ArrayList;

public class PagamentoComum implements Pagamento {

    @Override
    public void pagar(double total,ArrayList<Object> carrinho) {
        System.out.println("\n-------------------------");
        for (Object a : carrinho) {
            System.out.println(a+"\n");
        }
        System.out.println("-------------------------");
        System.out.println("Valor da compra \nR$:"+total+"\nTotal a ser pago \nR$:"+total);
        
    }
    
}
