import java.util.Scanner;

public class Main {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите размер квадратной матрицы: ");
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = (int)(Math.random() * 100);
                    matrix[i][j] *= Math.pow(-1, (int)(Math.random() * 10));
                }
            }
            System.out.println("Исходная квадратная матрица: ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%4d", matrix[i][j]); 
                }
                System.out.println();
            }
            int min_index = 0;
            for (int i = 1; i < n; i++) {
                if (matrix[min_index][min_index] > matrix[i][i]) {
                    min_index = i;
                }
            }
            System.out.println("Минимальный элемент в побочной диагонали: " + matrix[min_index][min_index]);
            System.out.println("Индекс элемента: " + min_index);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
        }
    }
}