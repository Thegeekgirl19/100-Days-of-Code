import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int a = sc.nextInt();
        System.out.print("Please enter the power: ");
        int b = sc.nextInt();
        sc.close();

        int res = 1;

        for (int i = 0; i < b; i++) {
            res = res * a;

        /* 
        if a = 3 and b = 4 then 
        i:1  res = 3*3
        i:2  res = 3*3*3
        i:3  res = 3*3*3*3
        */
        }
        System.out.println("Result is: " + res);
    }
}
