public class Detergente extends Limpeza{
    String marca; 
    double preco;

    public Detergente(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Deteregente " + marca + ", Preço: " + preco;
    }

    
}
