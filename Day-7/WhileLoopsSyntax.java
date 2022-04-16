public class WhileLoopsSyntax {
    public static void main(String[] args) throws Exception {
        // While loops syntax
        int  n = 5;  // Initialized
        // while(n > 0) {  // Condition
        //     System.out.print(n + " ");
        //     n--; // Re-initialisation
        // }
        // System.out.println();

        do {
            System.out.print(n + " ");
            n--; // Re-initialisation
        } while (n > 0); //condition
        System.out.println();

        // in this case the loop is executed atleast once even if the while condition is not satisfied
        // First the loop is executed and then the condition is checked & if it comes out to be true then the process goes once
        
    }
}
