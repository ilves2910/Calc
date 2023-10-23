package main2;
// ДЗ: Доработать калькулятор, получение от пользователя действия, которое нужно выполнить.
// Можно получить таким образом - если пользователь вводит 1, то это сложение, 2 - разность и т.д.
// Вывести результат действия. Используйте конструкции if -else, case.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();

        System.out.print("Какую операцию необходимо выполнить:\n 1 - сложение\n 2 - вычитание\n " +
                "3 - умножение \n 4 - деление\n");
       int h = scanner.nextInt();

       if (h == 1) {
            System.out.println("Результат сложения: " + (a + b));
        } else if (h == 2) {
            System.out.println("Результат вычитания: " + (a - b));
        } else if (h == 3) {
            System.out.println("Результат умножения: " + (a * b));
        } else if (h == 4) {
            if (b!=0) {
            System.out.println("Результат деления: " + (a / b));}
            else System.out.println("Нельзя делить на ноль");
        } else System.out.println("Введите номер операции с 1 до 4");
            h = scanner.nextInt();
    scanner.close();

        //switch (h) {
        //   case 1:
        //     System.out.println("Результат сложения: " + (a + b));
        //   break;
        //case 2:
        //  System.out.println("Результат вычитания: " + (a - b));
        //break;
        // case 3:
        //   System.out.println("Результат умножения: " + (a * b));
        // break;
        //case 4:
        //  if (b != 0) {
        //    System.out.println("Результат деления: " + (a / b));
        //} else {
        //  System.out.println("Нельзя делить на 0");
        // }
        // break;
        //default:
        //  System.out.println("Выберите от 1 до 4");
        //h = scanner.nextInt();}
    }
}