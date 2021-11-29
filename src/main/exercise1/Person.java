package main.exercise1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    Person(String nameArg, LocalDate birthdayArg, Sex genderArg, String emailArg) {
        name = nameArg;
        birthday = birthdayArg;
        gender = genderArg;
        emailAddress = emailArg;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static List<Person> createPersonList() {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Fred", LocalDate.of(1980, 6, 20), Person.Sex.MALE, "fred@example.com"));
        personList.add(new Person("Jane", LocalDate.of(1990, 7, 15), Person.Sex.FEMALE, "jane@example.com"));
        personList.add(new Person("George", LocalDate.of(1991, 8, 13), Person.Sex.MALE, "george@example.com"));
        personList.add(new Person("Bob", LocalDate.of(2000, 9, 12), Person.Sex.MALE, "bob@example.com"));
        return personList;
    }
}




