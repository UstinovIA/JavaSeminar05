package Seminar05.Homework;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

public class Task01 {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add(12345, "Илья");
        pb.add(23456, "Илья");
        pb.add(34567, "Иван");
        System.out.println(pb.findName(23456));
        System.out.println(pb.findPhone("Илья"));
    }
}

