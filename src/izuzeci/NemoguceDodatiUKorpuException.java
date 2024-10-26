package izuzeci;

public class NemoguceDodatiUKorpuException extends Exception{

    public NemoguceDodatiUKorpuException(){
        super("Nemoguce dodati u korpu Exception");
    }

    public NemoguceDodatiUKorpuException(String message){
        super(message);
    }
}
