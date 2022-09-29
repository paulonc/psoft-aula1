import java.time.LocalDate;

public class Lote {

    private int quantidade;
    private LocalDate dataValiade;
    private Produto produto;

    public Lote(int quantidade, LocalDate dataValiade, Produto produto) {
        this.quantidade = quantidade;
        this.dataValiade = dataValiade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDate getDataValiade() {
        return dataValiade;
    }

    public Produto getProduto() {
        return produto;
    }

    
}