package lesson_5.task_2;
import java.util.*;
import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {

        String[] people = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Иван Иванов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Иван Иванов", "Мария Рыкова", "Анна Крутова", "Марина Лугова", "Анна Владимирова", "Петр Лыков", "Иван Мечников", "Петр Петин", "Петр Лыков", "Иван Ежов"};

//        System.out.println(Arrays.toString(people));

        Map<String, Integer> countPeople = new HashMap<>();

        for (int i = 0; i < people.length; i += 1) {
            int val = 0;
            if (countPeople.containsKey(people[i])) {
                val = countPeople.get(people[i]) + 1;
                countPeople.remove(people[i]);
                countPeople.put(people[i], val);
            } else countPeople.put(people[i], 1);
        }
//        System.out.println(countPeople);
        countPeople.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}