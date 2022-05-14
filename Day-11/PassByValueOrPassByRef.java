public class PassByValueOrPassByRef {
    public static void main(String[] args) throws Exception {
        // int c = 3;
        // int d = 4;
        // swap(c, d);
        // System.out.println(c + " " + d );     
        
        Dog c = new Dog();
        c.legs = 3;
        Dog d = new Dog();
        d.legs = 8;
        swap( c, d );
        System.out.println(c.legs + " " + d.legs + " ");
        // changeDog(c);
        // System.out.println(c.legs);
    }


    // for primitive types
    static void swap (int a , int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // for non-primitive types
    static void swap(Dog a, Dog b) {
        Dog temp = a ;
        a = b ;
        b = temp ;
        // We are actually swapping the values here
        // int temp = a.legs ;
        // a.legs = b.legs ;
        // b.legs = temp ;
    }

    static void changeDog(Dog dog) {
        dog.legs = 6;
    }

}
class Dog {
    int legs;
}
