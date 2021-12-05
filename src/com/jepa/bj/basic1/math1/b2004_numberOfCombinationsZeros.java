package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b2004_numberOfCombinationsZeros {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(
                Math.min(
                divisor(2,input[0])-divisor(2,input[1])-divisor(2,input[0]-input[1]),
                divisor(5,input[0])-divisor(5,input[1])-divisor(5,input[0]-input[1])
                )
        );
    }
    static int divisor(int n ,int x){
        int result =0;
        while(x>=n){
            x/=n;
            result+=x;
        }
        return result;
    }
}