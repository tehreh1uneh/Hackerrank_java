package introduction;

import java.util.Scanner;

public class Java_End_of_file {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long position = 0;

        while (sc.hasNextLine()){
            System.out.println(++position + " " + sc.nextLine());
        }
    }
}
