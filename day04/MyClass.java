package com.homework.day04;

/**
 * @author CDC
 */
public class MyClass {
    int num ;
    static int numStatic;
    public void method(){
        System.out.println("这是一个成员方法");
        System.out.println(num);
        System.out.println(numStatic);

    }
    public static void methodStatic(){
        System.out.println("这是一个静态方法。");
        System.out.println(numStatic);
    }

}
