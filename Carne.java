public class Carne extends Alimento{
    String marca; 
    double preco;

    public Carne(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carne{" + "marca=" + marca + ", preco=" + preco + '}';
    }

}
