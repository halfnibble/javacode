
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random generator = new Random();
        int num1;
        double num2;

        num1 = generator.nextInt();
        System.out.println("A random integer: " + num1);

        num1 = generator.nextInt(10) + 1;
        System.out.println("From 1 to 10: " + num1);

        num2 = generator.nextDouble();
        System.out.println("A random double [between 0-1]: " + num2);
    }
}
