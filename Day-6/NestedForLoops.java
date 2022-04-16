import java.util.*;

public class NestedForLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter first table u want to print: ");
        int a = sc.nextInt();
        System.out.print("please enter the last table u want to print: ");
        int b = sc.nextInt();
        sc.close();
        int res = 1;      
        for (int j = a; j<=b; j++) {
            System.out.print(j+ "'s table: ");
            for (int i = 1 ; i <=10; i++) {

                res = i*j;
                System.out.print(  res + " ");
            }
            System.out.println();
        }
    }
}