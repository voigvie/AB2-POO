public class Massa extends Alimento {
    String marca; 
    double preco;

    public Massa(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Massa{" + "marca=" + marca + ", preco=" + preco + '}';
    }

    
    
}
