package com.awesam;

import java.util.Arrays;

public class SortingAlgo {
    static void selectionsort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]<arr[min])min=j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    static  int[] mergeSort(int[]arr1, int[]arr2,int n,int m) {
        int [] result=new int[n+m];
        int i=0,j=0,k=0;
        while (i<n&&j<m){
            if (arr1[i]<arr2[j]){
               result[k]=arr1[i];
               i++;
            }
            else {
                result[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i<n){
            result[k]=arr1[i];
            i++;
            k++;
        }
        while (j<m){
            result[k]=arr1[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String [] args){
        int [] arr1 = {4,1,8,2,9,3,7,4};
        System.out.print("Before sorting");
        System.out.println(Arrays.toString(arr1));

        System.out.print("After sorting");
        selectionsort(arr1);
        System.out.println(Arrays.toString(arr1));

        int [] arr2 = {5,6,7,8};
        System.out.print("Array 2: ");
        System.out.println(Arrays.toString(arr2));
        int n = arr1.length;
        int m = arr2.length;
        System.out.print("After merging");
        System.out.println(Arrays.toString(mergeSort(arr1,arr2,n,m)));


    }
}
