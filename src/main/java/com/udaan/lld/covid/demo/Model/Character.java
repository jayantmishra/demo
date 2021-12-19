package com.udaan.lld.covid.demo.Model;

import com.udaan.lld.covid.demo.RiskCalculation.Assessment;
import org.springframework.stereotype.Component;

@Component
public class Character {

    public String name;
    public String phoneNumber;
    public String pinCode;
    public Boolean isAdmin;

    public Assessment assessment = null;

    public Character(String name, String phoneNumber, String pinCode, Boolean isAdmin) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pinCode = pinCode;
        this.isAdmin = isAdmin;
    }

    public Character(String name, String phoneNumber, String pinCode, Boolean isAdmin, Assessment assessment) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pinCode = pinCode;
        this.isAdmin = isAdmin;
        this.assessment = assessment;
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

    public Assessment getAssessment() {
        return assessment;
    }
}
