package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the size of the array: ");
        int size = in.nextInt();
        int[] nums = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            nums[i] = random.nextInt(200);
        }
        System.out.println(Arrays.toString(nums));

        int min = nums[0];
        for (int n : nums){
            if (n <= min) {
                min = n;
            }
        }

        System.out.println("Minimum value is " + min);
        System.out.println("Indexes of it: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min){
                System.out.println(i + " ");
            }
        }
    }
}
