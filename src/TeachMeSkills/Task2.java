package TeachMeSkills;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
        // Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
        // В результате должен быть новый массив без указанного числа.

        int[] array2 = new int[]{10, 30, 20, 50, 40, 70, 60, 90};

        Scanner entered = new Scanner(System.in);
        int entered_num = entered.nextInt();

        Arrays.sort (array2);

        int position = Arrays.binarySearch(array2, entered_num);

        if (position >= 0) {
            System.out.println("The entered number has been deleted from the array");
            array2[entered_num] = 0;
        }
        else System.out.println("The entered number doesn't exist in the array");
        }
    }

