package com.homework.day15;


enum  ColorEnum {
    RED ,BLUE,YELLOW,GREEN
}
class EnumTes{
    public static void main(String[] args) {
//        关键是在这里
        ColorEnum colorEnum = ColorEnum.GREEN;
        switch (colorEnum){
            case RED:
                System.out.println("red");
                break;
            case BLUE:
                System.out.println("blue");
                break;
            case YELLOW:
                System.out.println("yellow");
                break;
            case GREEN:
                System.out.println("green");
                break;
            default:
                break;
        }
    }
}
