package introduction;

import java.util.Scanner;

public class Java_Datatypes {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();

                System.out.println(x + " can be fitted in:");

                if (x >= getBound(Bounds.LEFT, 7) && x <= getBound(Bounds.RIGHT, 7)) System.out.println("* byte");
                if (x >= getBound(Bounds.LEFT, 15) && x <= getBound(Bounds.RIGHT, 15)) System.out.println("* short");
                if (x >= getBound(Bounds.LEFT, 31) && x <= getBound(Bounds.RIGHT, 31)) System.out.println("* int");
                if (x >= getBound(Bounds.LEFT, 63) && x <= getBound(Bounds.RIGHT, 64)) System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

    private enum Bounds {LEFT, RIGHT}

    private static long getBound(Bounds bound, int power) {
        if (bound == Bounds.LEFT) {
            return (long) Math.pow(-2, power);
        } else {
            return (long) (Math.pow(2, power) - 1);
        }
    }
}
