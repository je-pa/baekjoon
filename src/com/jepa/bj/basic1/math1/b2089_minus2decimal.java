package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2089_minus2decimal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  input = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        while(input!=0){
            sb.append(Math.abs(input%2));
            input=(int)Math.ceil((double) input/-2);
        }
        System.out.println(sb.length()!=0?sb.reverse():0);
    }
}
