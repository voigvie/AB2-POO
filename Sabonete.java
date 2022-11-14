public class Sabonete extends HigienePessoal{
    String marca; 
    double preco;

    public Sabonete(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Sabonete " + marca + ", Preço: " + preco;
    }
    
}
