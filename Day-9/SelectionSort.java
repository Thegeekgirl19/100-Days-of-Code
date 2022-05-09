public class SelectionSort {
    public static void main(String[] args) {
        
        int a[] = {6,5,4,3,2};
        int n = a.length;
        // {2,6,5,4,3}
        // {2,3,6,5,4}
        // {2,3,4,6,5}
        // {2,3,4,5,6}  --> (n-1) itrations

        for (int i=0; i<n-1; i++) { // n-1 iterations
            int minIndex = i;
            for (int j=i; j<n; j++) {
                if (a[j]<a[minIndex]) {
                    int temp = a[minIndex];
                    a[minIndex] = a[j];
                    a[j]=temp;
                }
            }
        }
        // printing sorted array
        for (int item: a) {
            System.out.print(item + " ");
        }

    }
}
