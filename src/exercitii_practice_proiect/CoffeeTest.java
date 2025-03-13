package exercitii_practice_proiect;

public class CoffeeTest {
    public static void main(String[] args) {

        CoffeMaker coffeeMaker = new CoffeMaker();
        DrinkCoffee drinkCoffee = new DrinkCoffee();

        for (int i = 1; i <= 5 ; i++) {
            Coffee coffee =  coffeeMaker.makeCoffee();
            System.out.println(" ");

            try {
                drinkCoffee.drinkCoffee(coffee);
            }
            catch (TemperatureException exception) {
                System.out.println("Exception: " + exception.getMessage() + "\ntemp " + coffee.getTemp());
            }
            catch (ConcentrationException exception) {
                System.out.println("Exception: "  + exception.getMessage() + "\nConcentration: " + coffee.getConcentration());
            }
            finally {
                System.out.println("Coffee is not prepared. ");
            }
        }
    }

}
