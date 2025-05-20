package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {

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

        Arrays.sort(nums);

        int[] reversedNums = new int[size];
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            reversedNums[j] = nums[i];
            j++;
        }

        System.out.println("Array was sorted");
        System.out.println("Sorted array: " + Arrays.toString(reversedNums));
    }
}
