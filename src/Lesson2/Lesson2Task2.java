/*Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/

package Lesson2;

public class Lesson2Task2 {

    public static void main(String[] args) {
        int numberOfCells = 1;
        for (int i = 3; i <= 24; i += 3) {
            System.out.printf("%d hours passed: %d amoebas \n", i, numberOfCells *= 2);
        }
    }
}
