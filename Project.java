// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)

/**
 * project
 */
public class Project {
    public static void main(String[] args) {
        int num4 = 5;
        int factorial1 = factorial(num4);
        System.out.println(factorial1);

        int number1 = number(num4);
        System.out.println(number1);
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int number(int num2) {
        int num3 = num2 * (num2 + 1) / 2;
        return num3;
    }
}