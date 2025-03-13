package exercitii_practice_proiect;

public class ConcentrationException extends Exception {
    //proprietes
    int c;
    public ConcentrationException(int c, String msg) {
        super(msg);
        this.c = c;
    }
}
