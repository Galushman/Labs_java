package lr2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = in.nextInt();

        int thousandsCount = number / 1000;
        System.out.println(thousandsCount);
    }
}
