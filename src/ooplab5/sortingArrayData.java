package ooplab5;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class sortingArrayData {
    private static final int MAX = 10;
    private static int number[] = new int[MAX];
    public static void main(String[] args) {
        inputdata(number,number.length);
        showData(number,number.length);
        findMaxData(number);
        findMinData(number);
        System.out.println("Before sorting: ");
        //ascending order
        sortingDataAscending(number);
        //sortingDataDecending(number);

    }//main

//    private static void sortingDataDecending(int[] number) {
//        System.out.println("decending Order: ");
//        Integer[] num =
//        Arrays.sort(number, Collections.reverseOrder());
//        showData(number,number.length);
//    }//sortingdataascending

    private static void sortingDataAscending(int[] number) {
        System.out.println("Ascending Order: ");
        Arrays.sort(number);
        showData(number,number.length);
    }//sortingdataascending



    private static void findMinData(int[] number) {
        int min=number[0];
        for (int i =0;i<number.length;i++){
            if (min>=number[i])
                min = number[i];
        }//for
        System.out.println("The minimum data: "+ min);
    }//Min

    private static void findMaxData(int[] number) {
        int max=number[0];
        for (int i =0;i<number.length;i++){
            if (max<=number[i])
                max = number[i];
        }//for
        System.out.println("The maximum data: "+ max);
    }



    //showdata
    private static void showData(int[] number, int length) {
        System.out.print("Data in array: ");
        for (int i=0;i<length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }//showdata

    private static void inputdata(int[] number, int length) {
        // user input data
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            System.out.print("Enter an integer[" + i + "]: ");
            number[i] = scanner.nextInt();
        }
    }
} //class
