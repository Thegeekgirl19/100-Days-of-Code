import java.util.*;
public class LogOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = sc.nextInt();
        sc.close();
        float res = 0;

        for (float i = 1; i<=n; i++) {
            if (i%2 == 0) {
                res -= 1/i;  
            } else {
                res += 1/i;
            }
        }
        System.out.println(res);
    }
}
