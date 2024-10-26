package izuzeci;

public class NemaMestaException extends Exception{

    public NemaMestaException(){
        super("Nema mesta Exception!");
    }

    public NemaMestaException(String message){
        super(message);
    }
}
