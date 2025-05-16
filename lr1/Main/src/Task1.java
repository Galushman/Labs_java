import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input second name: ");
        String secondName = in.nextLine();

        System.out.println("Input first name: ");
        String firstName = in.nextLine();

        System.out.println("Input patronymic: ");
        String patronymic = in.nextLine();

        System.out.println("Hello, " + secondName + " " + firstName + " " + patronymic);
        in.close();
    }
}
