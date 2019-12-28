package com.friendbook.service;

import java.io.IOException;
import java.text.*;
import java.util.Date;
import java.util.Scanner;

public class ScreenReaderService {

    public static String readText (Scanner scanText, String message){
        System.out.print(message+":");
        String text= scanText.next();
        return text;
    }

    public static Integer readInt (Scanner scanText, String message){
        System.out.print(message+":");
        int integer = scanText.nextInt() ;
        return integer;
    }

    public static Date readDate (Scanner scanText, String message, String format) throws ParseException {
        System.out.print(message+":");
        SimpleDateFormat sdf= new SimpleDateFormat(format) ;
        //Date date =sdf.parse(scanText.nextLine());
        Date date =sdf.parse(scanText.next());
        return date;
    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void displayText(String message){
        System.out.println(message);
    }
    public static void waitForKey() throws IOException {
        char ch = (char) System.in.read();
    };

    public static int  displayMenu(Scanner scaninput) throws IOException {
        int choice=0;
        displayText("");
        displayText("");
        displayText("");
        displayText("");
        displayText("***************************************************************************");
        displayText("                            FRIEND BOOK ");
        displayText("***************************************************************************");
        displayText("1. Add Friend");
        displayText("2. Search Friend by Name");
        displayText("3. Display All Friend Details");
        displayText("4. Sort Friends by First Name and Display");
        displayText("5. Sort Friends by Date of Birth and Display");
        displayText("6. Delete Friend");
        displayText("7. Update Friend");
        displayText("8. Exit Application");
        displayText("");
        try {
            choice = readInt(scaninput, "Enter your choice");
        } catch (Exception e) {
            displayChecks();
        }
        return choice ;
    }

    public static void displayChecks() throws IOException {
        System.out.println("Incorrect Choice. The choice should be Integer between 1 to 8");
        ScreenReaderService.waitForKey();
    }

}
