/**
 * Created by Vesper_Mark https://www.linkedin.com/in/kostia-savchenko/
 */


public class Break_Continue {
    public static void main(String[] args) {
        int value = 0;
        while (true) {
            System.out.println(value);
            value++;
            if (value == 5) {
                break;
            }
        }
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println("Четное число " + i);
        }
    }
}
