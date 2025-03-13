package exercitii_practice_proiect;

public class Coffee {
    // properties
    private int temp;
    private int concentration;
    // constructor (initializator)

    Coffee(int t, int c) {
        temp = t; // temperature
        concentration = c; // concentration
    }

    //getters

    public int getTemp() {
        return temp;
    }

    public int getConcentration() {
        return concentration;
    }

    @Override
    public String toString() {
        return "[coffe temperature = " + temp + " : concentration coffe  = " + concentration + "]";
    }
}
