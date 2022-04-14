    /*
    While programming we should always follow DRY rule
    i.e., DO NOT REPEAT YOURSELF
    */
import java.util.*;

public class ForLoops {
    public static void main(String[] args) {
        // printing no.s in reverse order
        // for(int i = 100; i > 0; i--) {
        //     System.out.println(i);
        // }

        // printing even no.s
        // for(int i = 0; i<=100 ; i+=2) {
        //     System.out.println(i);
        // }

        // printing sum of n no.s
        // int sum = 0;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter value of n: ");
        // int n = sc.nextInt();
        // sc.close();

        // for (int i = 1; i <= n; i++) {
        //     sum = sum + i;
        // }
        // System.out.println("------------------------");
        // System.out.println("Sum is " + sum);
        // System.out.println("------------------------");

        // Printing tables of a given no.
        // System.out.print("Please enter which table u want to display: ");
        // int tableOf = sc.nextInt();
        // sc.close();
        // for (int i = 1; i <= 10; i++) {
        //     int y = tableOf * i;
        //     System.out.println(tableOf + " x " + i + " = " + y);
        // }

        // Printing factorial of a given no.
    
        
        System.out.println("Please enter the number");
        int n = sc.nextInt();
        sc.close();
        int res = 1;

        for (int i = n; i >= 1; i--) {
            res = res * i;
        }
        System.out.println("-----------------------------");
        System.out.printf("factorial of %d is %d \n",n,res);
        System.out.println("-----------------------------");
        

    }
}
