public class CremeDental extends HigienePessoal {
    String marca; 
    double preco;

    public CremeDental(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Creme dental " + marca + ", Preço: R$" + preco;
    }
    
}
