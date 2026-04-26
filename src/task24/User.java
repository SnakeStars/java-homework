package task24;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

public class User implements Comparable<User> {
    @Getter
    private final int id;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private String country;

    public User(int id, String firstName, String lastName, int age, String country) {
        if (age < 0) {
            throw new RuntimeException("age can not be negative");
        }

        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "User{" + firstName + " " + lastName + " "+ age + "лет" + "}";
    }
}
