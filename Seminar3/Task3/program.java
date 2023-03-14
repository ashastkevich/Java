package Seminar3.Task3;
/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */

import java.util.ArrayList;
import java.util.Collections;


public class program {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int count = 11;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            ar.add((int) (Math.random()*10));
        }
        System.out.println(ar);
        System.out.println("Max element: " + Collections.max(ar));
        System.out.println("Min element: " + Collections.min(ar));
        for (Integer elem : ar) {
            sum = sum + elem;
        }
        System.out.println("Average: " + sum/count);

    }
}
