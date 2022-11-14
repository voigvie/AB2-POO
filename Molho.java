public class Molho extends Alimento{
    String marca; 
    double preco;

    public Molho(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Molho " + marca + ", Preço: " + preco;
    }

    
}
