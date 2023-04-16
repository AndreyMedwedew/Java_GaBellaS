//Задан целочисленный список ArrayList. Найти минимальное, //максимальное и среднее из этого списка.

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] intArray = {24, 340, 0, 34, 12, 10, 20};

        Arrays.sort(intArray);

        System.out.println("intArray after sorting: " + Arrays.toString(intArray));
        
        int maxNum = intArray[intArray.length - 1];
        System.out.println("Maximum number = " + maxNum);
        int minNum = intArray[0];
        System.out.println("Minimum number = " + minNum);
        int meanNum = intArray[intArray.length/2];
        System.out.println("Mean number = " + meanNum);
    }
}