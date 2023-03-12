package Task1;

import java.util.Scanner;

/**
 * program
 */
public class program {

    public static int factorial(int n) {
        if (n == 0){
            return 1;
        }
        return factorial(n-1) * n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n1: ");
        int n1 =scanner.nextInt();
        System.out.println(0.5 * n1 * (n1 + 1));
        System.out.println("Введите число n2: ");
        int n2 =scanner.nextInt();
        System.out.println(factorial(n2));
        scanner.close();
    }
}