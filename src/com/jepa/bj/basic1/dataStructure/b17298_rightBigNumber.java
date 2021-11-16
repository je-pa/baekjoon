package com.jepa.bj.basic1.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class b17298_rightBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1 ; i<N ; i++){
            while (!st.empty() && a[st.peek()] < a[i]) {
                a[st.pop()] = a[i];
            }
            st.push(i);
        }
        while(!st.empty()){
            a[st.pop()]=-1;
        }
        for(int i=0; i<N ; i++){
            sb.append(a[i]+" ");
        }
        System.out.println(sb);
    }
}
