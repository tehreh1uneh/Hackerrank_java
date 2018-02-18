package introduction;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Java_Currency_Formatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        String us = formatter.format(payment);

        formatter = NumberFormat.getCurrencyInstance(new Locale("EN", "IN"));
        String india = formatter.format(payment);

        formatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formatter.format(payment);

        formatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatter.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
