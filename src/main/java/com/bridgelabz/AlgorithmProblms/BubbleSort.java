package com.bridgelabz.AlgorithmProblms;

public class BubbleSort {
    void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    /* Prints the array */
    void printArray(int[] arr)
    {
        int n = arr.length;
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String[] args)
    {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {5,56,78,41,21,55,3,88,2,47,1};
        System.out.print("Before Bubble Sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        bubbleSort.bubbleSort(arr);
        System.out.print("Bubble Sort array: ");
        bubbleSort.printArray(arr);
    }
}
