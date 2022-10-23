package com.company;

public class FibIteration implements FindFib {
    @Override
    public int calculate_fib(int inputint) {
        if (inputint == 1 || inputint == 2){
            return 1;
        }else {
            int num1 = 0;
            int num2 = 1;
            int num3 = 0;
            for (int i = 0; i < inputint; i++){
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
            return num1;
        }
    }
}
