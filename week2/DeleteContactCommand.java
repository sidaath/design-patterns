package com.example.sharingapp;

import android.content.Context;

public class DeleteContactCommand extends Command{
    private Contact contact;
    private ContactList contact_list;
    private Context context;

    public DeleteContactCommand(Contact contact, ContactList contact_list, Context context) {
        this.contact = contact;
        this.contact_list = contact_list;
        this.context = context;
    }


    //implementing abstract method
    public void execute() {
        contact_list.deleteContact(contact);
        setIsExecuted(contact_list.saveContacts(context));
    }
}
