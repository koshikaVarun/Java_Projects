import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// part 1 code
class Contact {
    private String name; // no other classes can be access the variables  
    private String phoneNumber;
    private String email;
    private String address;

    public Contact(String name, String phoneNumber, String email, String address) { // we are declaring the method as the public too access from the other class 
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getName() { // getter method 
        return name;
    }

    public String toString() {  // not a setter method it just provides the readable strings
        return "Name: " + name + "\nPhone: " + phoneNumber + "\nEmail: " + email + "\nAddress: " + address;
    }
}
// part 2 code 
class AddressBook {
    private List<Contact> contacts; // we are declaring a variable with list<> type and private access specifier

    public AddressBook() {         // here we are creating an obj in class itself
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;//If the loop finishes without finding a match, the method returns null to indicate that no contact with the provided name was found.
    }

    public void updateContact(String name, Contact updatedContact) {
        for (int i = 0; i < contacts.size(); i++) { //iteration
            Contact contact = contacts.get(i);
            if (contact.getName().equalsIgnoreCase(name)) {
                contacts.set(i, updatedContact);// important line set()
                System.out.println("Contact updated!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void deleteContact(String name) {
        Contact contactToRemove = null;

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contactToRemove = contact;
                break;
            }
        }

        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Contact deleted!");
        } else {
            System.out.println("Contact not found.");
        }
    }
}
// part 3 code
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();

                    Contact newContact = new Contact(name, phoneNumber, email, address);
                    addressBook.addContact(newContact);
                    System.out.println("Contact added!");
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    Contact foundContact = addressBook.searchContact(searchName);
                    if (foundContact != null) {
                        System.out.println("Contact found:\n" + foundContact);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to update: ");
                    String updateName = scanner.nextLine();
                    Contact foundForUpdate = addressBook.searchContact(updateName);

                    if (foundForUpdate != null) {
                        System.out.println("Contact found:\n" + foundForUpdate);

                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new phone number: ");
                        String newPhoneNumber = scanner.nextLine();
                        System.out.print("Enter new email: ");
                        String newEmail = scanner.nextLine();
                        System.out.print("Enter new address: ");
                        String newAddress = scanner.nextLine();

                        Contact updatedContact = new Contact(newName, newPhoneNumber, newEmail, newAddress);
                        addressBook.updateContact(updateName, updatedContact);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
