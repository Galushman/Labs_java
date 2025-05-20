package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the size of the array: ");
        int size = in.nextInt();
        char[] result = new char[size];

        char a = 'a';
        for (int i = 0; i < size; i++) {
            result[i] = a;
            a += 2;
        }
        System.out.println(Arrays.toString(result));

        char[] reversedResult = new char[size];
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            reversedResult[j] = result[i];
            j++;
        }
        System.out.println(Arrays.toString(reversedResult));
    }
}
