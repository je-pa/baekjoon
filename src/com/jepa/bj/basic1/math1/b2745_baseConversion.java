package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b2745_baseConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = 1;
        int result = 0;
        for(int i =input[0].length()-1 ; i>=0  ; i--){
            int x =input[0].charAt(i);
            result += (x<'A'? x-'0': x-'A'+10)*n;
            n*=Integer.parseInt(input[1]);
        }
        System.out.println(result);
    }
}
