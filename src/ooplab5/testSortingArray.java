package ooplab5;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class testSortingArray {
    private static final int MAX = 5;
    private static int number[] = new int[MAX];

    public static void main(String[] args) {
        inputData(number, number.length);
        showData(number, number.length);
        sortingDataAscending(number);
//        even(number);


    }//main

//    public static void even(int[] number) {
//        System.out.print("Even number: ");
//        for (int i=number){
//            if (i%2==0||i%4==0||i%6==0)
//                System.out.print(i+" ");
//        }
//    }
    private static void sortingDataAscending(int[] number) {
        System.out.println("Ascending Order: ");
        Arrays.sort(number);
        showData(number,number.length);
    }//sortingData

    private static void inputData(int[] number, int length) {
        //user input data
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<length;i++)
        {
            System.out.print("Enter an integer["+i+"]: ");
            number[i] = scanner.nextInt();
        }
    }//inputData

    private static void showData(int[] number, int length) {
        System.out.print("Data in array: ");
        for(int i=0;i<length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();

    }//showData




} //class

