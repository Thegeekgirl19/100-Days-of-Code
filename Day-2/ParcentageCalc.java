import java.util.Scanner;
public class ParcentageCalc {
    public static void main(String args[]) {
        System.out.println("CBSE Board Percentage Calculator");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your marks in subject 1:");
        float sub1 = sc.nextFloat();
        System.out.println("Please enter your marks in subject 2:");
        float sub2 = sc.nextFloat();
        System.out.println("Please enter your marks in subject 3:");
        float sub3 = sc.nextFloat();
        System.out.println("Please enter your marks in subject 4:");
        float sub4 = sc.nextFloat();
        System.out.println("Please enter your marks in subject 5:");
        float sub5 = sc.nextFloat();
        float sum = sub1+sub2+sub3+sub4+sub5;
        
        System.out.println("Please enter max possible marks (aggregate):");
        float total = sc.nextFloat();
        
        float rs = (sum * 100) / total;
        System.out.println("Your percentage is: " + rs);
        
        
    }
}