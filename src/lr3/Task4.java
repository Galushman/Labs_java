package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int firstNumber = in.nextInt();
        System.out.println("Input the second number: ");
        int secondNumber = in.nextInt();

        int j = 0;
        int[] result;
        if (firstNumber > secondNumber) {
            result = new int[(firstNumber - secondNumber) + 1];
            for (int i = secondNumber; i <= firstNumber; i++) {
                result[j] = i;
                j++;
            }
        } else {
            result = new int[(secondNumber - firstNumber) + 1];
            for (int i = firstNumber; i <= secondNumber; i++) {
                result[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
