package Seminar5.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Пусть дан список сотрудников:
 * Написать программу, которая найдёт и выведет
 * повторяющиеся имена с количеством повторений. 
 * Отсортировать по убыванию популярности.
 */
public class program {
    public static void main(String[] args) {
        HashMap<String, Integer> empMap = new HashMap<>();
        ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Иван Иванов",
                                                                 "Светлана Петрова",
                                                                 "Кристина Белова",
                                                                 "Анна Мусина",
                                                                 "Иван Юрин",
                                                                 "Петр Лыков",
                                                                 "Павел Чернов",
                                                                 "Петр Чернышов",
                                                                 "Мария Федорова",
                                                                 "Мария Светлова",
                                                                 "Мария Савина",
                                                                 "Мария Рыкова",
                                                                 "Марина Лугова",
                                                                 "Анна Владимирова",
                                                                 "Иван Мечников",
                                                                 "Петр Петин",
                                                                 "Иван Ежов"));
        for (String fio : empList) {
            String[] arrFio = fio.split(" ");
            if (!empMap.containsKey(arrFio[0])) {
                empMap.put(arrFio[0],1);
            } 
            else {
                empMap.put(arrFio[0],empMap.get(arrFio[0])+1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(empMap.entrySet());
        Collections.sort(list, Comparator.comparingInt(Map.Entry::getValue));
        Collections.reverse(list);
        for (Entry<String,Integer> entry : list) {
            System.out.println(entry);
        }
    }
}
