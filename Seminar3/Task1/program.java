package Seminar3.Task1;
/*
 * Реализовать алгоритм сортировки слиянием
 */
import java.util.Arrays;

public class program {

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, left.length, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }
    private static int[] merge(int[] left, int[] right) {
        int resIn = 0, leftIn = 0, rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length)
            if (left[leftIn] < right[rightIn])
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        return result;
    }
    public static void main(String[] args) {
        int [] ar = {11, 3, 14, 16, 7, 9, 12, 5, 1, 9};
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(mergeSort(ar)));
    }
}
