import java.util.ArrayList;

public class Notebook {
    private ArrayList<Contact> contacts;
    private int nextId;
    
    public Notebook() {
        this.contacts = new ArrayList<>();
        this.nextId = 1;
    }

    public void addContact(Contact contact) {
        contact.setId(nextId);
        nextId++;
        contacts.add(contact);
    }

    public void ShowContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Записная книжка пуста");
            return;
        }
        
        System.out.println("Информация о контактах:");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("--- Контакт " + (i + 1) + " ---");
            Contact contact = contacts.get(i);
            System.out.println("ID: " + contact.getId());
            System.out.println("Имя: " + contact.getFirstName());
            System.out.println("Фамилия: " + contact.getLastName());
            System.out.println("Телефон: " + contact.getPhone());
            System.out.println("Адрес: " + contact.getAddress());
            System.out.println("Заметка: " + contact.getNote());
            System.out.println();
        }
    }

    public Contact findContactByPhone(String phone) {
        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phone)) {
                return contact;
            }
        }
        return null;
    }

    public Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(name) || 
                contact.getLastName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public Contact findContactById(int id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }

    public boolean removeContactById(int id) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId() == id) {
                contacts.remove(i);
                return true;
            }
        }
        return false;
    }
}