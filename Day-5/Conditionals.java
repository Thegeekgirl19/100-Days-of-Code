public class Conditionals {
    public static void main(String[] args) {
        /*
        Shorthand If..Else (ternary op)
        variable = condition ? expressionTrue : expressionFalse;
        */

        int a = 15;
        int b = 19;

        int maxOfBothNumbers = a>b ? a : b;
        
        System.out.println("Max of both no.s is: " + maxOfBothNumbers);
    }
}
