// 2.Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.*;

public class Project22 {
    public static void main(String[] args) {
        int size = 10;
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int val = rnd.nextInt(9);
            list1.add(val);
        }
        System.out.printf("Первоначальный список: %s\n", list1);
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами: %s\n", list1);
        
    }

}

