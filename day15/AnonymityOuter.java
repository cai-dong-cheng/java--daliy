package com.homework.day15;


interface  AnonymityOuter {
    /**
     * 接口的方法全都是抽象的方法
     */
    public abstract void doOther();
}
class AnonymityText{
    public static void main(String[] args) {
        AnonymityOuter anonymityOuter = new AnonymityOuter()
//        下面的类就是匿名类，最后需要分号结束
        {
            @Override
            public void doOther() {
                System.out.println("这是一个匿名的类");
            }
        };
    }
}