public class Sabao extends Limpeza {
    String marca; 
    double preco;

    public Sabao(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Sabão " + marca + ", Preço: R$" + preco;
    }

    
}
