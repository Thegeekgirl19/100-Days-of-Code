import java.util.Scanner;
public class SumCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter value of b: ");
        int b = sc1.nextInt();
        int c = a+b;
        System.out.println("Sum of your no.s is: " + c);
    }
}