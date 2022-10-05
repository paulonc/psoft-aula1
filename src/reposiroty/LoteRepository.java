package reposiroty;

import java.util.Map;
import java.util.HashMap;
import model.Lote;

public class LoteRepository {


    private Map<Integer, Lote> lotes;

    public LoteRepository() {
        this.lotes = new HashMap<>();
    }

    public void adicionarLote(Lote lote) {
        lotes.put(lote.getId(), lote);
    }

    public Map<Integer, Lote> listarLotes() {
        return lotes;
    }


    
    
}
