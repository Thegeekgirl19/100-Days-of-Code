public class NestedIfElse {
    public static void main(String[] args) {

//      Finding the maximum number using nested if else
        int a = 27;
        int b = 14;
        int c = 4;
        /*
        int result = 0;

        
        if(a > b) {
            if (a > c) {
                result = a;  
            } else {
                result = c;
            }
        } else {
            if (b > c) {
                result = b;
            } else {
                result = c;
            }

        }

        System.out.println("------------------------");
        System.out.println("Max no. is: " + result); 
        System.out.println("------------------------");
`       */

//      Performing the same operation using ternary operator
        int result = (a > b) ? (a > c) ? a : c : (b > c) ? b : c; 
//      A bit difficult to understand this

        System.out.println("------------------------");
        System.out.println("Max no. is: " + result); 
        System.out.println("------------------------");
    }  
}
