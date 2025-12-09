import java.util.Scanner;

public class Main {
    public static void main(String[] args) {      
        try {
            Scanner scanner = new Scanner(System.in);
            double x = Double.parseDouble(scanner.nextLine());
            double res = 0;
            if (x <= -3) {
                res = Math.pow(x, 3) + 1;
            } else if (-3 < x && x <= 0) {
                res = 1 + Math.pow(2, Math.tan(x));
            } else {
                res = Math.pow(1 / (Math.tan(x)), 2);
            }
            System.out.println("Результат операции: " + res);
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
        }
    }
}