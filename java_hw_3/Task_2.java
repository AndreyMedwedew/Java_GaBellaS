//Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.Arrays;
import java.util.List;

public class Task_2 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(15,16,2,4,5,6,8,7,11);
        List<Integer> list2 = new java.util.ArrayList<>(List.of());

        for (int item : list1) {
            if (item%2 != 0){
                list2.add(item);
            }
        }
            System.out.println(list2);
    }
}