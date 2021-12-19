package com.udaan.lld.covid.demo.Model;

public class Zone {


    String color;
    int caseCount;

    public Zone(String color, int caseCount) {
        this.color = color;
        this.caseCount = caseCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCaseCount() {
        return caseCount;
    }

    public void setCaseCount(int caseCount) {
        this.caseCount = caseCount;
    }
}
