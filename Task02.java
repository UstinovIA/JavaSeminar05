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
        System.out.println(listNames.toString());
        System.out.println(sortNames(listNames));
    }
    static List<String> getNames(List<String> list){
        List<String> result = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            String[] temp = list.get(i).split(" ");
            result.add(temp[0]);
        }
        return result;
    }

    static Map<String, Integer> getUniqueNames(List<String> listNames){
        Map<String, Integer> result = new HashMap<>();
        for(int i=0; i<listNames.size(); i++){
            if(!result.containsKey(listNames.get(i))){
                result.put(listNames.get(i), Collections.frequency(listNames, listNames.get(i)));
            }
        }
        return result;
    }

    static Map<Integer, List<String>> sortNames(List<String> listNames) {
        Map<Integer, List<String>> result = new TreeMap<>(Comparator.reverseOrder());
        Map<String, Integer> uniqueNames = getUniqueNames(listNames);
        for (Map.Entry<String, Integer> entry: uniqueNames.entrySet()){
            if(!result.containsKey(entry.getValue())) {
                List<String> list = new ArrayList<>();
                list.add(entry.getKey());
                result.put(entry.getValue(), list);
            }
            else {
                result.get(entry.getValue()).add(entry.getKey());
            }
        }
        return result;
    }
}
