import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Plese enter first operand: ");
        int a = scanner.nextInt();

        System.out.print("Plese enter second operand: ");
        int b = scanner.nextInt();

        System.out.print("Plese enter the operator: ");
        scanner.nextLine();
        char operator = scanner.nextLine().charAt(0);
        scanner.close();
        
        int result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("You have entered invalid operand");
        }
        System.out.println("Result: " + result);
    }
}
