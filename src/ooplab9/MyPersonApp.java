package ooplab9;

public class MyPersonApp {
    public static void main(String[] args) {
        Person person = new Person("11212", "Aziz",
                new Address("128 m2", "Narathiwat", "96150"),
                new Job("Programer",30000));

        System.out.println(person.toString());
    }


}
