package org.howard.edu.lsp.midterm.question2;

/* 
Given:
You are tasked with creating a utility class Calculator that provides functionality to sum numbers. The class should be able to handle different input types, including:
•	Two integers. (2.5 pts.)
•	Two double values. (2.5 pts.)
•	An array of integers. (5 pts.)
Task:
1.	Implement the Calculator class with a method sum() that is overloaded to handle the following scenarios:
o	Sum two integers.
o	Sum two double values.
o	Sum all elements in an array of integers.
2.	Each version of the sum() method should return the appropriate result based on the input type.
3.	Implement your sum() method(s) to be static so that they can be invoked without instantiating an instance of Calculator.
4.	Create a CalculatorDriver class that contains the following:
System.out.println(Calculator.sum(5, 10));            // Output: 15 (sum of two integers)
System.out.println(Calculator.sum(3.5, 7.8));        // Output: 11.3 (sum of two doubles)
System.out.println(Calculator.sum(new int[]{1, 2, 3, 4, 5})); // Output: 15 (sum of array of integers)
*/

class Calculator {
    public static int sum(int a, int b) { return a + b; }
    public static double sum(double a, double b) { return a + b; }
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        return total;
    }
}

class CalculatorDriver {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(5, 10));                   // Output: 15
        System.out.println(Calculator.sum(3.5, 7.8));                // Output: 11.3
        System.out.println(Calculator.sum(new int[]{1, 2, 3, 4, 5}));// Output: 15
    }
}
