/**
 * Created by Vesper_Mark https://www.linkedin.com/in/kostia-savchenko/
 */



public class Arrays {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных
        int[] numbers = new int[100]; // ссылочный тип данных
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = i*10;
        }
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
