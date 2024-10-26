package izuzeci;

public class RinfuzNaAkcijiException extends Exception {

    public RinfuzNaAkcijiException() {
        super("Rinfuz je vec na akciji! Exception!");
    }

    public RinfuzNaAkcijiException(String message) {
        super(message);
    }
}
