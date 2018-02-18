package strings;

import java.util.Scanner;

public class Java_String_Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int lastPosition = A.length();
        boolean evenLength = lastPosition % 2 == 0;

        int centerPosition = evenLength ? lastPosition / 2 : lastPosition / 2 + 1;
        boolean isPalindrome = true;

        for (int i = 0; i < centerPosition; i++) {
            if (!A.substring(i, i + 1).equals(A.substring(lastPosition - i - 1, lastPosition - i))) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Yes" : "No");
    }

}
