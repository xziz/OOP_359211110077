package ooplab8;

public class Triangle implements Shape {
    private double half;
    private double high;
    private double base;

    public Triangle(double half, double high,double base){
        this.half = half;
        this.high = high;
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "half=" + half +
                ", high=" + high +
                ", base=" + base +
                '}';
    }

    public double getHalf() {
        return half;
    }

    public void setHalf(double half) {
        this.half = half;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return half*high*base ;
    }
}