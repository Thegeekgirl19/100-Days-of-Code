import java.util.Scanner;

public class Chapter2PracticeSet {
    public static void main(String[] args) {
        /*
        Q2. Write a java program to encrypt a grade by adding 
        8 to it. Decrypt it to show the correct grade.
        */
        
        Scanner S = new Scanner(System.in);
        
        System.out.println("Please enter your grade: ");
        char grade = S.next().charAt(0);
        
        //encrypting
        grade =(char)(grade + 8);
        System.out.println("Encrypted grade: "+grade);
        
        //decrypting
        grade =(char)(grade - 8);
        System.out.println("Decrypted grade: "+ grade);
        System.out.println("------------------------");
        
        /*
        Q3. Use comparison operators to find out whether a given
        number is greater than the user entered number or not.
        */
        System.out.println("plese enter your num: ");
        int num = S.nextInt();
        if(num>10){
            System.out.println("limit exceeded");
        } else {
            System.out.println("You are good to go!!");
        }
    }
}
