class Cat {
    int eyes,legs;
    boolean hasFur;
    String name;

    public void purr(){ //method
        System.out.println("My cat " + name + " is purring!");
    }

    public void description() {
        System.out.println("My cat " + name + " has " + legs + " legs and " + eyes + " eyes");
    }

}



public class ObjectAndClasses {
    public static void main(String[] args) throws Exception {
        Cat cat1 = new Cat();
        cat1.name = "Tommy";
        cat1.legs = 4;
        cat1.eyes = 2;

        cat1.purr();
        cat1.description();

        System.out.println();

        Cat cat2 = new Cat();
        cat2.name = "Hougsy";
        cat2.legs = 3;
        cat2.eyes = 2;

        cat2.purr();
        cat2.description();
    }
}