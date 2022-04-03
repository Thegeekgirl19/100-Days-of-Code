package com.learningjava; //packages are used to group similar classes

import java.util.Scanner; //importing Scanner class
public class Main { 
    // In Java, every program must contain a class.
    // The filename and name of the class should be the same.
    // Here, we've created a class named "Main".
    // It is the entry point to the application.

    public static void main(String args[]) {
      // This is the main() method of java program, every program must contain a main method.
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter your name: ");
      String n=sc.nextLine();
      System.out.println("Hola peeps! I am " + n);
    }
}

/*
Naming Conventions

    For classes, we use Pascal Convention. The first and Subsequent characters from a word are capital letters (uppercase).
    Example: Main, MyScanner, MyEmployee, CodeWithHarry

    For functions and variables, we use camelCaseConvention. Here the first character is lowercase, and the subsequent characters are uppercase like myScanner, myMarks, CodeWithHarry

*/
