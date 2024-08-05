package com.cmq.sort;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author: cmq
 * @date: 8/3/2024 - 08 - 03 - 1:22 AM
 * @version: 1.0
 */
public class Sort {
    public static void quickSort(int[] s) {
        quickSortHelp(s, 0, s.length-1);
    }
    private static void quickSortHelp(int[] s, int low, int high) {
        if (low<high) {
            int pi = partition(s, low, high);
            quickSortHelp(s, low, pi-1);
            quickSortHelp(s, pi+1, high);
        }
    }
    private static int partition(int[] s, int low, int high) {
        int pivot = s[high];
        int partitionIndex = low-1;

        for (int i=low;i<high;i++) {
            if (s[i]<=pivot) {
                partitionIndex++;
                swap(s, partitionIndex, i);
            }
        }
        partitionIndex++;
        swap(s, partitionIndex, high);
        return partitionIndex;
    }

    private static void swap(int[] s, int a, int b) {
        int temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }

    public static void mergeSort(int[] s){
        mergeSortHelp(s, 0, s.length-1);
    }

    private static void mergeSortHelp(int[] s, int low, int high) {
        if (low<high) {
            int mid = low + (high-low)/2;
            mergeSortHelp(s, low, mid);
            mergeSortHelp(s, mid+1, high);

            merge(s, low, mid, high);
        }

    }

    private static void merge(int[] s, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int count = 0;
        int i1 = low;
        int i2 = mid+1;
        while (i1<=mid && i2<=high) {
            if (s[i1] <= s[i2]) {
                temp[count] = s[i1];
                i1++;
            } else {
                temp[count] = s[i2];
                i2++;
            }
            count++;
        }
        while (i1<=mid) {
            temp[count] = s[i1];
            i1++;
            count++;
        }
        while (i2<=high) {
            temp[count] = s[i2];
            i2++;
            count++;
        }
        for (int i=0;i<temp.length;i++) {
            s[i+low] = temp[i];
        }
    }

    public static void heapSort(int[] s) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i:s) {
            pq.add(i);
        }
        int count = 0;
        while (pq.size()>0) {
            s[count++] = pq.poll();
        }
    }

}
