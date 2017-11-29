package ooplab3;

public class TestCondition {

    public static void main(String[] args) {
//      if
        int x = 10, y = 20;
        if (x > y)
            System.out.print("x less than y");
        System.out.print("OOP");

//            if-else
        x = 30;
        if (x < y)
            System.out.print("x less than y");
        else
            System.out.print("x more than y");
//        if-else-if
        if (x < 30)
            System.out.print("x less than 30");
        else if (x > 30)
            System.out.print("x more than 30");
        else
            System.out.print("x equal 30");


    } //main


} //class
