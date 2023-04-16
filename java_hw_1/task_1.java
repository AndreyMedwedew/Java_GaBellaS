// Вычислить n-ое треугольного число (сумма чисел от 1 до n),
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        System.out.print("Введите число, до которого нужно посчитать сумму: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int summa = 0;
        for (int i=1; i<number+1; i+=1) summa += i;
      System.out.println("Sum = " + summa);
    }
}