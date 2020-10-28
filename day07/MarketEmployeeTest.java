package com.homework.day07;

import static junit.framework.TestCase.assertEquals;

public class MarketEmployeeTest {
         public void print(){
             MarketEmployee me = new MarketEmployee("admin");
             me.print();
         }
         public void getSalary(){
             MarketEmployee me = new MarketEmployee("admin");
             int salary = me.getSalary();
             assertEquals(3000,salary);

             BaseEmployee you = new MarketEmployee("user");
             assertEquals(1000,you.getSalary());

         }

}
