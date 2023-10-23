package main3;

// ДЗ доработать калькулятор на использование методов, разнести функционал по методам: сумма отдельно,
// разность отдельно и т.д Выполнить запрос новых данных в бесконечный цикл
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();

        do {
            System.out.print("Какую операцию необходимо выполнить:\n 1 - сложение\n 2 - вычитание\n " +
                    "3 - умножение \n 4 - деление\n");
            int h = scanner.nextInt();

            if (h >= 5) {
                System.out.println("Введите с 1 до 4!");
            } else if (h == 1) {
                sloz(a, b);
                break;
                //System.out.println("Результат сложения: " + sum(a,b));
            } else if (h == 2) {
                razn(a, b);
                break;
                //System.out.println("Результат вычитания: " + razn(a,b));
            } else if (h == 3) {
                umn(a, b);
                break;
                //System.out.println("Результат умножения: " + umn(a,b));
            } else if (h == 4) {
                if (b != 0) {
                    del(a, b);
                    //         System.out.println("Результат деления: " + del(a,b));
                } else System.out.println("Нельзя делить на ноль");
            break;
            }
        }
        while (true);

            }
        public static void sloz ( int a, int b)
        {
            System.out.println("Результат сложения: " + (a + b));
        }

        public static void razn ( int a, int b)
        //public static int razn(int a, int b){
        //        return a-b;
        {
            System.out.println("Результат вычитания: " + (a - b));
        }
        public static void umn ( int a, int b)
        {
            System.out.println("Результат умножения: " + (a * b));
        }
        public static void del ( int a, int b)
        {
            System.out.println("Результат деления: " + (a / b));
        }

}