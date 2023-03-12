package Task3;
/*
 * Реализовать простой калькулятор
 */

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a =scanner.nextInt();
        System.out.println("Введите число b: ");
        int b =scanner.nextInt();
        System.out.println("Введите операцию (+ - * /): ");
        String opr =scanner.next();
        switch (opr) {
            case "+":
                int c1 = a + b;
                System.out.printf("%d %s %d = %d", a, opr, b, c1);
                break;
            case "-":
                int c2 = a - b;
                System.out.printf("%d %s %d = %d", a, opr, b, c2);
                break;
            case "*":
                int c3 = a * b;
                System.out.printf("%d %s %d = %d", a, opr, b, c3);
                break;
            case "/":
                int c4 = a / b;
                System.out.printf("%d %s %d = %d", a, opr, b, c4);
                break; 
        }
       scanner.close(); 
    }
}
