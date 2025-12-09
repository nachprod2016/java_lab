import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String generatePhoneNumber() {
        Random random = new Random();
        return "+7" + String.format("%010d", random.nextLong(10000000000L));
    }
    
    public static String getRandElement(String[] arr, int n) {
        Random random = new Random();
        return arr[random.nextInt(n)];
    }
    
    static String[] lastNames = {
            "Ivanov",
            "Petrov", 
            "Sidorov",
            "Smirnov",
            "Kuznetsov"
    };
        
    static String[] firstNames = {
            "Ivan",
            "Alexander", 
            "Sergey",
            "Dmitry",
            "Maxim"
    };
    
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество контактов");
            int n = scanner.nextInt();
            Notebook notebook = new Notebook();
            for (int i = 0; i < n; i++){
                Contact c = new Contact(
                    getRandElement(firstNames, firstNames.length), 
                    getRandElement(lastNames, lastNames.length),
                    generatePhoneNumber()
                );
                notebook.addContact(c);
            }
            int choice = 0;
            int r_id;
            Contact contact;
            while (choice != -1) {
                try {
                    System.out.println("1 - Показать все контакты");
                    System.out.println("2 - Добавить контакт");
                    System.out.println("3 - Удалить контакт");
                    System.out.println("4 - Добавить адресс контакта");
                    System.out.println("5 - Добавить заметку");
                    System.out.println("0 - Выход");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            notebook.ShowContacts();
                            break;
                        case 2:
                            scanner.nextLine();
                            System.out.print("Имя: ");
                            String fName = scanner.nextLine();
                            System.out.print("Фамилия: ");
                            String lName = scanner.nextLine();
                            System.out.print("Телефон: ");
                            String ph = scanner.nextLine();
                            Contact c = new Contact(fName, lName, ph);
                            notebook.addContact(c);
                            break;
                        case 3:
                            System.out.print("Id: ");
                            r_id = scanner.nextInt();
                            notebook.removeContactById(r_id);
                            break;
                        case 4:
                            scanner.nextLine();
                            System.out.print("Id контакта для ввода адреса: ");
                            r_id = scanner.nextInt();
                            contact = notebook.findContactById(r_id);
                            scanner.nextLine();
                            String address = scanner.nextLine();
                            contact.setAddress(address);
                            break;
                        case 5:
                            scanner.nextLine();
                            System.out.print("Id контакта для ввода заметки: ");
                            r_id = scanner.nextInt();
                            contact = notebook.findContactById(r_id);
                            scanner.nextLine();
                            String note = scanner.nextLine();
                            contact.setNote(note);
                            break;
                        case 0:
                            choice = -1;
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка ввода");
                    scanner.nextLine();
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}