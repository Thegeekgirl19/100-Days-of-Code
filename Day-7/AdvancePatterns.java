import java.rmi.server.SocketSecurityException;
import java.util.*;
public class AdvancePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter value of n: ");
        int n = sc.nextInt();
        sc.close();

        // Pattern 1
        // for (int i = 1; i<=n; i++) {
        //     for (int j = 1; j<=n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k=1; k<=i; k++) {
        //         System.out.print("*   ");
        //     }
        //     System.out.println();
        // }

        // Pattern 2
        // int count = 1;
        // for (int i=1; i<=n; i++) {
        //     for (int j=1; j<=n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k<=i; k++) {
        //         System.out.print(count + "   ");
        //         count++;
        //     }
        //     System.out.println();
        // }

        // Pattern 3
        // for (int i = 1; i<=2*n-1; i++) {
        //     if (i<=n) {
        //         for (int k = 1; k<=i; k++) {
        //             System.out.print("* ");
        //         }
        //     } else {
        //         for (int j = 1; j<=2*n-i;j++) {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Pattern 4
        for (int i = 0; i<=n; i++) {
            
        }

    }
}