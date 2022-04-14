import java.util.Scanner;

public class SwitchSt {
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the dayOfWeek");
        int dayOfWeek = sc1.nextInt();
        sc1.close();

        switch(dayOfWeek) {
            case 1:
                System.out.println("Hola, it's Sunday!");
                break;
            case 2: case 3:
                System.out.println("It's  work day!");
                break;
            // case 3:
            //     System.out.println("I'm at work!");
            //     break;
            case 4:
                System.out.println("Enjoying wid fam coz it wednesday!");
                break;
            case 5:
                System.out.println("Busy at work!");
                break;
            case 6:
                System.out.println("Weekends are close!");
                break;
            default:
                System.out.println("I don't know what day it is!");
            
        }

    



    }
}
