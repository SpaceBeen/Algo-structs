package lab_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesterLab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Практическая работа №1." +
                "\nКакой номер практической работы запустить?");
        int choice; // Инициализируем choice нулем, чтобы объявить его за пределами try-catch.

        while (true) {
            try {
                System.out.println("Введите число от 3 до 7:");
                choice = scanner.nextInt();

                if (choice >= 2 && choice <= 7) {
                    break; // Если введено корректное число, выходим из цикла.
                } else {
                    System.out.println("Число должно быть от 2 до 7. Пожалуйста, попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели некорректное значение.");
                scanner.nextLine(); // Очищаем буфер ввода
            }
        }

        switch (choice) {
            case 3:
                Task3 task3 = new Task3();
                task3.runTask();
                break;
            case 4:
                Task4 task4 = new Task4();
                task4.runTask();
                break;
            case 5:
                System.out.println("Пятый номер стоит запускать отдельно через консоль, передавая аргументы\n");
                break;
            case 6:
                Task6 task6 = new Task6();
                task6.runTask();
                break;
            case 7:
                Task7 task7 = new Task7();
                task7.runTask();
                break;
        }
    }
}
