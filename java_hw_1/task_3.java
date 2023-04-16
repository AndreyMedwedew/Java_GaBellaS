// Вывести все простые числа от 1 до 1000 простое число - то число которое делится без остатка только на 1 и на само себя (1 - это не простое число);
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        System.out.print("Введите число, до которого будем выводить простые числа: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i=2; i<number+1; i+=1){
            int k = 0;
            for (int j=2; j<i+1; j+=1){
                if (i%j==0) {
                    k += 1;
                    break;
                }
            if (k==0) {
                System.out.println(i);
                break;
                }
            }
        }
    }
}