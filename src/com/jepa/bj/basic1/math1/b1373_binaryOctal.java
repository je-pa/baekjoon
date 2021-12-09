package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1373_binaryOctal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  input = br.readLine();
        StringBuilder sb= new StringBuilder();
        int len = input.length();
        for(int i=len; i>0;i-=3) {
            int x = Integer.parseInt(input.substring(i-3<0?0:i-3,i));
            sb.append( x == 0 ? 0 : (x%10 + ((x/10)%10*2) + (x/100*4)));
        }
        System.out.println(sb.reverse());
    }
}
