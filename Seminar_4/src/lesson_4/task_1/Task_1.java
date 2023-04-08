package lesson_4.task_1;
import java.util.LinkedList;
/* Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
который вернет “перевернутый” список.
 */

public class Task_1 {
    public static void reverseList(String[] args) {
        LinkedList<String> earlBio = new LinkedList<>();

        for (String item: args) {
            earlBio.addFirst(item);
        }

        System.out.println(earlBio);
    }
}
