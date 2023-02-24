import java.util.*;

// 3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

public class Project23 {
    public static void main(String[] args) {
        int size = 10;
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            int val = rnd.nextInt(100);
            list1.add(val);
        }
        System.out.printf("Список: %s\n", list1);

        int max = list1.get(0);
        int min = list1.get(0);
        float average = 0;
        float average1 = 0;
        // System.out.printf("Максимальное число в списке: %d\n", max);
        for (int i = 1; i < size; i++) {
            if (max < list1.get(i)) {
                max = list1.get(i);
            }
        }
        for (int i = 1; i < size; i++) {
            if (min > list1.get(i)) {
                min = list1.get(i);
            }
        }
        for (int i = 0; i < size; i++) {
            average1 += list1.get(i);
            average = average1/size;
        }
        System.out.printf("Минимальное число: %d\n", min);
        System.out.printf("Максимальное число: %d\n", max);
        System.out.printf("Среднее арифметическое число: %.2f\n", average);
    }
        
}
