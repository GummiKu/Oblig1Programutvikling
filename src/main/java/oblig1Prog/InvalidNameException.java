package oblig1Prog;

public class InvalidNameException extends IllegalArgumentException {
    public InvalidNameException (String msg) {
        super(msg);
    }
}