package Seminar05.Homework;

import java.util.*;

public class PhoneBook {
    Map<Integer, String> phoneBook = new HashMap<>();

    void add(Integer phone, String name){
        phoneBook.put(phone, name);
    }

    List<Integer> findPhone(String name){
        List<Integer> listPhones = new ArrayList<>();
        for(Map.Entry<Integer, String> entry : phoneBook.entrySet()){
            Integer phoneEntry = entry.getKey();
            String nameEntry = entry.getValue();
            if(nameEntry.equalsIgnoreCase(name)){
                listPhones.add(phoneEntry);
            }
        }
        return  listPhones;
    }

    String findName(Integer phone){
        for(Map.Entry<Integer, String> entry: phoneBook.entrySet()){
            Integer phoneEntry = entry.getKey();
            String nameEntry = entry.getValue();
            if(phoneEntry.equals(phone)){
                return nameEntry;
            }
        }
        return null;
    }
}
