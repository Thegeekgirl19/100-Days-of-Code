import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of patterns: ");
        int n = sc.nextInt();
        sc.close();

        // Pattern 1
        // for (int j = 1; j <= n; j++) {
        //     for (int i =1; i<=n; i++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // Pattern 2
        // for(int i=1; i<=n; i++) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern 3
        // for(int i=n; i>=1; i--) {
        //     for (int j=i; j>=1; j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern 4
        // for (int i=1; i<=n; i++) {
        //     for (int j=1; j<=i-1; j++) {
        //         System.out.print("  ");
        //     }
        //     //for (int k=n; k>=i; k--)
        //     for(int k=i; k<=n; k++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        // Pattern 5
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i ; j++) {
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        
        




        
    }
}