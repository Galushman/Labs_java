package lr3;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {
        char[] result = new char[10];
        char ch = 'b';

        for (int i = 0; i < result.length; i++) {
            switch (ch) {
                case 'e':
                    i--;
                    ch += 1;
                    break;
                case 'i':
                    i--;
                    ch += 1;
                    break;
                default:
                    result[i] = ch;
                    ch += 1;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
