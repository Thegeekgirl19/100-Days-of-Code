public class DataTypes {
    public static void main(String args[]) {
        
    /*
    Resulting data type after arithmetic operation

    Result = byte + short -> integer
    Result = short + integer -> integer
    Result = long + float -> float
    Result = integer + float -> float
    Result = character + integer -> integer
    Result = character + short -> integer
    Result = long + double -> double
    Result = float + double -> double

    */
    
        
    //Increment, decrement operators
      int x=10;
      //int y=25;

      System.out.println(x++); 
      /*
      here we are telling the compiler to 
      first use the current value of x and then increment
      it so we will be getting 10 as output
      */
      
     System.out.println(x); //-->11
     System.out.println(++x); //--> 12
     
     char ch = 't';
     System.out.println(++ch);
    }
}