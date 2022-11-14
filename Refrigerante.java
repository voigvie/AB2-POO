public class Refrigerante extends Bebida {
    String marca; 
    double preco;

    public Refrigerante(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Refrigerante " + marca + ", Preço: " + preco;
    }
}
