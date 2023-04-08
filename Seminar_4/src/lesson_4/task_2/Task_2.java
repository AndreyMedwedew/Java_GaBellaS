package lesson_4.task_2;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Scanner;

/* Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task_2 {
    private static LinkedList<String> earlBio = new LinkedList<>();

    public static void enqueue() {
        Scanner sc = new Scanner(System.in);
        earlBio.addLast(sc.next());
        System.out.println(earlBio);
    }

    public static void dequeue() {
        System.out.println(earlBio.remove(0));
        System.out.println(earlBio);
    }


    public static void first() {
        System.out.println(earlBio.get(0));
        System.out.println(earlBio);
    }
}
