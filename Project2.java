// 2. Вывести все простые числа от 1 до 1000

package Task01;

public class Project2 {
    public static void main(String[] args) {
        simpleDigits(20);    
        
    }
    public static void simpleDigits(int y) {
        for (int i = 2; i <= y; i++) {
            if (simple(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean simple(int i) {
        return false;
    }

}
