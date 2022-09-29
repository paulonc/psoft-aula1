public class Produto {

    private String nome;
    private String fabricante;
    private double preco;

    public Produto(String nome, String fabricante, double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getPreco() {
        return preco;
    }
    
}