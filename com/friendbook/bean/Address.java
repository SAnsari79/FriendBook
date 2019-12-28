package com.friendbook.bean;

public class Address {

    int houseFlatNumber;
    String houseName;
    String street1;
    String city;
    String state;
    String country;
    int pinCode;

    public Address() {};

    public Address(int houseFlatNumber, String houseName, String street1, String city, String state, String country, int pinCode) {
        this.houseFlatNumber = houseFlatNumber;
        this.houseName = houseName;
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }


    public int getHouseFlatNumber() {
        return houseFlatNumber;
    }

    public void setHouseFlatNumber(int houseFlatNumber) {
        this.houseFlatNumber = houseFlatNumber;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String displayAddress(){
        //System.out.print( houseFlatNumber+"\t"+ houseName +"\t"+ street1+"\t"+ city+"\t"+  state+" \t"+ country+"\t"+ pinCode);
        return houseFlatNumber+"\t"+ houseName +"\t"+ street1+"\t"+ city+"\t"+  state+"\t"+ country+"\t"+ pinCode ;
    }
}
