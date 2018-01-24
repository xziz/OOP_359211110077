package ooplab7;

import java.util.Scanner;

public class studentapp {
    public static void main(String[] args) {
        //create object as student
        //default constructor
        student s1 = new student();
        s1.setId("001");
        s1.setName("Boy Saiyai");
        s1.setAddrass("109 M.1 T.Thamyai A.thungsong");
        s1.setGender("Male");

        System.out.println(s1.getName());
        System.out.println(s1.getGender());

        System.out.println(s1.toString());

        student s2 = new student("002", "Girl Saiyai",
                "11/11 T.tawang A.Muang",
                "Female");
        System.out.println(s2.toString());

        s2.setName("Girl Shongkla");
        System.out.println(s2.toString());

        //user assign data to object
        student s3 = new student();
        s3 = inputData(s3);
        System.out.println(s3.toString());
    }
    private static student inputData(student s){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a student info: ");
        System.out.print("Student ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Name: ");
        s.setName(scanner.nextLine());
        System.out.print("Address: ");
        s.setAddrass(scanner.nextLine());
        System.out.print("Gender: ");
        s.setGender(scanner.nextLine());
        return s;
    }

}//class
