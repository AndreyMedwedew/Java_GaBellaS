// Реализовать простой калькулятор
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstNum = scanner.nextDouble();
        System.out.print("Введите действие: ");
        String action = scanner.next();
        System.out.print("Введите второе число: ");
        double secondNum = scanner.nextDouble();


        if (action.equals("/")) System.out.println(firstNum / secondNum);
        if (action.equals("*")) System.out.println(firstNum * secondNum);        
        if (action.equals("-")) System.out.println(firstNum - secondNum);
        if (action.equals("+")) System.out.println(firstNum + secondNum);
    }
}