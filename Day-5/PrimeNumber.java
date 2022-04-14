import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        // Important property of any no.
        // Agar kisi bhi no. ka factor hai then voh 1 se leke root n tak me mil hi jaayega
        // No need to search for factors after root n
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = sc.nextInt();
        sc.close();
        
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) // OR
        // for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("--------------------");
        System.out.println("isPrime: " + isPrime);
        System.out.println("--------------------");

    }
}
