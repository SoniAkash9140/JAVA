public class Demo{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}

// Line 1: public class Demo

// public:
// This is an access modifier.
// It means the Demo class is accessible from anywhere in the program or other programs.
// If the class is not declared as public, it will have package-private access by default, meaning it will only be accessible within the same package.

// class:
// This is a keyword in Java used to define a class.
// A class is a blueprint for creating objects and contains fields (variables) and methods (functions) to define the behavior and state of the objects.

// Demo:
// This is the name of the class.
// The class name must match the filename (Demo.java) because the class is declared as public.
// If the filename and class name do not match, the program will not compile.


// Line 2: public static void main(String[] args)
// public:
// This is an access modifier.
// It means the main method is accessible from anywhere in the program.
// The main method must be public because it is called by the Java Virtual Machine (JVM) to start the program.

// static:
// This keyword means the method belongs to the class, not to an instance of the class.
// You don't need to create an object of the class to call the main method.
// The JVM can directly call this method without creating an object.

// void:
// This is the return type of the method.
// It means the main method does not return any value.

// main:
// This is the name of the method.
// The JVM looks for this specific method as the entry point of the program.
// The method signature must be exactly public static void main(String[] args)
//  for the program to run.

// String[] args:
// This is the parameter of the main method.
// It is an array of String objects.
// It allows the program to accept command-line arguments when it is executed.
// For example, if you run java HelloWorld arg1 arg2, the args


// Line 3: System.out.println("Hello, World!");
// System:
// This is a built-in Java class from the java.lang package.
// It provides access to system-level resources, such as standard input, output, and error streams.

// out:
// This is a static member of the System class.
// It represents the standard output stream (usually the console).
// It is an instance of the PrintStream class.

// println:
// This is a method of the PrintStream class.
// It prints the specified text to the console and then moves the cursor to the next line (adds a newline character at the end).

// "Hello, World!":
// This is a string literal.
// It is the text that will be printed to the console.
// The text is enclosed in double quotes ("), which is required for string literals in Java.

// ;:
// This is a statement terminator in Java.
// It marks the end of the statement.


