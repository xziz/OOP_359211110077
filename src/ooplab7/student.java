package ooplab7;
//talking about student?
// 1.student ID
// 2.name
// 3.address
// 4.gender

import javax.print.DocFlavor;

public class student {
    //properties of student
    private String id;
    private String name;
    private String addrass;
    private String gender;
    //constructor
    //default constructor
    public student(){}
    //constructor by own
    public student(String id, String n, String a,String g){
        //assign data to propeties
        this.id = id;
        this.name = n;
        this.addrass = a;
        this.gender = g;
    }//student
    //getter and setter methods

    @Override
    public String toString() {
        return "student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", addrass='" + addrass + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddrass() {
        return addrass;
    }

    public void setAddrass(String addrass) {
        this.addrass = addrass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
} //class
