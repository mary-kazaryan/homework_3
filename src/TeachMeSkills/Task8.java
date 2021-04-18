package TeachMeSkills;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {

        int[] array = new int[]{10, 30, 70, 90, 145, 5, 20};

        int obmen = 0;

        boolean sorted = false;
        while (!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;

                    obmen = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = obmen;
                }
            }

        }
        System.out.println(Arrays.toString(array));

    }
}
