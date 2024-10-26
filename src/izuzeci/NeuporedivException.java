package izuzeci;

public class NeuporedivException extends Exception{

    public NeuporedivException(){
        super("Poredjenje se ne moze izvrsiti Exception!");
    }

    public NeuporedivException(String message){
        super(message);
    }
}
