/*Вычислить: 1+2+4+8+…+256*/
package Lesson2;

public class Lesson2Task3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i *= 2) {
            sum += i;
            System.out.println(i);
        }
        System.out.printf("1+2+4+8+...+256 = %d", sum);
    }
}
