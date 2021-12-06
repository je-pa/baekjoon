package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b9613_GCDsum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<t ; i++){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            long sum=0;
            for(int j=1 ; j<arr[0] ;j++){
                for(int z=j+1 ; z<=arr[0] ; z++){
                    sum+=gcd(arr[j],arr[z]);
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
    static int gcd(int x, int y){
        if(x == 0 ) return y;
        else return gcd(y%x,x);
    }
}
