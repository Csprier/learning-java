package com.cspcode;

import java.time.LocalDate;

public class Main { // The Main class is the main entry point for any Java program

  public static void main(String[] args) { // main is a method in the Main class
    System.out.println("Hello, world!"); // System.out.println(); prints to the console

    /* Primitive Data Types */
    byte numberInBytes = -128;        // 1 byte.  Minimum value of -128, maximum value of 127(inclusive).
    short shortNumber = 32_767;       // 2 bytes. Minimum value of -32768, max of 32767.
    int number = 100;                 // 4 bytes. Integer, Max value of 4,294,967,295.
    long longNumber = 1_000_000L;     // 8 bytes. Max value of 18 quintillion+.
    float floatingPointNumber = 0.0F; // 4 bytes. Floats are used for 7-digit decimal numbers, and require less memory.
    double decimalNumber = 100.01;    // 8 bytes. 15-digit Decimal numbers.
    char letter = 'A';                // 2 bytes. Single 16-bit unicode character, with single-quotes.
    boolean yes = true;               // 1 bit.   True/false values only.
    boolean no = false;

    /* Reference Data Types */
    String name = new String("CspCode"); // Sequence of chars.
    LocalDate now = LocalDate.now();             // LocalDate object, with additional methods.
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
