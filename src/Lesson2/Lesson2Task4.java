/*Составьте программу, вычисляющую A*B, не пользуясь операцией
умножения*/
package Lesson2;

public class Lesson2Task4 {
    public static void main(String[] args) {
        int numA = -5;
        int numB = 11;
        int result = 0;
        String sign = "";
        if ((numA < 0) ^ (numB < 0)) {
            sign = "-";
        }
        numA = Math.abs(numA);
        numB = Math.abs(numB);
        while (numB > 0) {
            result+=numA;
            numB--;
        }
        System.out.println(sign + result);
    }
}
