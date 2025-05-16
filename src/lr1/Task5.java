import java.time.LocalDate;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        Scanner in = new Scanner(System.in);

        System.out.println("Input your year of the birth: ");
        int year = in.nextInt();

        int age = currentYear - year;

        System.out.println("Your age is " + age);
    }
}
