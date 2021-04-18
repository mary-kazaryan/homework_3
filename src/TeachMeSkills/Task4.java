package TeachMeSkills;
import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        // Создайте 2 массива из 5 чисел.
        // Выведите массивы на консоль в двух отдельных строках.
        // Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        // для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

        int[] array1 = new int[]{10, 20, 30, 40, 50};
        int[] array2 = new int[]{120, 100, 80, 60, 40};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        double average1 = 0;
        double average2 = 0;

        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < 5; i++) {
            average1 = array1[i] + 1;
            average2 = array2[i] + 1;
        }

        average1 = average1 / 5;
        average2 = average2 / 5;

        // System.out.println("Среднее арифметическое первого массива: " + average1);
        // System.out.println("Среднее арифметическое второго массива: " + average2);

        if (average1 > average2) {
            System.out.println("Среднее арифметичекое первого массива больше второго массива");}
            else if (average2 > average1) {
                System.out.println("Среднее арифметичекое второго массива больше первого массива");}
            else System.out.println("Средние арифметические значения обоих массивов равны");
    }
}
