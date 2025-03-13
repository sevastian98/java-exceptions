package exercitii_practice_proiect;

public class DrinkCoffee {
    //metoda

    void drinkCoffee (Coffee coffee) throws TemperatureException,ConcentrationException {

        // if for temperature

        if (coffee.getTemp() > 65) {
            throw new TemperatureException(coffee.getTemp(), "Coffee is too hot");
        }

        //if for concentration
        if (coffee.getConcentration() > 55) {
            throw new ConcentrationException(coffee.getConcentration(), "Coffee concentration is too high.");
        }
    }
}
