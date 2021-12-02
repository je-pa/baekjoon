package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1676_numberOfFactorialZeros {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count =0;
        for(int i=5; i<=n ; i+=5){
            int x = i;
            while(x!=0){
                if(x%5!=0) break;
                count++;
                x/=5;
            }
        }
        System.out.println(count);
    }
}
