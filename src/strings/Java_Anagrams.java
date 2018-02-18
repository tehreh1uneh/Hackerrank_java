 package strings;

import java.util.HashMap;
import java.util.Scanner;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {

        HashMap<Character, Integer> aLetters = fillMap(a);
        HashMap<Character, Integer> bLetters = fillMap(b);

        return aLetters.equals(bLetters);
    }

    private static HashMap<Character, Integer> fillMap(String text) {
        text = text.toLowerCase();
        HashMap<Character, Integer> letters = new HashMap<>();

        for (char letter :
                text.toCharArray()) {
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        return letters;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
