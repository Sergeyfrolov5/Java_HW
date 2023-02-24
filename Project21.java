import java.util.Arrays;
import java.util.Random;

public class Project21 {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(9);
            
        }
        System.out.println(Arrays.toString(arr));
        int[] new_arr = new int[];
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                new_arr.append(arr[i]);
            }
        }
        System.out.println(Arrays.toString(new_arr));
        
    }

}

