package izuzeci;

public class NemaNaStanjuException extends Exception{

    public NemaNaStanjuException(){
        super("Nema na stanju Exception!");
    }

    public NemaNaStanjuException(String message){
        super(message);
    }
}
