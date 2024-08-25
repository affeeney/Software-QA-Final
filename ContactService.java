import java.util.HashMap;
import java.util.Map;

public class ContactService {
    
    //this will hold the collection of contacts (contact id key, contact object value)
    private Map<String, Contact> contacts;

    public ContactService() {
        contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getId())) {
            throw new IllegalArgumentException("id in use");
        }
        contacts.put(contact.getId(), contact);
    }

    public void deleteContact(String id) {
        if (!contacts.containsKey(id)) {
            throw new IllegalArgumentException("Contact not found");
        }
        contacts.remove(id);
    }

    public void updateContact(String id, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(id);
        if (contact == null) {
            throw new IllegalArgumentException("id not found");
        }
        if (firstName != null) {
            contact.setFirstName(firstName);
        }
        if (lastName != null) {
            contact.setLastName(lastName);
        }
        if (phone != null) {
            contact.setPhone(phone);
        }
        if (address != null) {
            contact.setAddress(address);
        }
    }

    //getters
    public Contact getContact(String id) {
        return contacts.get(id);
    }

    public Map<String, Contact> getAllContacts() {
        return contacts;
    }
}
    


