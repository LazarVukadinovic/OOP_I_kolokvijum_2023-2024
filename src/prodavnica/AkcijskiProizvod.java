package prodavnica;
import izuzeci.VecNaAkcijiException;
import izuzeci.RinfuzNaAkcijiException;

public class AkcijskiProizvod extends Namirnica{
    private double akcija;

    public AkcijskiProizvod(Namirnica namirnica, double popust) throws VecNaAkcijiException, RinfuzNaAkcijiException {
//        if(namirnica instanceof Rinfuz) {
//            throw new RinfuzNaAkcijiException();
//        }
//        else if(namirnica instanceof AkcijskiProizvod) {
//            throw new VecNaAkcijiException();
//        }
        super(namirnica.naziv, namirnica.cena, namirnica.brKomada); //?
        this.akcija = this.ObracunajAkciju(popust);
    }

    public AkcijskiProizvod(AkcijskiProizvod akcijskiProizvod, int brKomada) {
        super(akcijskiProizvod.naziv, akcijskiProizvod.cena, brKomada);
        this.akcija = akcijskiProizvod.akcija;
    }

    private double ObracunajAkciju(double popust){
        return this.cena * (1 - popust / 100);
    }

    public double dajCenuBezPopusta() {
        return this.cena;
    }

    public static Namirnica skiniSaAkcije(AkcijskiProizvod akcijskiProizvod) {
        return new Namirnica(akcijskiProizvod.naziv, akcijskiProizvod.cena, akcijskiProizvod.brKomada);
    }

    @Override
    public String toString() {
        return "Akcija [" + this.naziv + " - " + this.cena + "]%" + this.akcija + " - " + this.brKomada;
    }
}
