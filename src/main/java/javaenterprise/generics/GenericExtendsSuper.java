package javaenterprise.generics;

import java.util.Arrays;
import java.util.List;

public class GenericExtendsSuper {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("a", "A"), new Person("b", "B"),new Person("", "A"));
        GenericExtendsSuper s = new GenericExtendsSuper();
//        System.out.println(s.isValidList(persons, new PersonValidator()));

        List<Citizen> citizens = Arrays.asList(new Citizen("a", "A", "AA"), new Citizen("b", "B", ""),
                new Citizen("", "A", null));
        System.out.println(s.isValidList(citizens, new PersonValidator()));
    }

    public boolean isValidList(List<? extends Person> persons, Validator<Person> personValidator) { /// основая правка!!!
        for (Person p : persons) {
            if(!personValidator.isValid(p)) {
                return false;
            }
        }
        return true;
    }

    public interface Validator<T> {
        boolean isValid (T value);
    }

    public static class PersonValidator implements Validator<Person>{

        @Override
        public boolean isValid(Person value) {
            if (value.name == null || value.name.equals("") ||
                    value.name.equals(" ")) return false;
            else if (value.surname == null || value.surname.equals("") ||
                    value.surname.equals(" ")) return false;
            return true;
        }
    }

    public static class Person {
        String name;
        String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }

    public static class Citizen extends Person {

        String address;

        public Citizen(String name, String surname, String address) {
            super(name, surname);
            this.address = address;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
}
