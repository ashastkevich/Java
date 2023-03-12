package Task2;
/*
 * Вывести все простые числа от 1 до 1000
 */
public class program {
    public static void main(String[] args) {
        System.out.println(1);
        boolean simple = true;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) System.out.println(i);
            else simple = true;
        }
    }
}
