package ooplab8;

public class TriangleApp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle (0.5, 30,40);
        System.out.println(triangle.toString());
        System.out.println("object area: "+triangle.getArea());
    }//main
}//class