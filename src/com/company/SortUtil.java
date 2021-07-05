package com.company;

public class SortUtil <T>{
    public static <T> void ordenar(IPrecedable<T> arr[]){
        //bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j+1].precedeA((T) arr[j])!=1) {
                    IPrecedable<T> aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    };
}
