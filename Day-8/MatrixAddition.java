import java.util.*;
public class MatrixAddition {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows & cols: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];
        int res[][] = new int[rows][cols];

        System.out.println("Enter values in matrix a:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a [i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values in matrix b:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b [i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Printing results...");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res [i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}