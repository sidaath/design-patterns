package com.example.sharingapp;

import android.content.Context;

public class EditContactCommand extends Command{
    private Contact oldContact;
    private Contact newContact;
    private ContactList contact_list;
    private Context context;

    public EditContactCommand(Contact oldContact, Contact newContact, ContactList contact_list, Context context) {
        this.oldContact = oldContact;
        this.newContact = newContact;
        this.contact_list = contact_list;
        this.context = context;
    }

    //implementing abstract method
    public void execute() {
        contact_list.deleteContact(oldContact);
        contact_list.addContact(newContact);
        setIsExecuted(contact_list.saveContacts(context));
    }
}
