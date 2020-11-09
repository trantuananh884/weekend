package com.company;

public class checkprime {
    public static boolean check(int N) {
        Boolean result = false;
        if (N < 2){
            result = false;
        }
        if (N == 2){
            result = true;
        }
        for (int i = 2; i < N ; i++) {
            if (N % i == 0){
                result = false;
                break;
            }
            result = true;
        }
        return result;
    }
}
