package com.challenge105;

import java.util.concurrent.Callable;

public class factorialCalculator implements Callable<Integer> {
    final private int factorial;

    factorialCalculator(int factorial) {
        this.factorial = factorial ;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);

        int result = 1 ;
        if (factorial == 0 || factorial == 1 ){
            return 1 ;
        }else {
            for (int i = 1; i <= factorial ; i++) {
                result *= i ;
            }
            return result;
        }
    }
}
