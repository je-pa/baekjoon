package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1934_LeastCommonMultiple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<len ; i++){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sb.append(lcm(arr[0],arr[1],gcd(arr[0],arr[1]))).append('\n');
        }
        System.out.println(sb);
    }
    static int gcd(int x, int y){
        if(x == 0 ) return y;
        else return gcd(y%x,x);
    }
    static int lcm(int x, int y , int gcf){
        return x/gcf*y;
    }
}
