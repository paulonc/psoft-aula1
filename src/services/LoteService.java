package services;

import java.time.LocalDate;
import java.util.Map;

import model.Lote;
import model.Produto;
import repository.LoteRepository;

public class LoteService {


    private LoteRepository loteRepository;

    public LoteService() {
        this.loteRepository = new LoteRepository();
    }

    public void criarLote(int id, int quantidade, LocalDate data, Produto produto) {
        Lote l = new Lote(id, quantidade, data, produto);
        loteRepository.adicionarLote(l);
    }

    public String listarLotes() {
        String result = "";
        for (Map.Entry<Integer, Lote> pair : loteRepository.listarLotes().entrySet()) {
            System.out.println(pair.getValue());
            result += pair.getValue() + System.lineSeparator();
        }
        return result.trim();
    }

   
}
