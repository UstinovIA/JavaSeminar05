package Seminar05.Homework;

//Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
// Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
// Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся
// имена с количеством повторений. Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

import java.awt.*;
import java.util.*;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        String[] arr = new String[] {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов"};
        List<String> listWorkers = new ArrayList<>(List.of(arr));
        List<String> listNames = getNames(listWorkers);
    }
    static List<String> getNames(List<String> list){
        List<String> result = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            String[] temp = list.get(i).split(" ");
            result.add(temp[0]);
        }
        return result;
    }

    static Map<Integer, String> getUniqueNames(List<String> listNames){
        Map<Integer, String> result = new HashMap<>();
        for(int i=0; i<listNames.size(); i++){
            if(!result.containsValue(listNames.get(i))){
                result.put(Collections.frequency(listNames, listNames.get(i)), listNames.get(i));
            }
        }
        return result;
    }
}
