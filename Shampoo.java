public class Shampoo extends HigienePessoal {
    String marca; 
    double preco;

    public Shampoo(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Shampoo " + marca + ", Preço: " + preco;
    }
    
}
