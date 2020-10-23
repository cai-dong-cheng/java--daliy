package com.homework.day04;

import java.util.Arrays;

/**
 * @author CDC
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        String inStr = Arrays.toString(intArray);
        System.out.println(inStr);

        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"bbb", "aaa", "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        String str = "ajsgffju59ufjdhkiuji";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i =chars.length - 1 ;i >= 0 ; i--){
            System.out.print(chars[i]+" ");
        }
    }
}