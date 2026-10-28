/**
 *  Java program top store float.
 */
package com.mycollections;

import java.util.Stack;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Stack<Float> myStack = new Stack<>();

        // Add.
        myStack.push(123F);
        myStack.push(456F);
        myStack.push(789F);

        // Remove and print last element.
        System.out.println(myStack.pop()); // Output: 789.0

        // Get last element.
        System.out.println(myStack.peek()); // Output: 456.0

        // Remove all.
        myStack.clear();

    }
}