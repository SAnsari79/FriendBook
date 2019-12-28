package com.friendbook;

import java.io.IOException;
import java.text.ParseException;

public class FriendBookMain {

    public static void main (String [] args) throws ParseException, IOException {
        // Main Method to display Menu
        FriendBook friendBook = new FriendBook();
        friendBook.startMenu();
    }

}
