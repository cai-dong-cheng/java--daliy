package com.homework.day15;

public class Outclass {
    public void doOther(){
        class InnerClass{
            InnerClass(String name){
                System.out.println("这是一个局部类的方法" + name);
            }
        }
        new InnerClass("zj");
        System.out.println("这是一个外部类方法");
    }
}
class TestClass{
    public static void main(String[] args) {
        new Outclass().doOther();
    }
}

