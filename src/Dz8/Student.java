package Dz8;

import Dz8.Address;

import java.util.Optional;

public class Student {
    private String name;
    private Optional<Address> address;

    Student(String name) {
        this.name = name;
    }

    Student(String name, Address address) {
        this.name = name;
        this.address = Optional.of(new Address(address.getCity(), address.getRegion()));
    }

    public String getName() {
        return name;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}