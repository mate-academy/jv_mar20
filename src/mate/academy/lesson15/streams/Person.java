package mate.academy.lesson15.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Person {
    private int age;
    private String name;
    private Address address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address {
    private String city;
    private String street;
    private List<String> oldStreetNames; //декомунізація :)

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public List<String> getOldStreetNames() {
        return oldStreetNames;
    }

    public void setOldStreetNames(List<String> oldStreetNames) {
        this.oldStreetNames = oldStreetNames;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", oldStreetNames=" + oldStreetNames +
                '}';
    }
}

class StreamApiExample {
    public static void main(String[] args) {
        Person alisa = new Person();
        alisa.setAge(20);
        alisa.setName("Alisa");

        Address alisaAddress = new Address();
        alisaAddress.setCity("Kyiv");
        alisaAddress.setStreet("Shevchenka");
        alisaAddress.setOldStreetNames(List.of("Old name 1", "Old name 2"));

        alisa.setAddress(alisaAddress);

        Person alisaNull = new Person();
        alisaNull.setAge(19);
        alisaNull.setAddress(null);

        Person bob = new Person();
        bob.setAge(42);
        bob.setName("Bob");

        Address bobAddress = new Address();
        bobAddress.setCity("Kyiv");
        bobAddress.setStreet("Sadova");
        bobAddress.setOldStreetNames(List.of("Old sadova 1", "Old sadova 2"));

        bob.setAddress(bobAddress);

        List<Person> persons = new ArrayList<>();
        persons.add(alisa);
        persons.add(bob);
        persons.add(alisaNull);

        //List all old streets for persons who live in Kyiv
        // and is younger than 25 and old street name contains "1"

        List<String> streets = persons
                .stream()
                .filter(p -> p.getAge() < 25)
                .peek(p -> System.out.println(p.toString()))
                .map(Person::getAddress)
                .filter(Objects::nonNull)
                .filter(a -> a.getCity().equalsIgnoreCase("Kyiv"))
                .flatMap(a -> a.getOldStreetNames().stream())
                .filter(s -> s.contains("1"))
                .collect(Collectors.toList());

        System.out.println(streets);
    }
}
