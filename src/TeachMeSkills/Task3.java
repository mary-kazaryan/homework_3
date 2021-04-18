package TeachMeSkills;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Task3 {

    public static void main(String[] args) {

        // Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
        // Для генерации случайного числа используйте метод Math.random().
        // Пусть будет возможность создавать массив произвольного размера.
        // Пусть размер массива вводится с консоли.

        // У меня ощущение, что я построила эту программы просто на костылях.
        // Но она работает, черт возьми!

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        double[] arrays3 = new double[num];

        for (int i = 0; i < num; i++) {
            arrays3 [i] = Math.random();
        }
        System.out.println(Arrays.toString(arrays3));

        Arrays.sort(arrays3);

        System.out.println("Minimal value is: " + arrays3[0]);
        System.out.println("Maximum vale is: " + arrays3[arrays3.length - 1]);
        System.out.println("Middle value is: " + arrays3[(arrays3.length - 1)/2]);

    }

}


