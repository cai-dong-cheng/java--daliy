package com.homework.day01;

/**
 * @author CDC
 */
public class BubbleSort {
    public static void bubbleSort(int[]a,int n){
        int j,i ;
        for (i=0;i<n;i++){
            for (j=1;j<n-i;j++){
                if (a[j-1]>a[j]){
                    int temp ;
                    temp =a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr ={1,1,2,0,9,3,12,7,8,3,4,65,22};
        BubbleSort.bubbleSort(arr,arr.length);
/*
        int  i = 0;
        for(int j = 0; j<arr.length;j++){
        i = arr[j]
 */
        for (int i : arr){
            System.out.println(i + ",");
        }
    }
}
