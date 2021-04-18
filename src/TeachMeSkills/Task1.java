package TeachMeSkills;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        // Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том,
        // входит ли заданное число в массив или нет.
        // Пусть число для поиска задается с консоли (класс Scanner).

        int [] numbers = new int [] {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        Scanner in = new Scanner(System.in);
        int entered = in.nextInt();

        Arrays.sort (numbers);

        int found = Arrays.binarySearch(numbers, entered);

        if (found >= 0) {
            System.out.println("The entered number exists in the array");
        }
        else System.out.println("The entered number doesn't exist in the array");
    }
}
