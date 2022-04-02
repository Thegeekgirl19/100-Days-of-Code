import java.util.Scanner;
public class ValidatingInput {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      boolean bool = sc.hasNextInt();

      System.out.println(bool);
    }
}