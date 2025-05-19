package lr3;

import java.util.Scanner;

public class Task2_IFversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String day = in.nextLine();

        if (day.equals("Monday")) {
            System.out.println("1");
        } else if (day.equals("Tuesday")) {
            System.out.println("2");
        } else if (day.equals("Wednesday")) {
            System.out.println("3");
        } else if (day.equals("Thursday")) {
            System.out.println("4");
        } else if (day.equals("Friday")) {
            System.out.println("5");
        } else if (day.equals("Saturday")) {
            System.out.println("6");
        } else if (day.equals("Sunday")) {
            System.out.println("7");
        } else System.out.println("This name of the day don't exist");
    }
}
