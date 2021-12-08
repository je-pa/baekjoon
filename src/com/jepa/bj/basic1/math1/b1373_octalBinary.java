package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1373_octalBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  input = br.readLine();
        StringBuilder sb= new StringBuilder();
        int len = input.length();
        int first = input.charAt(0)-'0';
        sb.append((first/4*100)+((first%4)/2*10)+(first%2));
        for(int i=1; i<len;i++) {
            int x = input.charAt(i)-'0';
            sb.append(x/4).append((x%4)/2).append(x%2);
        }
        System.out.println(sb);
    }
}
