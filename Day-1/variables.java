import java.util.*;

public class variables {
    public static void main(String[] args) {
        // String newString = "Trishala";
        // System.out.println(newString);
        
        // int a= 15;
        // int b= 10;
        // int sum = a+ b;
        // System.out.println(sum);

        System.out.println("Please enter your input: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Your inputs are a=" + a + " b=" + b);

        int sum = a + b;
        System.out.println("Sum of your inputs is " + sum);

    }
}
