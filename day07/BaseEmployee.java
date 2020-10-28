package com.homework.day07;

public abstract class BaseEmployee {
    public void print(){

        System.out.println("This is an abstract class.");
    }

    /**
     * 发工资
     * @return int
     *
     */

    public abstract int getSalary();
}
