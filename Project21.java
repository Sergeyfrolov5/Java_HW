import java.util.*;

// 1.Реализовать алгоритм сортировки слиянием

public class Project21 {
    public static void main(String[] args) {
        
        
        int[] arr1 = {7, 85, 79, 64, 4, 9, 38, 90, 89, 53};

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr1));

        int[] sort = sortMerge(arr1);
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(sort));

        // mergeSort(my_list, 0, my_list.size());

        // System.out.println(my_list);
    }
    public static int[] sortMerge(int[] arr) {
        if (arr == null) {
            System.out.println("Массив пуст");
            return null;
        }
        if (arr.length < 2) {
            return arr;
        }
        int[] left = new int[arr.length/2];
        int[] right = new int[arr.length-(arr.length/2)];
        System.arraycopy(arr, 0, left, 0, arr.length/2);
        System.arraycopy(arr, arr.length/2, right, 0, arr.length - (arr.length/2));

        return merge(sortMerge(left), sortMerge(right));
    }
    public static int[] merge(int a[], int b[]) {
        int[] res = new int[a.length+b.length];
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                res[k] = a[i];
                i++;
            }
            else {
                res[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }
}
