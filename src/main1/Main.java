package main;    // Д/з: Необходимо написать простой консольный калькулятор на Java.
    // Для считывания ввода нужно использовать класс Scanner. В конце напечатать результат.
    // Используйте форматированный вывод. Пока пусть работает так, пользователь вводит целые числа,
    // а на вывод передается результат 4-х операций(+, -, *, /) без выбора операции.
    // В дальнейшем будете дорабатывать приложение.
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое целое число: ");
            int a = scanner.nextInt();

            System.out.print("Введите второе целое число: ");
            int b = scanner.nextInt();

           int c= a+b;
            int d= a-b;
            int e= a*b;
            int f= a/b;

            System.out.printf("Результат сложения: "); System.out.println (c);
            System.out.printf("Результат вычитания: "); System.out.println (d);
            System.out.printf("Результат умножения: "); System.out.println (e);
            System.out.printf("Результат деления: "); System.out.println (f);
            scanner.close();
        }
    }