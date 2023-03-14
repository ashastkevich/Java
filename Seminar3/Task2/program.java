package Seminar3.Task2;

import java.util.ArrayList;

public class program {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int count = 11;
        for (int i = 0; i < count; i++) {
            ar.add((int) (Math.random()*10));
        }
        System.out.println(ar);
        for (int i = 0; i < ar.size(); i++) {
           if ((ar.get(i) % 2) == 0) {
                ar.remove(i);
                i--;
           }
        }
        System.out.println(ar);
    }
}
