package services;

import model.Produto;
import repository.ProdutoRepository;

public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService() {
        this.produtoRepository = new ProdutoRepository();
    }

    public Produto criarProduto(int id, String nome, String fabricante, double preco) {
        Produto p = new Produto(id, nome, fabricante, preco);
        produtoRepository.adicionarProduto(p);
        return p;
    }


    public String listarProdutos() {  
        String result = "";
        for (Produto produto : produtoRepository.listarProdutos().values()) {
            result += produto + System.lineSeparator();
        }
        return result.trim();
    }


    
    
}
