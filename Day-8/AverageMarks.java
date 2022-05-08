import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pls enter the no. of students: ");
        int num = sc.nextInt();
        int sum = 0;
        int marks[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter marks of student" + i + " ");
            marks[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < num; i++) {
            sum += marks[i];
        }
        sum = sum / num;
        System.out.println("Average marks: " + sum);

    }
}
