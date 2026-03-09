package com.addressbook;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Contact contact = new Contact(
                "Aman",
                "kumar gola",
                "Bhopal",
                "Bhopal",
                "MP",
                "462001",
                "7409642260",
                "AMANAGOLA9841@gmail.com"
        );

        contact.displayContact();
    }
}