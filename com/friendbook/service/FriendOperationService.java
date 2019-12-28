package com.friendbook.service;

import com.friendbook.bean.Address;
import com.friendbook.bean.Friend;

import java.text.ParseException;
import java.util.Scanner;

public class FriendOperationService {

    public static Friend createNewFriend (Scanner scanText) throws ParseException {
        Friend friend = new Friend ();
        Address address = new Address();
        friend.setFirstName(ScreenReaderService.readText(scanText, "Enter First Name"));
        friend.setLastName(ScreenReaderService.readText(scanText, "Enter Last Name"));
        friend.setDateOfBirth(ScreenReaderService.readDate(scanText, "Enter Data of Birth (Format DD-MM-YYYY)","DD-MM-YYYY"));
        friend.setPhoneNumber(ScreenReaderService.readText(scanText, "Enter Phone Number"));
        address.setHouseFlatNumber(ScreenReaderService.readInt(scanText,"Enter House number/Flat Number"));
        address.setHouseName(ScreenReaderService.readText(scanText,"Enter house Name/ Building Name"));
        address.setStreet1(ScreenReaderService.readText(scanText,"Enter Street Name"));
        address.setCity(ScreenReaderService.readText(scanText, "Enter City Name" ));
        address.setState(ScreenReaderService.readText(scanText,"Enter State Name"));
        address.setCountry(ScreenReaderService.readText(scanText,"Enter Country Name"));
        address.setPinCode(ScreenReaderService.readInt(scanText,"Enter Pin Code"));
        friend.setAddress(address);
        return friend;
    }

    public static void updateFriend (Scanner scanText,Friend friend) throws ParseException {
        Address address = friend.getAddress();
        friend.setFirstName(ScreenReaderService.readText(scanText, "Enter New First Name"));
        friend.setLastName(ScreenReaderService.readText(scanText, "Enter New Last Name"));
        friend.setDateOfBirth(ScreenReaderService.readDate(scanText, "Enter New Data of Birth (Format DD-MM-YYYY)","DD-MM-YYYY"));
        friend.setPhoneNumber(ScreenReaderService.readText(scanText, "Enter New Phone Number"));
        address.setHouseFlatNumber(ScreenReaderService.readInt(scanText,"Enter New House number/Flat Number"));
        address.setHouseName(ScreenReaderService.readText(scanText,"Enter New house Name/ Building Name"));
        address.setStreet1(ScreenReaderService.readText(scanText,"Enter New Street Name"));
        address.setCity(ScreenReaderService.readText(scanText, "Enter New City Name" ));
        address.setState(ScreenReaderService.readText(scanText,"Enter New State Name"));
        address.setCountry(ScreenReaderService.readText(scanText,"Enter New Country Name"));
        address.setPinCode(ScreenReaderService.readInt(scanText,"Enter New Pin Code"));
        friend.setAddress(address);

    }
}
