import java.util.*;
public class SeriesSum {
    public static void main(String[] args) {
        /*
        Here we have to calculate the sum of series
        --> 1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 +...+ 1/n
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = sc.nextInt();
        sc.close();

        float sum = 0;
        for (float i = 1; i <= n; i++) {
            sum += 1/i;
        }
        System.out.println(sum);
    }
}
