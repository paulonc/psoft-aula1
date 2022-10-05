package model;

import java.time.LocalDate;

public class Lote {

    private int id;
    private int quantidade;
    private LocalDate dataValiade;
    private Produto produto;

    public Lote(int id, int quantidade, LocalDate dataValiade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.dataValiade = dataValiade;
        this.produto = produto;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "id=" + id + ", quantidade=" + quantidade + ", dataValiade=" + dataValiade + ", produto=" + produto;
    }

    

    
}