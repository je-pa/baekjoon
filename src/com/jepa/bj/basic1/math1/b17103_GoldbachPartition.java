package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b17103_GoldbachPartition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] decimals = new int[1_000_001];
        decimals[0]=1;
        decimals[1]=1;
        for(int i=2 ; i*i<1_000_001 ; i++){
            if(decimals[i]==0) {
                for (int j = i * i; j < 1_000_001; j += i) {
                    decimals[j] = 1;
                }
            }
        }
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t ; i++){
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            for(int j =2 ; j<=n/2 ; j++){
                if(decimals[j]==0&&decimals[n-j]==0){
                    result++;
                }
            }
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }
}
