package lesson_4;
import lesson_4.task_1.Task_1;
import lesson_4.task_2.Task_2;

public class Main {
    public static void main(String[] args) {
        String [] myArray = {"Hello World!", "My name is Earl", "I hate Java", "I live in Moscow"};
        Task_1.reverseList(myArray);

        Task_2.enqueue();
        Task_2.enqueue();
        Task_2.enqueue();
        Task_2.enqueue();

        Task_2.dequeue();

        Task_2.first();
    }
}
