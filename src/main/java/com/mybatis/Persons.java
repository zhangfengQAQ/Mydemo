package com.mybatis;

public class Persons {
    int Id_p;
    String LastName;
    String FirstName;
    String Address;
    String City;

    public Persons(int id_p, String lastName, String firstName, String address, String city) {
        Id_p = id_p;
        LastName = lastName;
        FirstName = firstName;
        Address = address;
        City = city;
    }

    public int getId_p() {
        return Id_p;
    }

    public void setId_p(int id_p) {
        Id_p = id_p;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
