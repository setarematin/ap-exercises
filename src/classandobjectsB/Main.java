package classandobjectsB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns in the array: ");
        int row, column;
        Scanner scanner =  new Scanner(System.in);
        row = scanner.nextInt();
        column = scanner.nextInt();
        double[][] matrix = new double[row][column];
        System.out.println("Enter the array: ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                matrix[i][j] = scanner.nextDouble();

        System.out.println(Location.locateLargest(matrix));
    }
}
