package Lab3.SR2;

import java.util.Scanner;

public class SR2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String day = scanner.nextLine();

        String dayOfWeek;
        switch (day) {
            case "Понедельник":
            case "понедельник":
                dayOfWeek = "1";
                break;
            case "Вторник":
            case "вторник":
                dayOfWeek = "2";
                break;
            case "Среда":
            case "среда":
                dayOfWeek = "3";
                break;
            case "Четверг":
            case "четверг":
                dayOfWeek = "4";
                break;
            case "Пятница":
            case "пятница":
                dayOfWeek = "5";
                break;
            case "Суббота":
            case "суббота":
                dayOfWeek = "6";
                break;
            case "Воскресенье":
            case "воскресенье":
                dayOfWeek = "7";
                break;
            default:
                dayOfWeek = "Такого дня нет";
                break;
        }
        System.out.println(dayOfWeek);
    }
}
