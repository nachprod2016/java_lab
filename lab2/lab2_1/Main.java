import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] numbers1 = new int[size];
            double[] numbers2 = new double[size];
            for (int i = 0; i < size; i++){
                numbers1[i] = (int)(Math.random() * 100);
                numbers1[i] *= Math.pow(-1, (int)(Math.random() * 10));
                numbers2[i] = Math.round((double)(1.0 / numbers1[i]) * 10000.0) / 10000.0;
            }
            System.out.println("Исходный массив: " + Arrays.toString(numbers1));
            System.out.println("Массив обратных чисел: " + Arrays.toString(numbers2));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
        }
    }
}