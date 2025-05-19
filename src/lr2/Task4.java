package lr2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = in.nextInt();

        if ((number > 5) & (number <= 10)) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
