package com.jepa.bj.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b6588_GoldbachConjecture {
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
        int n = Integer.parseInt(br.readLine());
        while(n!=0){
            for(int i =3 ; i<=n/2 ; i++){
                if(decimals[i]==0&&decimals[n-i]==0){
                    sb.append(n).append(" = ").append(i).append(" + ").append(n-i).append('\n');
                    break;
                }
            }
            n = Integer.parseInt(br.readLine());
        }
        System.out.println(sb);
    }
}
