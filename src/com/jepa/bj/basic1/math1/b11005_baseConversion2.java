package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b11005_baseConversion2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[]  input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb= new StringBuilder();
        while(input[0]!=0){
            int remainder = input[0]%input[1];
            sb.append((char)(remainder>9 ? (remainder-10+'A') : (remainder+48)));
            input[0]=input[0]/input[1];
        }
        System.out.println(sb.length()!=0?sb.reverse():0);
    }
}
