package services;

import java.time.LocalDate;

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
        for (Lote lote : loteRepository.listarLotes().values()) {;
            result += lote + System.lineSeparator();
        }
        return result.trim();
    }

   
}
