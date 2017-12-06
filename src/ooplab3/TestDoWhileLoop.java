package ooplab3;

import java.util.Scanner;

public class TestDoWhileLoop {
    public static void main(String[] args) {
//        do-while
        int pin = 1234;
        int input = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
//            statement
            System.out.print("Enter your password: ");
            input = scanner.nextInt();
            count++;
            if (input ==pin){
                System.out.println("Your password is correct");break;
            }
            if (count ==3){
                System.out.println("System error.");break;
            }
        } while (input != pin);

    } //main
} //class
