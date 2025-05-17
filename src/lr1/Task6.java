package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        Scanner in = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = in.nextLine();

        System.out.println("Input your year of the birth: ");
        int year = in.nextInt();

        int age = currentYear - year;

        System.out.println("Your name is " + name + "\nYour age is " + age);
    }
}