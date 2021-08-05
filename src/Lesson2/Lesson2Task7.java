/*Напишите программу, определяющую сумму всех нечетных чисел от 1
до 99*/

package Lesson2;

public class Lesson2Task7 {
    public static void main(String[] args) {
        int sumOfOddNumbers = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 > 0) {
                sumOfOddNumbers += i;
            }
        }
        System.out.printf("Сумма всех нечетных чисел от 1 до 99 равна : %d", sumOfOddNumbers);
    }
}
