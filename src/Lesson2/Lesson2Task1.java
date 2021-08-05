/*Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за N дней?*/

package Lesson2;

public class Lesson2Task1 {
    public static void main(String[] args) {
        byte firstDayDistance = 10;
        int numberOfDays = 7;
        float dayDistance = firstDayDistance;
        float summaryDistance = 0;

        for (int i = 2; i <= numberOfDays; i++) {
            dayDistance += dayDistance * 0.1F;
            summaryDistance += dayDistance;
        }
        summaryDistance += firstDayDistance;
        System.out.printf("Суммарный путь: %.1f", summaryDistance);
    }
}
