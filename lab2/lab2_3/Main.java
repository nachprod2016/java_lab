import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите размер матрицы: ");
            System.out.println("Строки: ");
            int n = scanner.nextInt();
            System.out.println("Столбцы: ");
            int m = scanner.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = (int)(Math.random() * 100);
                    matrix[i][j] *= Math.pow(-1, (int)(Math.random() * 10));
                }
            }
            System.out.println("Исходная матрица: ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%4d", matrix[i][j]); // выравнивание по 4 символам
                }
                System.out.println();
            }
            ArrayList<Integer> vector = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int c = 0;
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] >= 0) {
                        c++;
                    }
                }
                vector.add(c);
            }
            for (int i = 0; i < vector.size(); i++) {
                System.out.println("В " + (i + 1) + " строке: " + vector.get(i) + " неотрицательных элементов");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
        }
    }
}