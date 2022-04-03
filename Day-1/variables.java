import java.util.*;

public class variables {
    public static void main(String[] args) {
        // String newString = "Trishala";
        // System.out.println(newString);
        
        // int a= 15;
        // int b= 10;
        // int sum = a+ b;
        // System.out.println(sum);

        System.out.println("Please enter your input: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Your inputs are a=" + a + " b=" + b);

        int sum = a + b;
        System.out.println("Sum of your inputs is " + sum);
        /*
        Rules for declaring a variable name

        We can choose a name while declaring a Java variable if the following rules are followed:

        1. Must not begin with a digit. (E.g., 1arry is an invalid variable)
        2. Name is case sensitive. (Harry and harry are different)
        3. Should not be a keyword (like Void).
        4. White space is not allowed. (int Code With Harry is invalid)
        5. Can contain alphabets, $character, _character, and digits if the other conditions are met.
        
        Data Types --> Primitive (intrinsic)
                   --> Non Primitive (derived)
                   
        Primitive Data Types (8 types)
        1. Byte -- 1 byte size
        2. Short -- 2 byte size
        3. Int -- 4 byte size
        4. Float -- 4 byte size
        5. Long -- 8 byte size (used for big int)
        6. Double -- 8 byte size (used for high preceision decimal values)
        7. Char -- 2 byte size
        8. Boolean -- size depends on JVM

        */

    }
}
