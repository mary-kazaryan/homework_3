package TeachMeSkills;
import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        // Создайте массив и заполните массив.
        // Выведите массив на экран в строку.
        // Замените каждый элемент с нечётным индексом на ноль.
        // Снова выведете массив на экран на отдельной строке.

        int[] array = new int[]{1, 13, 17, 21, 25, 29};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array [i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

