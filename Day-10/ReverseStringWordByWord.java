import java.util.*;
public class ReverseStringWordByWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        String str = sc.nextLine();
        // sc.nextLine();
        sc.close();

        String arr[]=str.split(" ");
        System.out.println("output:");
        // for (String item: arr) {
        //     System.out.println(item);
        // }

        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
