package lr1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the name of the month: ");
        String month = in.nextLine();

        System.out.println("Input count of the days in month:");
        int count = in.nextInt();

        System.out.println(month + " has " + count + " days");
    }
}
