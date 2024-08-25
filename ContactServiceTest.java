package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    private ContactService contactService;

    @Test
    public void testAddContact() {
        Contact contact = new Contact("1234567890", "vinny", "pupu", "1234567890", "123 snhu st");
        contactService.addContact(contact);
        assertNotNull(contactService.getContact("1234567890"));
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("1234567890", "vinny", "pupu", "1234567890", "123 snhu st");
        contactService.addContact(contact);
        contactService.deleteContact("1234567890");
        assertNull(contactService.getContact("1234567890"));
    }

    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("1234567890", "vinny", "pupu", "1234567890", "123 snhu st");
        contactService.addContact(contact);
        contactService.updateContact("1234567890", "vinny", "pupu", "1231231234", "321 snhu blvd");
        Contact updatedContact = contactService.getContact("1234567890");
        assertEquals("vinny", updatedContact.getFirstName());
        assertEquals("pupu", updatedContact.getLastName());
        assertEquals("1231231234", updatedContact.getPhone());
        assertEquals("321 snhu blvd", updatedContact.getAddress());
    }
    
}
