package coef;
import java.util.Scanner;

public class CoeficientCuExceptie {

    public static int coeficient (int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Impartitorul/divizorul nu poate sa fie zero. ");

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //solicitam user-ului sa introduca 2 integeri
        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int rezultat = coeficient(number1,number2);
            System.out.println(number1 + " / " + number2 + " = " + rezultat);
        }
        catch (ArithmeticException exception) {
            System.out.println("Exceptie: un integer nu poate fi impartit la zero");
        }
        System.out.println("Executia continua ... ");
    }


}
