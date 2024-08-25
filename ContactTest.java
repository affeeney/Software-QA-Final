package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testCreateContact() {
        Contact contact = new Contact("1234567890", "vinny", "pupu", "1234567890", "123 snhu st");
        assertEquals("1234567890", contact.getId());
        assertEquals("vinny", contact.getFirstName());
        assertEquals("pupu", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 snhu st", contact.getAddress());
    }

    @Test
    public void testInvalidId() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("121212121212", "vinny", "pupu", "1234567890", "123 snhu st");
        });
        assertEquals("Invalid iD", exception.getMessage());
    }

    @Test
    public void testInvalidPhone() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "vinny", "pupu", "12345667878991", "123 snhu st");
        });
        assertEquals("Invalid phone", exception.getMessage());
    }

    @Test
    public void testInvalidName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "binny", "juju", "1234567890", "123 snhu st");
        });
        assertEquals("Invalid name", exception.getMessage());
    }

    @Test
    public void testInvalidAddress() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "vinny", "pupu", "1234567890", "This address is way too long and mr pupu cant possibly live here");
        });
        assertEquals("Invalid address", exception.getMessage());
    }
}

