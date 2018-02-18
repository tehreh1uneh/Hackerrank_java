package strings;

import java.util.Scanner;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        int emptyTokens = 0;
        String[] tokens = s.split("[^A-Za-z]+");
        for (String token : tokens) {
            if (token.isEmpty()) {
                emptyTokens++;
            }
        }

        System.out.println(tokens.length - emptyTokens);
        for (String token : tokens) {
            if (token.isEmpty()) continue;
            System.out.println(token);
        }

        scan.close();
    }
}
