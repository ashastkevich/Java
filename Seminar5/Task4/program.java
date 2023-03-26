package Seminar5.Task4;

import java.util.Arrays;

/*
 * На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 */
public class program {
    public static void main(String[] args) {
        int[][] rooks = new int[8][2];
        for (int i = 0; i < rooks.length; i++) {
            for (int j = 0; j < rooks[0].length; j++) {
                rooks[i][j] = i;
            }
        }
        System.out.println(Arrays.deepToString(rooks));
    }
}
