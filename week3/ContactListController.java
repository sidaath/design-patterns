package com.example.sharingapp;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ContactListController {
    private ContactList contactList;

    public ContactListController(ContactList contactList) {
        this.contactList = contactList;
    }

    //Adding the add, delete and edit contact methods.
    public boolean addContact(Contact contact, Context context) {
        AddContactCommand addContactCommand = new AddContactCommand(contactList,contact,context);
        addContactCommand.execute();
        return addContactCommand.isExecuted();
    }


    public boolean deleteContact(Contact contact, Context context) {
        DeleteContactCommand deleteContactCommand = new DeleteContactCommand(contactList,contact,context);
        deleteContactCommand.execute();
        return deleteContactCommand.isExecuted();
    }

    public boolean editContact(Contact old_contact,Contact new_contact,Context context){
        EditContactCommand editContactCommand = new EditContactCommand(contactList,old_contact,new_contact,context);
        editContactCommand.execute();
        return editContactCommand.isExecuted();
    }

    //Adding the other contact list methods
    public void setContacts(ArrayList<Contact> contact_list) {
        contactList.setContacts(contact_list);
    }

    public ArrayList<Contact> getContacts() {
        return contactList.getContacts();
    }

    public ArrayList<String> getAllUsernames(){
        return contactList.getAllUsernames();
    }

    public Contact getContact(int index) {
        return contactList.getContact(index);
    }

    public int getSize() {
        return contactList.getSize();
    }

    public Contact getUserByUsername(String username){
        return contactList.getUserByUsername(username);
    }

    //Get CONTACT by Username
    public Contact getContactByUsername(String username) {
        return contactList.getContactByUsername(username);
    }


    public boolean hasContact(Contact contact) {
        return contactList.hasContact(contact);
    }

    public int getIndex(Contact contact) {
        return contactList.getIndex(contact);
    }

    public boolean isUsernameAvailable(String username){
        return contactList.isUsernameAvailable(username);
    }

    public void addObserver(Observer observer) {
        contactList.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        contactList.removeObserver(observer);
    }

    public void loadContacts(Context context) {
        contactList.loadContacts(context);
    }

    public boolean saveContacts(Context context) {
        return contactList.saveContacts(context);
    }
}
