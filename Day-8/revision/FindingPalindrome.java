import java.util.*;
public class FindingPalindrome {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input ur no.");
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        int rev = 0;

        while (temp>0) {
            int lastDigit = temp % 10;
            rev = rev*10 + lastDigit;
            temp /= 10;
        }

        if (rev == num) {
            System.out.println("Congratulations! You have enetred a palindrome");
        } else {
            System.out.println("uh oh! that was not a palindrome");
        }
    }
}
