package exercitii_practice_proiect;

public class TemperatureException extends Exception  {
    //proprietes
    int t;

    public TemperatureException(int t, String msg) {
        super(msg);
        this.t = t;

    }
}
