package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b17087_hideAndSeek6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ns = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i=0 ; i<ns[0] ; i++){
            a[i]=Math.abs(a[i]-ns[1]);
        }
        int gcd = a[0];
        for(int i=1 ; i<ns[0] ; i++){
            gcd=gcd(gcd,a[i]);
        }
        System.out.println(gcd);
    }
    static int gcd(int x, int y){
        if(x == 0 ) return y;
        else return gcd(y%x,x);
    }
}
