package izuzeci;

public class VecNaAkcijiException extends Exception {

    public VecNaAkcijiException() {
        super("Proizvod je vec na akciji! Exception!");
    }

    public VecNaAkcijiException(String message) {
        super(message);
    }
}
