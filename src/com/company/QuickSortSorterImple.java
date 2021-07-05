package com.company;

import java.util.Comparator;

public class QuickSortSorterImple {

    public static <T> void sort(T[] arr, Comparator<T> c) {
        //QuickSort
        quickSort(arr,0,arr.length-1,c);
    }

    public static <T> void swap(T[] arr, int i, int j){
        T temp = (T) arr[i];
        arr[i] = arr[j];
        arr[j] = (T) temp;
    }

    public static <T> int partition(T[] arr, int low, int high,Comparator<T> c){
        int pivot = high;
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++){
            if(c.compare((T) arr[j],(T) arr[pivot]) < 0){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static <T> void quickSort(T[] arr, int low, int high,Comparator<T> c){
        if (low < high){
            int pi = partition(arr, low, high, c);
            quickSort(arr, low, pi - 1, c);
            quickSort(arr, pi + 1, high, c);
        }
    }
}
