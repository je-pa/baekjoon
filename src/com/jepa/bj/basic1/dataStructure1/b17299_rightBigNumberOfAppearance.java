package com.jepa.bj.basic1.dataStructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class b17299_rightBigNumberOfAppearance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();
        int[] count = new int[1_000_001];
        for(int i=0; i<N ; i++){
            count[a[i]]++;
        }
        Stack<Integer> st = new Stack<>();

        for(int i=0 ; i<N ; i++){
            while (!st.empty() && count[a[st.peek()]] < count[a[i]]) {
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
