package ie.atu;

import jdk.jshell.PersistentSnippet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person user1 = new Person();
        Person user2 = new Person("John", "Dolan", 46);
        Person user3 = new Person();

        user1.getUserInput();
        user1.displayInfo();

        user2.displayInfo();

        user3.displayInfo();




        }
    }