import java.time.LocalDate;

import facade.Facade;
import model.Produto;


public class Sistema {
    public static void main(String[] args) throws Exception {


        Facade facade = new Facade();

        Produto p1 = facade.criarProduto(1, "Chocolate Amargo", "Lacta", 40.00);
        Produto p2 = facade.criarProduto(2, "Chocolate Ao Leite", "Lacta", 30.00);
        System.out.println(facade.listarProdutos());

        facade.criarLote(1, 300, LocalDate.parse("2023-06-09"), p1);
        facade.criarLote(2, 500, LocalDate.parse("2023-04-07"), p2);
        System.out.println(facade.listarLotes());
    }
}
