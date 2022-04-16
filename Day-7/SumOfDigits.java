import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the no: ");
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            
            int lastDigit = temp % 10;
            
            sum += lastDigit;
            
            temp = (int) temp / 10;
            
        }

        System.out.println(sum);
    }
}
