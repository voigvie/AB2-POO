public class AguaSanitaria extends Limpeza {
    String marca; 
    double preco;

    public AguaSanitaria(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Água Sanitária " + marca + ", Preço: R$" + preco;
    }

}
