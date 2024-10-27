package prodavnica;

public class Namirnica extends Proizvod{
    protected int brKomada;

    public Namirnica(String naziv, double cena){
        super(naziv, cena);
        this.brKomada = 0;
    }

    public Namirnica(String naziv, double cena, int brKomada){
        super(naziv, cena);
        this.brKomada = brKomada;
    }

    public Namirnica(Proizvod pr, int brKomada){
        super(pr.naziv, pr.cena);
        this.brKomada = brKomada;
    }

    //get and set methods
    public int getBrKomada() {
        return brKomada;
    }
    public void setBrKomada(int brKomada) {
        this.brKomada = brKomada;
    }

    @Override
    public double dajCenu() {
        return brKomada * cena;
    }

    @Override
    public String toString() {
        return "Namirnica [" + super.toString() + "] - " + brKomada;
    }
}
