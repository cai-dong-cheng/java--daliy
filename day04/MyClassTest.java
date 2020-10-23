package com.homework.day04;

/**
 * @author CDC
 */
public class MyClassTest {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();
        MyClass.methodStatic();
        myMethod();
        MyClassTest.myMethod();
    }

    private static void myMethod() {
        System.out.println("自己的方法");
    }
}
