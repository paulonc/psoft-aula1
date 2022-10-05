package services;
import java.util.Map;

import model.Produto;
import reposiroty.ProdutoRepository;

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
        for (Map.Entry<Integer,Produto> pair : produtoRepository.listarProdutos().entrySet()) {
            result += pair.getValue() + System.lineSeparator();
        }
        return result;
    }


    
    
}
