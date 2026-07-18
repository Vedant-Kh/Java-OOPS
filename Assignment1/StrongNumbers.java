/*
Q5. find out wether a number is a strong number or not?
*/
import java.util.Scanner;

public class StrongNumbers {

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start: ");
        int start = sc.nextInt();

        System.out.print("Enter End: ");
        int end = sc.nextInt();

        System.out.println("Strong Numbers:");

        for (int i = start; i <= end; i++) {
            if (isStrong(i)) {
                System.out.println(i);
            }
        }
    }
}
