
import java.text.NumberFormat;
import java.util.Scanner;

public class CurrencyConversion {

    public static void main(String[] args) {
        double amount;
        double rate;
        double convertedAmount;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the amount of money in YEN:");
            amount = scan.nextDouble();
            System.out.println("Enter the current exchange rate:");
            rate = scan.nextDouble();
        }

        convertedAmount = amount * rate;
        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println("The amount in the foreign currency is: " + money.format(convertedAmount));
    }
}
