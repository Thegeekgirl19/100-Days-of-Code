import java.util.*;
public class Fibbonacci {
    public static void main(String[] args) {
       /*
       Printing Fibonacci series --> 0 1 1 2 3 5 8 13 21...
       (n)th = (n - 1)th + (n - 2)th
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = sc.nextInt();
        sc.close();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " "); 
        // printed first two digits of the series

        for (int i = 0; i < n-2; i++) {
            int res = a + b;
            System.out.print(res + " ");
            a = b;
            b = res;
        }

    }
}
