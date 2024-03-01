package Day_1;
import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            // swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted 
            // if (!swapped) {
            //     break;
            // }
        }
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=ob.nextInt();
        int[] arr =  new int[n];
        System.out.println("Enter Elements");
        for(int i =0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        ob.close();
    }
}