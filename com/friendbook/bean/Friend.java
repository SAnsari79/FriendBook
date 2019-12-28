package com.friendbook.bean;

import java.util.Date;

public class Friend {

    String firstName;
    String lastName;
    Date  dateOfBirth;
    Address address;
    String phoneNumber;

    public Friend(){
        address = new Address();
    };

    public Friend(String firstName, String lastName, Address address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method to display the object details
    public void displayFriend(){
        System.out.println(this.firstName +"\t" +  this.lastName +"\t" + this.phoneNumber +"\t" + this.address.displayAddress() );
    }
}
