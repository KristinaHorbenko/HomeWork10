package Phonebook;

import java.util.Objects;

public class Subscriber {
    private String name;
    private String phone;

    public Subscriber(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscriber subscriber)) return false;
        return Objects.equals(getName(), subscriber.getName()) && Objects.equals(getPhone(), subscriber.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhone());
    }

    @Override
    public String toString() {
        return "Subscriber: " + name + " " + phone;
    }
}

