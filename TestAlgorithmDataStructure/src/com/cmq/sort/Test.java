package com.cmq.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: cmq
 * @date: 8/3/2024 - 08 - 03 - 1:28 AM
 * @version: 1.0
 */
public class Test {
    static boolean sorted(int[] s){
        if (s.length < 2) return true;
        for (int i=0;i<s.length-1;i++) {
            if (s[i]>s[i+1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr1 = {34, 67, 23, 89, 12, 56, 78, 90, 45, 22};
        int[] arr2 = {7, 15, 93, 28, 41, 66, 74, 58, 32, 91};
        int[] arr3 = {56, 24, 89, 73, 12, 40, 38, 50, 85, 94};
        int[] arr4 = {29, 82, 65, 47, 31, 68, 9, 20, 57, 76};
        int[] arr5 = {11, 99, 63, 21, 37, 46, 84, 52, 33, 80};
        Sort.quickSort(arr1);
        Sort.quickSort(arr2);
        Sort.quickSort(arr3);
        Sort.quickSort(arr4);
        Sort.quickSort(arr5);
        System.out.println(sorted(arr1));
        System.out.println(sorted(arr2));
        System.out.println(sorted(arr3));
        System.out.println(sorted(arr4));
        System.out.println(sorted(arr5));
        System.out.println("-------------------------------------------------");
        int[] arr6 = {34, 67, 23, 89, 12, 56, 78, 90, 45, 22};
        int[] arr7 = {7, 15, 93, 28, 41, 66, 74, 58, 32, 91};
        int[] arr8 = {56, 24, 89, 73, 12, 40, 38, 50, 85, 94};
        int[] arr9 = {29, 82, 65, 47, 31, 68, 9, 20, 57, 76};
        int[] arr10 = {11, 99, 63, 21, 37, 46, 84, 52, 33, 80};
        Sort.mergeSort(arr6);
        Sort.mergeSort(arr7);
        Sort.mergeSort(arr8);
        Sort.mergeSort(arr9);
        Sort.mergeSort(arr10);
        System.out.println(sorted(arr6));
        System.out.println(sorted(arr7));
        System.out.println(sorted(arr8));
        System.out.println(sorted(arr9));
        System.out.println(sorted(arr10));
        System.out.println("-----------------test heapSort------------------------");
        int[] arr11 = {34, 67, 23, 89, 12, 56, 78, 90, 45, 22};
        int[] arr12 = {7, 15, 93, 28, 41, 66, 74, 58, 32, 91};
        int[] arr13 = {56, 24, 89, 73, 12, 40, 38, 50, 85, 94};
        int[] arr14 = {29, 82, 65, 47, 31, 68, 9, 20, 57, 76};
        int[] arr15 = {11, 99, 63, 21, 37, 46, 84, 52, 33, 80};
        Sort.heapSort(arr11);
        Sort.heapSort(arr12);
        Sort.heapSort(arr13);
        Sort.heapSort(arr14);
        Sort.heapSort(arr15);
        System.out.println(sorted(arr11));
        System.out.println(sorted(arr12));
        System.out.println(sorted(arr13));
        System.out.println(sorted(arr14));
        System.out.println(sorted(arr15));


    }
}
