package lr3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the count of numbers in the sequence: ");
        int size = in.nextInt();

        int[] nums = new int[size];
        System.out.println(nums[0] = 1);
        System.out.println(nums[1] = 1);

            for (int j = 2; j < size; j++) {
                nums[j] = nums[j - 1] + nums[j - 2];
                System.out.println(nums[j]);
            }
    }
}
