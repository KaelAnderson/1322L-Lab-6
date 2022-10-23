package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number you want to find the Fibonacci Series for:");
    int inputnum = scan.nextInt();
    FibIteration iter = new FibIteration();
    FibFormula form = new FibFormula();
    System.out.println("Fib of 10 by iteration is: " + iter.calculate_fib(inputnum));
    System.out.println("Fib of 10 by formula is: " + form.calculate_fib(inputnum));
    }
}
