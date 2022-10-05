package reposiroty;

import java.util.HashMap;
import java.util.Map;

import model.Produto;

public class ProdutoRepository {

    private Map<Integer, Produto> produtos;

    public ProdutoRepository() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.put(produto.getId(), produto);
    }

    public Map<Integer, Produto> listarProdutos() {
        return produtos;
    }

    
    
    
}
