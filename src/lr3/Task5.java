package lr3;

import java.util.Scanner;
import java.util.Arrays;

public class Task5  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the count of summable numbers: ");
        int size = in.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Input a number: ");
            int number = in.nextInt();
            if (number % 5 == 2 || number % 3 == 1) {
                nums[i] = number;
            } else {
                System.out.println("Your number doesn't match to conditions\nInput the other number\n");
                i--;
            }
        }
        System.out.println(Arrays.toString(nums));

        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
        }

        System.out.println(sum);
    }
}
