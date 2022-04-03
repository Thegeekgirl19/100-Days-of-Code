public class PrecedenceAndAssociativity {
    public static void main(String args[]) {
      int x=15;
      int y=5;
      int z=5;
      //int rs=x+y-x*z; --> 2
      int rs = x*y/z-x/z%y; 
      /*
      Highest precedence goes to * , % and /. They are then evaluated on the basis
      of left to right associativity
      
      rs = 75/z-x/z%y
           15-x/z%y
           15-3%y
           15-3 --> 12
      */
      

      System.out.println(rs);
      
    }
}