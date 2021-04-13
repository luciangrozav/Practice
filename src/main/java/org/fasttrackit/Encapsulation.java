package org.fasttrackit;

public class Encapsulation {

    private String country;
    private int year;

    private int privateconsumption;
    private int grossinvestment;
    private int governmentinvestment;
    private int governmentspending;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGovernmentinvestment() {
        return governmentinvestment;
    }

    public void setGovernmentinvestment(int governmentinvestment) {
        this.governmentinvestment = governmentinvestment;
    }

    public int getGrossinvestment() {
        return grossinvestment;
    }

    public void setGrossinvestment(int grossinvestment) {
        this.grossinvestment = grossinvestment;
    }

    private int exports;
    private int imports;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrivateconsumption() {
        return privateconsumption;
    }

    public void setPrivateconsumption(int privateconsumption) {
        this.privateconsumption = privateconsumption;
    }


    public int getGovernmentspending() {
        return governmentspending;
    }

    public void setGovernmentspending(int governmentspending) {
        this.governmentspending = governmentspending;
    }

    public int getExports() {
        return exports;
    }

    public void setExports(int exports) {
        this.exports = exports;
    }

    public int getImports() {
        return imports;
    }

    public void setImports(int imports) {
        this.imports = imports;
    }
}

// GrossDomesticProduct - calculation






