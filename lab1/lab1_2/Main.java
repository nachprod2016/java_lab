import java.util.Scanner;

public class Main {
    public static void main(String[] args) {      
        try {
            Scanner scanner = new Scanner(System.in);
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double res = Math.pow(Math.max(a, b), 5);
            res -= 3.2 * Math.min(a, b);
            res /= (1 + Math.min(a, b));
            System.out.println("Результат операции: " + res);
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
        }
    }
}