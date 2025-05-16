import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = in.nextInt();

        int lessNumber = number - 1;
        int nextNumber = number + 1;
        int sum = number + lessNumber + nextNumber;
        int squaredSum = sum * sum;

        System.out.println(lessNumber + " " + number + " " + nextNumber + " " + squaredSum);
    }
}
