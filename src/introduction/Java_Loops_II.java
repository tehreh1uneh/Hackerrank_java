package introduction;

import java.util.Scanner;

public class Java_Loops_II {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            printResult(a, b, n);
        }
        in.close();

    }

    private static void printResult(int a, int b, int n) {

        int prev = 0;
        int res;

        for (int i = 0; i < n; i++) {

            if (i == 0) {
                res = a + calculateElement(b, i);
            } else {
                res = prev + calculateElement(b, i);
            }

            prev = res;
            System.out.print(res);

            if (i != n - 1) {
                System.out.print(" ");
            }

        }
        System.out.println();
    }

    private static int calculateElement(int b, int n) {
        return (int) Math.pow(2, n) * b;
    }

}
