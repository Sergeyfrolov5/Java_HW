import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;

// 2 . Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class Project12 {
    public static void main(String[] args) throws SecurityException, IOException {
        int number = 20;
        int size = 10;
        int[] arr = new int[size];
        // ArrayList<Object> list = new ArrayList<Object>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(number);
            System.out.println(arr[i]);
        }
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        Logger logger = Logger.getLogger(Project12.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("logProject12.txt");
        // logger.addHandler(ch);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        // XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        // ch.setFormatter(xml);
        // fh.setFormatter(xml);

        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

        int[] newArr = orderArray(arr);
        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] orderArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
