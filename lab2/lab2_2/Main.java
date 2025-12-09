import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int n = scanner.nextInt();
            int n1 = 0;
            int[] b = new int[n];
            for (int i = 0; i < n; i++){
                b[i] = (int)(Math.random() * 100);
                b[i] *= Math.pow(-1, (int)(Math.random() * 10));
                if (b[i] > 0) {
                    n1++;
                }
            }
            int[] c = new int[n1];
            for (int i = 0, j = 0; i < n; i++) {
                if (b[i] > 0) {
                    c[j] = b[i];
                    j++;
                }
            }
            int[] c1 = Arrays.copyOf(c, n1);
            for (int i = 0; i < n1; i++) {
                int min = c1[i];
                int index = i;
                for (int j = i; j < n1; j++) {
                    if (min > c1[j]) {
                        min = c1[j];
                        index = j;
                    }
                }
                if (c1[i] != min) {
                    c1[index] = c1[i];
                    c1[i] = min;
                }
            }
            System.out.println("Исходный массив: " + Arrays.toString(b));
            System.out.println("Массив положительных чисел: " + Arrays.toString(c));
            System.out.println("Массив отсортированных положительных чисел: " + Arrays.toString(c1));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
        }
    }
}