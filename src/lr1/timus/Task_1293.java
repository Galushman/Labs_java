package lr1.timus;

import java.util.Scanner;

public class Task_1293 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int result = N * A * B * 2;

        System.out.println(result);
    }
}
