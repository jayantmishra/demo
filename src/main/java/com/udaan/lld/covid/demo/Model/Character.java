package com.udaan.lld.covid.demo.Model;

import org.springframework.stereotype.Component;

@Component
public class Character {

    String name;
    String phoneNumber;
    String pinCode;
    Boolean isAdmin;

    public Character(String name, String phoneNumber, String pinCode, Boolean isAdmin) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pinCode = pinCode;
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }
}
