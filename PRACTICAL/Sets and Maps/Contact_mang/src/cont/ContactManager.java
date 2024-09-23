package cont;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContactManager {
	private Map<String, String> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Added: " + name + " - " + phoneNumber);
    }

  
    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Removed contact: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public String getPhoneNumber(String name) {
        return contacts.getOrDefault(name, "Contact not found");
    }

  
    public void listContacts() {
        Set<Map.Entry<String, String>> contactSet = contacts.entrySet();
        if (contactSet.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("Contact List:");
            for (Map.Entry<String, String> entry : contactSet) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
     
        ContactManager contactManager = new ContactManager();

    
        contactManager.addContact("Esha", "123-456-7890");
        contactManager.addContact("John", "987-654-3210");
        contactManager.addContact("Alice", "555-555-5555");

        
        System.out.println("\nPhone number of Esha: " + contactManager.getPhoneNumber("Esha"));

     
        contactManager.removeContact("John");

      
        System.out.println("\nListing all contacts:");
        contactManager.listContacts();
    }
}
