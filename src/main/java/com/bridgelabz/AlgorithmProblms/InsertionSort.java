package com.bridgelabz.AlgorithmProblms;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    public static void main(String[] args){
        int[] arr = {5,56,78,41,21,55,3,88,2,47,1};
        System.out.println("Before Insertion Sort");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        insertionSort(arr);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
