package com.jepa.bj.basic1.dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b1935_postfix2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] cArr = br.readLine().toCharArray();
        Stack<Double> stack = new Stack<>();
        double[] A_Z= new double[N];
        for(int i=0;i<N;i++){
            A_Z[i]=Double.parseDouble(br.readLine());
        }

        for(char c : cArr){
            if(c<65||90<c){
                stack.push(calculate(stack.pop(),stack.pop(),c));
                continue;
            }
            stack.push(A_Z[c-'A']);
        }
        System.out.printf("%.2f",stack.pop());
    }
    static double calculate(double x, double y, char c){
        switch (c){
            case '+':
                return x+y;
            case '-':
                return y-x;
            case '*':
                return x*y;
            case '/':
                return y/x;
        }
        return 0;
    }
}
