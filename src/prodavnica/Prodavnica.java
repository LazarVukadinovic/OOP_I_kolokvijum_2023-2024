package prodavnica;
import izuzeci.NemaMestaException;
import java.util.ArrayList;

public class Prodavnica {
    public ArrayList<Namirnica> listaNamirnica = new ArrayList<Namirnica>();
    private int maxRazlicitihProizvoda;

    public Prodavnica(int maxRazlicitihProizvoda) {
        this.maxRazlicitihProizvoda = maxRazlicitihProizvoda;
    }

    public void dodajProizvod(Namirnica namirnica) throws NemaMestaException {
        if(listaNamirnica.size() >= maxRazlicitihProizvoda) {
            throw new NemaMestaException();
        }
        listaProizvoda.add(proizvod);
    }

//    public void dopuniRafove() {
//        for(int i=0; i<listaNamirnica.size(); i++) {
//            if(listaNamirnica.get(i).brKomada < 20)
//        }
//    }
}
