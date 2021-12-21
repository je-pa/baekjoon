package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class b11576_baseConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] notation = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();//0: future , 1: now
        int m = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = 1;
        int decimal = 0;
        for(int ipIdx=m-1; ipIdx>=0 ; ipIdx--) {
            decimal += input[ipIdx] * n;
            n *= notation[0];
        }
        Stack<Integer> st = new Stack<>();
        while(decimal!=0){
            st.push(decimal%notation[1]);
            decimal/=notation[1];
        }
        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop()).append(" ");
        }
        System.out.println(sb);
    }
}
