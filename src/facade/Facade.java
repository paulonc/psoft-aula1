package facade;

import java.time.LocalDate;

import model.Produto;
import services.LoteService;
import services.ProdutoService;

public class Facade {


    private ProdutoService produtoService;
    private LoteService loteService;

    public Facade() {
        this.produtoService = new ProdutoService();
        this.loteService = new LoteService();
    }


    public Produto criarProduto(int id, String nome, String fabricante, double preco) {
        return this.produtoService.criarProduto(id, nome, fabricante, preco);
    }


    public String listarProdutos() {
        return this.produtoService.listarProdutos();
    }


    public void criarLote(int id, int quantidade, LocalDate data, Produto produto) {
        this.loteService.criarLote(id, quantidade, data, produto);
    }

    public String listarLotes() {
        return this.loteService.listarLotes();
    }





    

    
}
