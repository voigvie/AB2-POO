public class Suco extends Bebida {
    String marca;
    double preco;

    public Suco(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Suco marca: " + marca + ", preco: " + preco;
    }

    
}
