//public class
public class MethodOverLoading {
    public static void main(String[] args) throws Exception {
        int c = 34;
        float d = 52;
        System.out.println( maxOf(c,d));
    }

    /*
    Method Overloading is creating a method with exactly the same name but differet signature
    i.e. either change the data type of the arguments or change the no. of arguments
    the return type of a method does not contribute to its signature.
    So, even if the return type changes it means nothing
    */
    static int maxOf(int a, int b) {
        if (a>b) return a;
        else return b;
    }

    static int maxOf(int a, float b) {
        return 0;
    }
}


