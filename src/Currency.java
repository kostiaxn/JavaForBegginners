/**
 * Created by Vesper_Mark https://www.linkedin.com/in/kostia-savchenko/
 */

import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {
        double amountBYN;
        double firstCurrencyUSD;
        double secondCurrencyUSD;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый курс в USD");
        firstCurrencyUSD = scanner.nextDouble();

        System.out.println("Введите второй курс в USD");
        secondCurrencyUSD = scanner.nextDouble();
        System.out.println("Введите сумму в BYN для конвертации");
        amountBYN = scanner.nextDouble();

        double amountUSD1 = amountBYN / firstCurrencyUSD;
        double amountUSD2 = amountBYN / secondCurrencyUSD;

        System.out.println("Сумма USD по первому курсу: " + Math.round(amountUSD1) + " USD");
        System.out.println("Сумма USD по второму курсу: " + Math.round(amountUSD2) + " USD");
        System.out.println("Разница между курсами USD 1 - USD 2: " + Math.round(amountUSD1 - amountUSD2) + " USD");


    }


}
