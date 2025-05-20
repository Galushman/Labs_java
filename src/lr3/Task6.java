package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the size of the array: ");
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input a number: ");
            int number = in.nextInt();
            if (number % 5 == 2) {
                nums[i] = number;
            } else {
                System.out.println("Your number doesn't match to conditions\nInput the other number\n");
                i--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
