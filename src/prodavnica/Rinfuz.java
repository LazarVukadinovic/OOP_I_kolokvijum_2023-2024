package prodavnica;

public class Rinfuz extends Proizvod{
    private int tezina;

    public Rinfuz(String naziv, double cena) {
        super(naziv, cena);
        this.tezina = 0;
    }

    public Rinfuz(String naziv, double cena, int tezina) {
        super(naziv, cena);
        this.tezina = tezina;
    }

    public Rinfuz(Proizvod pr, int tezina){
        super(pr.naziv, pr.cena);
        this.tezina = tezina;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    @Override
    public double dajCenu() {
        return tezina * cena;
    }

    @Override
    public String toString() {
        return "Rinfuz " + super.toString() + " - " + tezina;
    }
}
