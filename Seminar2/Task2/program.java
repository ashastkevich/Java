package Seminar2.Task2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class program {
    public static int[] bubbleSort(int[] arr) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(program.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    logger.info(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) throws SecurityException, IOException {
        int [] ar = {11, 3, 14, 16, 7};
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(bubbleSort(ar)));
    }
}
