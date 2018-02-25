package ooplab8;

import javax.swing.text.Position;

public class Employee extends Person {
    private String position;
    private String Salary;

    public Employee(String name, String gender, String dateofBirth, int age, String position, String Salary) {
        super(name, gender, dateofBirth,age);
        this.position = position;
        this.Salary = Salary;
    }
    //tosting

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", Salary='" + Salary + '\'' +
                '}'+ super.toString();
    }
    //getter and setter method

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }
}
