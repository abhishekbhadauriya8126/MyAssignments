package Collections;

import java.util.Map;
import java.util.TreeMap;

public class QuestionNo1 {
    public static void main(String[] args) {
        TreeMap<Long, Contact> contactMap = new TreeMap<>();

        // Add sample contacts to the map
        contactMap.put(8126618081L, new Contact(8126618081L, "Abhishek", "john@example.com", "MALE"));
        contactMap.put(7454886916L, new Contact(7454886916L, "Jane Smith", "jane@example.com", "FEMALE"));
        contactMap.put(1136546445L, new Contact(1136546445L, "Bob Johnson", "bob@example.com", "MALE"));

        // Fetch all the keys and print them
        System.out.println("Keys:");
        for (Long keys : contactMap.keySet()) {
            System.out.println(keys);
        }

        // Fetch all the values and print them
        System.out.println("Values:");
        for (Contact value : contactMap.values()) {
            System.out.println(value.toString());
        }
        // Print all key-value pairs
        System.out.println("Key-Value Pairs:");
        for (Map.Entry<Long, Contact> pair : contactMap.entrySet()) {
            Long phoneNumber = pair.getKey();
            Contact contact = pair.getValue();
            System.out.println("Key: " + phoneNumber + ", Value: " + contact.toString());
        }
    }

    public static class Contact {
        private long phoneNumber;
        private String name;
        private String email;
        private String gender;

        public Contact(long phoneNumber, String name, String email, String gender) {
            this.phoneNumber = phoneNumber;
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        // Getters and setters

        @Override
        public String toString() {
            return "Contact{" +
                    "phoneNumber=" + phoneNumber +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }


}