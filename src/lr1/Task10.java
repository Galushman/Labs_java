import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int number1 = in.nextInt();

        System.out.println("Input the second number: ");
        int number2 = in.nextInt();

        int sum = number1 + number2;
        int difference = number1 - number2;

        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + difference);
    }
}
