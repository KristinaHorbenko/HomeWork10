package Phonebook;

public class Main {
    private static String name;

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Jack", "+38073 000 00 01");
        phoneBook.add("Kelly", "+38073 111 00 05");
        phoneBook.add("James", "+38073 000 00 02");
        phoneBook.add("Jack", "+38073 222 00 01");
        phoneBook.add("Kelly", "+38073 111 22 05");
        phoneBook.add("Tom", "+38073 444 11 33");


         name = "Jack";

         System.out.println(phoneBook.find(name));
         System.out.println("____________________________");
         System.out.println(phoneBook.findAll(name));

    }
}
