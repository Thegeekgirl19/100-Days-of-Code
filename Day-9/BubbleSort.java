import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the size of your array?");
        int size = sc.nextInt();
        System.out.println("Please input the array element");
        int array[] = new int[size];    // array declaration
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();    //array initialization
        }

        sc.close();

        // suppose array = {6,5,3,1} --> SIZE = 4
        // ITERATION 1: {5,3,1,6}
        // ITERATION 2: {3,1,5,6}
        // ITERATION 3: {1,3,5,6}

        //applying check for optimising
        boolean sorted = true;

        for(int i = 0; i < size-1; i++) {   // this loop is for no. of iterations
            for (int j = 0; j < size-1-i; j++) { // this loop is for SWAPPING
                
                if (array[j+1] < array[j]) {
                    
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        System.out.println("Printing results...");
        // for (int i= 0; i < size; i++) {
        //     System.out.print(array[i] + " ");
        // }

        for(int item: array) {      // using for-each loop
            System.out.print(item + " ");
        }
    }
}