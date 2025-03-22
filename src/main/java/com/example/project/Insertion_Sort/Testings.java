package com.example.project.Insertion_Sort;

import java.util.Arrays;

public class Testings {
    public static void main(String[] args) {
        int[] arrA = {38,8,28,81,25,94,44,11,41,74,36,35,91,58,22,98,2,64,21,90};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();

        int[] arrB = {38,8,28,81,25,94,44,11,41,74,36,35,91,58,22,98,2,64,21,90};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));


    }
}
