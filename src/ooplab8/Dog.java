package ooplab8;

public class Dog extends Pet{

    public Dog(String name, String age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}//class