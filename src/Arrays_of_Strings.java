/**
 * Created by Vesper_Mark https://www.linkedin.com/in/kostia-savchenko/
 */

import java.util.Scanner;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        String[] strings = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Введи строку № " + (i+1));
            strings[i] = scanner.nextLine();
        }
        for (String x: strings // цикл foreach
             ) {
            System.out.println(x);
        }


        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }
        int sum = 0;
        for (int x:numbers
             ) {
            sum = sum+x;
        }
        System.out.println(sum);
    }
}
