package lesson11;

import java.util.Objects;

public class Author {

    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return getName() + " " + getSurname();
    }

    public boolean equals(Object x) {
        if (this.getClass() != x.getClass()) {
            return false;
        }
        Author tolkin = (Author) x;
        return name.equals(tolkin.name);

    }

    public int hashCode() {
        return Objects.hash(name);

    }
}
