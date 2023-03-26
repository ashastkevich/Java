package Seminar5.Task3;
/*
 * Реализовать алгоритм пирамидальной сортировки (HeapSort)
 */

 public class program {

    public static void heapSort(int[] arr) {
        int n = arr.length;
    
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
    
        // Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
    
            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // Left child
        int r = 2 * i + 2; // Right child
    
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
    
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
    
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
    
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 0, 12, 34, 87, 12, 3};
        int n = arr.length;

        // HeapSort the array
        heapSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        
    }
}
