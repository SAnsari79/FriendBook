package com.friendbook;

import com.friendbook.bean.Friend;
import com.friendbook.service.FriendOperationService;
import com.friendbook.service.ScreenReaderService;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class FriendBook {
    List<Friend> friendBook;

    public FriendBook(){
        friendBook = new ArrayList<>();
    }

    public void startMenu() throws ParseException, IOException {
        int choice=0;
        Scanner scaninput = new Scanner(System.in);
        while (choice != 8) {
            ScreenReaderService.clearScreen();
            choice = ScreenReaderService.displayMenu(scaninput);
            System.out.println("Entered Choice is:" + choice  + " Press any key to continue ...");
            processChoice(scaninput,choice);
        }
    }

    private void processChoice(Scanner scaninput,int choice) throws ParseException, IOException {
        if (choice == 1) {
            addFriend(scaninput);
        } else if (choice == 2) {
            findFriendByName(scaninput);
        } else if (choice == 3) {
            displayAllFriends();
        } else if (choice == 4) {
            sortFriendsByFirstName();
            displayAllFriends();
        } else if (choice == 5) {
            sortFriendsByDOB();
            displayAllFriends();
        } else if (choice == 6) {
            deleteFriendByFirstName(scaninput);
        } else if (choice == 7) {
            findFriendByNameandUpdate(scaninput);
        } else if (choice == 8) {
            ScreenReaderService.displayText("Exiting application.. Press any key to continue...");
            ScreenReaderService.waitForKey();
        }
    }

    private void findFriendByNameandUpdate(Scanner scaninput) throws ParseException, IOException {
        String firstName = ScreenReaderService.readText(scaninput,"Enter the Fist Name for Friend to be Updated");
        for (Friend friend : friendBook ){
            if (firstName.equals(friend.getFirstName())){
                friend.displayFriend();
                FriendOperationService.updateFriend(scaninput,friend);
                ScreenReaderService.displayText("Updated Details of friend" ); ;
            }
        }
        ScreenReaderService.waitForKey();
    }

    private void addFriend(Scanner scan) throws ParseException {
        Friend friend = FriendOperationService.createNewFriend(scan);
        this.friendBook.add(friend);
    }

    private void findFriendByName (Scanner scaninput) throws IOException {
        ScreenReaderService.clearScreen();
       String firstName = ScreenReaderService.readText(scaninput,"Enter the Fist Name for Friend to be searched");
        for (Friend friend : friendBook ){
            if (firstName.equals(friend.getFirstName())){
                friend.displayFriend();
            }
        }
        ScreenReaderService.displayText("Above are Friend found with the FirstName:"+ firstName); ;
        ScreenReaderService.waitForKey();
    }

/*
    private void findFriendByDOB (Scanner scaninput) throws ParseException, IOException {
        ScreenReaderService.clearScreen();
        Date dob = ScreenReaderService.readDate(scaninput, "Enter Data of Birth (Format DD-MM-YYYY) of Friend to be searched","DD-MM-YYYY");
        for (Friend friend : friendBook ){
            if (dob.equals(friend.getDateOfBirth())){
                friend.displayFriend();
            }
        }
        ScreenReaderService.displayText("Above are Friend Fund  by Date of Birth as :"+ dob.toString()); ;
        ScreenReaderService.waitForKey();
    }
*/
    private void deleteFriendByFirstName (Scanner scaninput) throws IOException {
        ScreenReaderService.clearScreen();
        String  firstName = ScreenReaderService.readText(scaninput,"Enter the First Name fof Friend to be deleted");
        Iterator<Friend> itr = friendBook.iterator();
        while ( itr.hasNext()) {
            Friend frnd = itr.next() ;
            if ( frnd.getFirstName().equals(firstName)){
                itr.remove();
                ScreenReaderService.displayText("Removed Friend by First Name" + frnd.getFirstName() +""+ frnd.getLastName());
            }
        }
        ScreenReaderService.waitForKey();
    }

  /*
    private void deleteFriendByDOB  (Date dob){
        Iterator<Friend> itr = friendBook.iterator();
        while ( itr.hasNext()) {
            Friend frnd = itr.next() ;
            if ( frnd.getDateOfBirth().equals(dob)){
                itr.remove();
            }
        }
    }
*/
    private void displayAllFriends () throws IOException {
        for (Friend friend : friendBook ){
            friend.displayFriend();
        }
        ScreenReaderService.waitForKey();
    }

    private void sortFriendsByFirstName() throws IOException {
        Comparator<Friend> compareByFirstName = (Friend f1, Friend f2) ->  f1.getFirstName().compareTo(f2.getFirstName());
        Collections.sort(friendBook,compareByFirstName);
    }

    private void sortFriendsByDOB() throws IOException {
        Comparator<Friend> compareByDOB = (Friend f1, Friend f2) ->  f1.getDateOfBirth().compareTo(f2.getDateOfBirth());
        Collections.sort(friendBook,compareByDOB );
    }


}
