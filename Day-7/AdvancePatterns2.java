import java.util.Scanner;
public class AdvancePatterns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter value of n: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("* "); // first line with i *'s'

        for (int i=2; i<=n-1; i++) {
            System.out.print("*");
            for (int j=1; j<=i-2; j++) {
                System.out.print("  ");
            }
            System.out.println(" *");

        }

        for (int i=1; i<=n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}