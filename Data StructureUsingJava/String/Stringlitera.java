/*1. String literal (Static Memory)
To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).  */

package String;

public class Stringlitera {
    public static void main(String[] args) {

        // String literal (Static Memory)
        String str1 = "Hello, World!";

        // Using new keyword (Heap Memory)
        String str2 = new String("Hello, World!");

        System.out.println("String Literal: " + str1);
        System.out.println("String Object: " + str2);

        // Immutable String in Java
        str1 = "New String"; // This creates a new string object
        System.out.println("Modified String Literal: " + str1);
    }
}
