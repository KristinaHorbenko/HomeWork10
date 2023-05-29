package Phonebook;

import java.util.ArrayList;

public class PhoneBook {
    private static ArrayList<Subscriber> subscribers;

    public PhoneBook() {

        this.subscribers = new ArrayList<>();
    }

    public void add(String name, String phone) {
        Subscriber subscriber = new Subscriber(name, phone);
        subscribers.add(subscriber);
       // System.out.println(subscriber.getName() + " " + subscriber.getPhone());
    }


    public static Subscriber find(String name) {
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getName().equals(name)) {

                return subscriber;
            }
        }

        return null;
    }

    public ArrayList<Subscriber> findAll(String name) {
        ArrayList<Subscriber> foundSubscriber = new ArrayList<>();

        for (Subscriber subscriber : subscribers) {
            if (subscriber.getName().equalsIgnoreCase(name)) {
                foundSubscriber.add(subscriber);

            }
        }
        if (foundSubscriber.isEmpty()) {
            return null;
        } else {
            return foundSubscriber;

        }
    }
}






