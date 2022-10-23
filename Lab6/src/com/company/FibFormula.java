package com.company;

public class FibFormula implements FindFib{
    @Override
    public int calculate_fib(int inputint) {
        double squareRootOf5 = Math.sqrt(5);
        double phi = (1 + squareRootOf5)/2;
        int nthTerm = (int) ((Math.pow(phi, inputint) - Math.pow(-phi, -inputint))/squareRootOf5);
        return nthTerm;
    }
}
