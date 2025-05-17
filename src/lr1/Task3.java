package lr1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the current day of the week: ");
        String day = in.nextLine();

        System.out.println("Input the name of the current month: ");
        String month = in.nextLine();

        System.out.println("Input the current date:");
        int date = in.nextInt();

        System.out.println("Today is " + day + " " + date + " " + month);
    }
}
