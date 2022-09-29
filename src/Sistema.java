import java.time.LocalDate;

public class Sistema {
    public static void main(String[] args) throws Exception {
        
        Produto produto = new Produto("Chocolate", "Lacta", 40.00);
        Lote lote = new Lote(100, LocalDate.parse("2023-06-09"), produto);

    }
}
