package ooplab8;

public abstract class Pet {
    private String name;
    private String age;
    //constructor

    public Pet(String name, String age) {
        this.name = name;
        this.age = age;
    }

    //abstract method
    public abstract void makeNoise();

    //toString
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    //getter and setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}//class