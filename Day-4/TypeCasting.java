//package typeCasting;

public class TypeCasting{
    public static void main(String[] args) {
        // byte b = 4;
        // int i = b;
        // System.out.println(b);
        // This was automatic typecasting (Widening)
        
        double myDouble = 3.14141;
        int myInt = (int) myDouble; 
        
        System.out.println(myInt); 
        // 3 will be printed here coz java always prints the floor value similar to greatest integer function
        System.out.println(myDouble);
        // this was manual typecasting (narrowing)
    }
}