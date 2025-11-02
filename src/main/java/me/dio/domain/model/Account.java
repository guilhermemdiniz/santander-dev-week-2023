package me.dio.domain.model;

public class Account {
    public String number;
    public String agency;
    public Float balance;
    public Float limit;

    public Account(String number, String agency, Float balance, Float limit) {
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.limit = limit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Float getLimit() {
        return limit;
    }

    public void setLimit(Float limit) {
        this.limit = limit;
    }
}
