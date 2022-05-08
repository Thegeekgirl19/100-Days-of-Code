import java.util.*;
public class fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input number: ");
        int n = sc.nextInt();
        sc.close();
            int a = 0;
            int b = 1;
        if (n>0) {
            System.out.print(a + " " + b + " ");
        } else {
            System.out.println("pls enter a valid no.");
        }
        
        if (n>2) {
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
        


    }
}