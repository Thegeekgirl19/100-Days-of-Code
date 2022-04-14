public class BitwiseOp {
    public static void main(String[] args) {
        /* 
        Bitwise operators --> &,|,>>, <<
        Let's look at them one by one

        AND operations --> &
        Truth table
        X   Y--> &
        0   0   0
        0   1   0
        1   0   0
        1   1   1       
        i.e., if any of the i/p is false then the o/p will be false  
        
        a--> 100
        b--> 101
        
        c--> 100 --> 4


        OR operations --> |
        Truth table
        X   Y--> |
        0   0   0
        0   1   1
        1   0   1
        1   1   1       
        i.e., if any of the i/p is true then the o/p will be true  

        a--> 100
        b--> 101

        c--> 101 --> 5


        Right shift operations --> >>
        suppose we have the following
        1101 then in first right shift it will become 0110
        1101(13) --> 0110(6) --> 0011(3) --> 0001(1) --> 0000(0) --> 0000(0)
        as we can se in the above example that when we apply shift operations --> the no.s are divide by 2 (floor value obtained)


        Right shift operations --> <<
        suppose we have the following
        0100(4) --> 1000(8) --> 0001 0000(16) --> 0010 0000(32) --> this goes on
        as we can se in the above example that when we apply left shift operations --> the no.s are multiplied by 2
        
        */

        int a = 4;
        //int b = 5;

        int c = a << 2;
        System.out.println(c);
    }
}