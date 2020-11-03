package com.homework.day15;


enum  ColorsEnum {
    RED("红色",1),
    BLUE("蓝色",2),
    YELLOW("黄色",3),
    GREEN("绿色",4);
    ColorsEnum(){}
    ColorsEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }
    private String name;
    private int index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
class EnumTest{
    public static void main(String[] args) {
        System.out.println(ColorsEnum.BLUE.getName() + ColorsEnum.BLUE.getIndex());
    }
}
