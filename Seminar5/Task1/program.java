package Seminar5.Task1;

import java.util.HashMap;
import java.util.Map.Entry;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap,
 * учитывая, что 1 человек может иметь несколько телефонов.
 */
public class program {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("89035446651", "Иванов");
        phonebook.put("89167489002", "Петров");
        phonebook.put("89254678981", "Сидоров");
        phonebook.put("89265478192", "Иванов");
        for (Entry<String, String> pair : phonebook.entrySet()) {
            System.out.println(String.format("%s %s", pair.getKey(), pair.getValue()));
        }
    }
}
