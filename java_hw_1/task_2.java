// n! (произведение чисел от 1 до n),
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        System.out.print("Введите число, факториал которого нужно посчитать: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int summa = 1;
        for (int i=1; i<number+1; i+=1) summa *= i;
      System.out.println("Fak = " + summa);
    }
}