/*Рисуем треугольники*/

package Lesson2;

public class Lesson2Task8 {
    public static void main(String[] args) {
        char[][] array = new char[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i >=j ? '*' : ' ';
            }
        }
    }
}
