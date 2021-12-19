package com.udaan.lld.covid.demo.RiskCalculation;

import java.util.Set;

public class Assessment {

    boolean travelHistory;
    boolean contactWithPatient ;
    Set<String> symptoms;

    boolean isPatient = false;
    boolean isRecovered = false;

    public Assessment(boolean travelHistory, boolean contactWithPatient, Set<String> symptoms) {
        this.travelHistory = travelHistory;
        this.contactWithPatient = contactWithPatient;
        this.symptoms = symptoms;
    }

    public void setPatient(boolean patient) {
        isPatient = patient;
    }

    public void setRecovered(boolean recovered) {
        isRecovered = recovered;
    }

    public void setTravelHistory(boolean travelHistory) {
        this.travelHistory = travelHistory;
    }

    public void setContactWithPatient(boolean contactWithPatient) {
        this.contactWithPatient = contactWithPatient;
    }

    public void setSymptoms(Set<String> symptoms) {
        this.symptoms = symptoms;
    }

    public boolean isTravelHistory() {
        return travelHistory;
    }

    public boolean isContactWithPatient() {
        return contactWithPatient;
    }

    public Set<String> getSymptoms() {
        return symptoms;
    }

    public boolean isPatient() {
        return isPatient;
    }

    public boolean isRecovered() {
        return isRecovered;
    }
}
