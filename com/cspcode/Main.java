package com.cspcode;

import java.time.LocalDate;

public class Main { // The Main class is the main entry point for any Java program

  public static void main(String[] args) { // main is a method in the Main class, it takes an array of Strings[] as arguments(args).
    System.out.println("Hello, world!"); // System.out.println(); prints to the console.

    /* ========================================================================================== */
    /* Primitive Data Types: basic types of data */
    byte numberInBytes = -128;        // 1 byte.  Minimum value of -128, maximum value of 127(inclusive).
    short shortNumber = 32_767;       // 2 bytes. Minimum value of -32768, max of 32767.
    int number = 100;                 // 4 bytes. Integer, Max value of 4,294,967,295.
    long longNumber = 1_000_000L;     // 8 bytes. Max value of 18 quintillion+.
    float floatingPointNumber = 0.0F; // 4 bytes. Floats are used for 7-digit decimal numbers, and require less memory.
    double decimalNumber = 100.01;    // 8 bytes. 15-digit Decimal numbers.
    char letter = 'A';                // 2 bytes. Single 16-bit unicode character, with single-quotes.
    boolean yes = true;               // 1 bit.   True/false values only.
    boolean no = false;

    /* Reference Data Types: instantiable class as well as arrays */
    String name = new String("CspCode");                                      // Sequence of chars.
    LocalDate now = LocalDate.now();                                                  // LocalDate object, with additional methods.
    String[] cars = { "Volvo", "Subaru", "BMW", "Nissan" };                           // Array of strings.
    String[][] multiDimensionalArrayOfStrings = { { "Chevy", "Ford" }, { "Lexus" } }; // Multi-dimensional Array.
    int[] numbers = { 1, 2, 3, 4, 5 };                                                // Array of integers.
    int[][] multiDimensionalArrayOfNumbers = { { 1, 2, 3 }, { 4, 5, 6 } };            // Multi-dimensional Array.

    /* ========================================================================================== */
    /* Reference Types explained
      When you run main(), this will output:
      :  Before changing Meelo
      :  Meelo :: Meelo
      :  After changing Meelo
      :  Master Meelo :: Master Meelo
      This is because 'line 44' is altering the original memory address, therefore the reference will be updated to reflect this change.
      Conversely, were you to change 'line 44' to 'Tenzen.name = "Tenzen"', this will change the original reference, and 'line 49' will output:
      :  Master Tenzen :: Master Tenzen
      Because the reference to the original was updated.
    */
    Person Meelo = new Person("Meelo");
    Person Tenzen = Meelo;

    System.out.println("Before changing Meelo.name");
    System.out.println(Meelo.name + " :: " + Tenzen.name);
//    Meelo.name = "Master Meelo";
    Tenzen.name = "Master Tenzen";
    System.out.println("After changing Meelo.name");
    System.out.println(Meelo.name + " :: " + Tenzen.name);

    /* ========================================================================================== */
    /* String Class
    *  Declaration: String(<Class>) nameOfVariable = "Object of type String";
    * */
    char a = 'A';
    /* char b = 'Bb'; <-- This will cause an error, because the 'char' data type only allows you to have a single value! */
    String b = "Bb";
    String avatar = new String("Korra");
    System.out.println(avatar.toUpperCase()); // .toUpperCase() method used from the String class' list of methods.
    System.out.println(avatar.toLowerCase());
    System.out.println(avatar.charAt(0)); // .charAt(@Range int index); Returns the char value at the specified index.
    System.out.println(avatar.contains("or")); // .contains checks if the specific string exists in the variable.
  }

  /* ========================================================================================== */
  /*  */
  static class Person {
    String name;
    Person(String name) {
      this.name = name;
    }
  }
}

/*
==================================================================================================
 * Running(Compiling) a Java program from the terminal *
 --------------------------------------------
  From the 'src' directory
  First, "$ cd src/<package>" into the package you want to invoke, and run "$ javac Main.java"
  This will create the 'Main.class' file
  Second, from the same directory, run "$ java <fully qualified name>"
  e.g.
  "$ java com.cspcode.Main" <-- this invokes the 'Main.class' file, not the 'Main.java' file
==================================================================================================
*/
