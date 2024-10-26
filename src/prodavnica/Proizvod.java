package prodavnica;
import izuzeci.NeuporedivException;

public abstract class Proizvod implements IUporediv {
    public String naziv;
    public double cena;

    public Proizvod(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public abstract double dajCenu();

    @Override
    public String toString() {
        return naziv + " - " + cena;
    }

    @Override
    public boolean uporedi(Object obj) throws NeuporedivException {
        if (obj instanceof Proizvod)
            return this.naziv.equals(obj.naziv) && this.cena == obj.cena;
        else
            throw new NeuporedivException();
    }
}
