package ie.atu;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name:" + firstName + "\nSurname:" + lastName + "\nAge:" + age);
    }
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Please enter surname: ");
        this.lastName = scanner.nextLine();

        System.out.println("Please enter age");
        this.age = scanner.nextInt();
    }
}

