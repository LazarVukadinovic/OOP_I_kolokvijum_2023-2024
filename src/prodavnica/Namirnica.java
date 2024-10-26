package prodavnica;

public class Namirnica extends Proizvod{
    private int brKomada;

    public Namirnica(String naziv, double cena){
        super(naziv, cena);
        this.brKomada = 0;
    }

    public Namirnica(String naziv, double cena, int brKomada){
        super(naziv, cena);
        this.brKomada = brKomada;
    }


    public int getBrKomada() {
        return brKomada;
    }
    public void setBrKomada(int brKomada) {
        this.brKomada = brKomada;
    }
}
