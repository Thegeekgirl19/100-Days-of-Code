// note this program throws an exception
import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows & cols of matrix A");
        int ai = sc.nextInt();
        int aj = sc.nextInt();

        System.out.println("Enter the rows & cols of matrix B");
        int bi = sc.nextInt();
        int bj = sc.nextInt();
        // [ai] ([aj] x [bi]) [bj]

        // declaring the three arrays a, b & c(resultant matrix)
        int a[][] = new int[ai][aj];
        int b[][] = new int[bi][bj];
        int c[][] = new int[ai][bj];
        

        if  (aj==bi) {

            System.out.println("Enter values in matrix a:");
            for (int i = 0; i < ai; i++) {
                for (int j = 0; j < aj; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter values in matrix b:");
            for (int i = 0; i < bi; i++) {
                for (int j = 0; j < bj; j++) {
                    b [i][j] = sc.nextInt();
                }
            }
            sc.close();

            System.out.println("Printing results...");
            for (int i = 0; i < ai; i++) {
                for (int j = 0; j < bj; j++) {
                    // I didnt understand this part of the code
                    for(int k=0;k<bj;k++)      
                    {      
                        c[i][j]+=a[i][k]*b[k][j]; 
                    }
                    System.out.print(c[i][j] + "  "); 
                }
                System.out.println();
            }

        } else {
            System.out.println("Matrix multiplication failed");
        }
    }
}
