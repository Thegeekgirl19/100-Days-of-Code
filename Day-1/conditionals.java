import java.util.*;

public class conditionals {
    public static void main(String[] args){

    
        System.out.print("Please enter your button no.: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // System.out.println("Your input age was " + a)
        // if(a<18) {
        //     System.out.println("Not an adult");
        // } else {
        //     System.out.println("You are an adult");
        // }
        switch (a) {
            case 1:
            System.out.println("Hello");
            break; 
            case 2:
            System.out.println("Namaste");
            break;
            case 3:
            System.out.println("Bonjour");
            break;
            default: 
            System.out.println("Invalid button");
        }

    }
}
