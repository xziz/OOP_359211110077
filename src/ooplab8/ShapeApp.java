package ooplab8;
public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 30);
        System.out.println(rectangle.toString());
        System.out.println("object area: "+rectangle.getArea());
    }//main
}//class