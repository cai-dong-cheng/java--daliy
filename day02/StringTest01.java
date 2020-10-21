package com.homework.day02;

/**
 * @author CDC
 */
public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "abc";

        s1 = "def" ;
        String s2 = "hello";
        String s3 = "hello";
        System.out.println(s2 == s3);
        String s4 = new String ( "abc");
        String s5 = new String("abc");
        System.out.println(s4 == s5);
        String S6 = "aaa";
        String S7 = "bbb";
        String S8 = S6 +S7 ;
    }
}
