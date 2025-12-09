import java.util.Scanner;

public class Main {
    public static void main(String[] args) {      
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            double x = Double.parseDouble(scanner.nextLine());
            System.out.print("Введите второе число: ");
            double y = Double.parseDouble(scanner.nextLine());
            double res = x * y;
            if (res > 50) {
                double doubleSqrtX = 2 * Math.sqrt(x);
                double squareY = Math.pow(y, 2);
                System.out.println("Произведение чисел " + x + " * " + y + " = " + res + " > 50");
                System.out.println("Удвоенный корень квадратный первого числа: " + doubleSqrtX);
                System.out.println("Квадрат второго числа: " + squareY);
            } else {
                System.out.println("Произведение чисел " + x + " * " + y + " = " + res + " <= 50");
                System.out.println("Условие не выполняется");
            }
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
        }
    }
}