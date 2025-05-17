package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();

        int yearOfTheBirth = currentYear - age;

        System.out.println("You were born in " + yearOfTheBirth);
    }
}
