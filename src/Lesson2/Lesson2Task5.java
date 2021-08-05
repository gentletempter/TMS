/*Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/

package Lesson2;

public class Lesson2Task5 {
    public static void main(String[] args) {
        System.out.println("_______________________________");
        System.out.println("   Дюймы    |   Сантиметры   ");
        System.out.println("_______________________________");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("      %d     |      %.2f     \n", i, i * 2.54);
        }
        System.out.println("_______________________________");
    }
}
