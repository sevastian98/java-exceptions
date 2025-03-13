package exercitii_practice_proiect;

public class CoffeMaker {

    Coffee makeCoffee() {
        System.out.println("Make a coffe");
        int t = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        Coffee coffee = new Coffee(t,c);
        return coffee;
    }
}
