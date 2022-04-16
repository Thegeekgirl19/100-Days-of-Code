import java.util.*;
public class FindingPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter no.: ");
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
           
            rev = rev*10 + lastDigit;    
            temp = temp / 10;

        }
        System.out.println("Reverse no. is: " + rev);

        if (num==rev) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }

    }
}
