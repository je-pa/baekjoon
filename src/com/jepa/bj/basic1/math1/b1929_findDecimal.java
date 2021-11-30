package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1929_findDecimal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = arr[1];
        int[] decimalsArr = new int[max+1];
        decimalsArr[0]=1;
        decimalsArr[1]=1;
        for(int i=2 ; i*i<max+1 ; i++){
            if(decimalsArr[i]==0) {
                for (int j = i * i; j < max + 1; j += i) {
                    decimalsArr[j] = 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=arr[0] ; i<max+1 ; i++){
            if(decimalsArr[i]==0) sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
