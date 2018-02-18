package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_Substring_Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;

        List<String> substrings = new ArrayList<>();
        int currentPosition = 0;
        int toPosition;

        while (true){
            toPosition = currentPosition + k;
            if (toPosition > s.length()) break;
            substrings.add(s.substring(currentPosition++, toPosition));
        }

        smallest = substrings.get(0);
        largest = substrings.get(0);

        for (String substring: substrings) {
            if (substring.compareTo(smallest) < 0) smallest = substring;
            if (substring.compareTo(largest) > 0) largest = substring;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
