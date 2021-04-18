package TeachMeSkills;

import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {

        // Создайте массив строк. Заполните его произвольными именами людей.
        // Отсортируйте массив.
        // Результат выведите на консоль.

        String [] team = new String [] {"Vladimir", "Alex", "Nick", "Dzmitry", "Andrey", "Viktor", "Mary"};
        Arrays.sort(team);
        System.out.println(Arrays.toString(team));
    }

}
