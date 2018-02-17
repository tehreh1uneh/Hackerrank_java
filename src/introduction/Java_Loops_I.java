package introduction;

import java.util.Scanner;

public class Java_Loops_I {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 0; i < 10; i++) {
            String msgTemplate = "%d x %d = %d";
            int multiplier = i + 1;
            String msg = String.format(msgTemplate, N, multiplier, N * multiplier);
            System.out.println(msg);
        }
    }

}


