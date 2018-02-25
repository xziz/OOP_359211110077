package ooplab8;

public class Rectangle implements Shape {
    private double weidth;
    private double length;

    public Rectangle(double weidth, double length) {
        this.weidth = weidth;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weidth=" + weidth +
                ", length=" + length +
                '}';
    }

    public double getWeidth() {
        return weidth;
    }

    public void setWeidth(double weidth) {
        this.weidth = weidth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return weidth*length;
    }
}