public class Vinho extends Bebida {
    String marca; 
    double preco;

    public Vinho(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Vinho " + marca + ", Preço: R$" + preco;
    }

    
}
