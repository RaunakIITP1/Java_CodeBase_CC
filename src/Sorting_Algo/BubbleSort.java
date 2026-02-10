package Sorting_Algo;

public class BubbleSort {
    public static void main(String[] args) {

        // int [] arr= {27,17,2,12,38,46,64};
        int[] arr = { 10, 20, 30, 40, 50, 60, 100 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int sorted = -1;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = 0;
                }
            }
        }
        // for(int i=0;i<n;i++){
        // System.out.print(arr[i]+ " ");
        // }

        if (sorted == -1) {
            System.out.println("element is already sorted");

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

